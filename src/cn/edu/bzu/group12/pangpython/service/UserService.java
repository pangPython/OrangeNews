package cn.edu.bzu.group12.pangpython.service;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.dao.UserDao;


/**
 * @author pangPython
 *	Userҵ���߼�
 */
public class UserService {
	
	UserDao userDao = new UserDao(); 
	
	public List<User> getAllUser() throws SQLException, UnsupportedEncodingException{
		ResultSet rs = userDao.Query("select * from user");
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUser_name(rs.getString("user_name"));
			Logger.getLogger(UserService.class).debug(user.getUser_name());
			user.setUser_sex(rs.getInt("user_sex"));
			user.setTel(rs.getString("tel"));
			user.setEmail(rs.getString("email"));
			user.setPwd(rs.getString("pwd"));
			user.setPic(rs.getString("pic"));
			list.add(user);
		}
		return list;
	}
	
	public boolean insert(User user){
		if(userDao.add(user)>0){
			return true;
		}
		return false;
	}
	
}
