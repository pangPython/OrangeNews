package cn.edu.bzu.group12.pangpython.dao;

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

}
