package cn.edu.bzu.group12.orangenews.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;


/**
 * @author pangPython
 *	�û����ݿ����
 */
public class UserDao extends BaseDao{
	Logger log = Logger.getLogger(UserDao.class) ;
	User user = new User();
	//����User�����ݿ�
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

	//�̳���BaseDao���󷽷�
	//�����ݿ��ѯ��ResultSetת����User����
	@Override
	Object RS2Obj(ResultSet rs, Object obj) throws SQLException {
		User user_obj = (User)obj;
		user_obj.setUser_id(rs.getInt("user_id"));
		user_obj.setUser_name(rs.getString("user_name"));
		user_obj.setPwd(rs.getString("user_pwd"));
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
				log.debug("���������ݿ��еĽ����");
				return rs.getInt("user_id");
				
			}
			log.debug("������0��");
			return 0;
			
		}
	
	
	
}
