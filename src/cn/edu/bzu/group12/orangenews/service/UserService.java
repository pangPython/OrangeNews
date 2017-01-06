package cn.edu.bzu.group12.orangenews.service;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cn.edu.bzu.group12.orangenews.bean.User;
import cn.edu.bzu.group12.orangenews.dao.UserDao;


/**
 * @author pangPython
 *	User业务逻辑
 */
public class UserService {
	
	UserDao userDao = new UserDao(); 
	Logger log = Logger.getLogger(UserService.class);
	
	public List<User> getAllUser() throws SQLException, UnsupportedEncodingException{
		ResultSet rs = userDao.Query("select * from user");
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUser_id(rs.getInt("user_id"));
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
	
	//插入用户
	public boolean insert(User user){
		if(userDao.add(user)>0){
			return true;
		}
		return false;
	}
	
	public int getLastInsertId() throws SQLException{
		return userDao.getLastInsertId("user");
	}
	
	//根据id查询用户
	public User getUserById(int user_id) throws SQLException{
		return userDao.get(user_id);
	}
	
	//登录
	public User login(String user_name,String user_pwd) throws SQLException{
		return userDao.getUserByNameAndPwd(user_name, user_pwd);
	}
	
	//更新密码
	public boolean updatepwd(int user_id,String new_pwd) throws SQLException{
		return userDao.UpdatePwd(user_id,new_pwd);
	}
	//更新用户信息
	public boolean update(User user) throws SQLException {
			log.debug("UserService update");
			return userDao.Update(user);
	}
	
}
