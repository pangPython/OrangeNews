package cn.edu.bzu.group12.orangenews.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;


/**
 * @author pangPython
 *	用户数据库操作
 */
public class UserDao extends BaseDao{
	Logger log = Logger.getLogger(UserDao.class) ;

	//插入User到数据库
	public int add(User user) {
		//insert into user values('pwd','user_name',1,'tel','email');
		String sql = "insert into user(pwd,user_name,user_sex,tel,email) values('"+user.getPwd()
						+"','"+user.getUser_name()
						+"',"+user.getUser_sex()
						+",'"+user.getTel()
						+"','"+user.getEmail()
						+"')"; 
		try {
			
			return this.getStat().executeUpdate(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	public User get(int user_id) throws SQLException{
		String sql = "select * from user where user_id = "+user_id;
		ResultSet rs = this.getStat().executeQuery(sql);
		User user = new User();
		user.setUser_id(user_id);
		while (rs.next()) {
			user.setUser_name(rs.getString("user_name"));
			user.setUser_sex(rs.getInt("user_sex"));
			user.setTel(rs.getString("tel"));
			user.setEmail(rs.getString("email"));
			user.setPwd(rs.getString("pwd"));
		}
		return user;
	}
	
	public User getUserByNameAndPwd(String user_name,String user_pwd) throws SQLException{
		User user = new User();
		String sql = "select * from user where user_name = '"+user_name+"' and pwd = '"+user_pwd+"'";
		ResultSet rs = this.getStat().executeQuery(sql);
		while (rs.next()) {
			user.setUser_id(rs.getInt("user_id"));
			user.setUser_name(user_name);
			user.setPwd(user_pwd);
			user.setEmail(rs.getString("email"));
			user.setUser_sex(rs.getInt("user_sex"));
			user.setTel(rs.getString("tel"));
		}
		return user;
	}

	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		return null;
	}
	
		//	SELECT LAST_INSERT_ID();
		public int getLastInsertId(String table_name) throws SQLException{
			
			String sql = "SELECT MAX(user_id) AS user_id FROM USER";
			
			ResultSet rs = this.getStat().executeQuery(sql);
			while (rs.next()) {
				log.debug("返回了数据库中的结果！");
				return rs.getInt("user_id");
				
			}
			log.debug("返回了0！");
			return 0;
			
		}
	
	
	
}
