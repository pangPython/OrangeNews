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
	User user = new User();
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
		
		user.setUser_id(user_id);
		while (rs.next()) {
			user = (User) RS2Obj(rs, new User());
		}
		return user;
	}
	
	public User getUserByNameAndPwd(String user_name,String user_pwd) throws SQLException{
		String sql = "select * from user where user_name = '"+user_name+"' and pwd = '"+user_pwd+"'";
		ResultSet rs = this.getStat().executeQuery(sql);
		while (rs.next()) {
			user = (User) RS2Obj(rs, new User());
		}
		return user;
	}

	//继承自BaseDao抽象方法
	//把数据库查询的ResultSet转换成User对象
	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		User user_obj = (User)obj;
		user_obj.setUser_id(rs.getInt("user_id"));
		user_obj.setUser_name(rs.getString("user_name"));
		user_obj.setPwd(rs.getString("pwd"));
		user_obj.setEmail(rs.getString("email"));
		user_obj.setUser_sex(rs.getInt("user_sex"));
		user_obj.setTel(rs.getString("tel"));
		return user_obj;
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
		
		//更新用户密码
		public boolean UpdatePwd(int user_id, String new_pwd) throws SQLException {
			String sql = "update user set pwd = '"+new_pwd+"' where user_id = "+user_id;
			if(this.getStat().executeUpdate(sql)>0){
				return true;
			}
			return false;
		}
	
	
	
}
