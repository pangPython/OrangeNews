package cn.edu.bzu.group12.pangpython.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.bzu.group12.pangpython.bean.User;


/**
 * @author pangPython
 *	�û����ݿ����
 */
public class UserDao extends BaseDao{
	

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
	
}
