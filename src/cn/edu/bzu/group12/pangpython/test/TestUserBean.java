package cn.edu.bzu.group12.pangpython.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.group12.pangpython.bean.User;
import cn.edu.bzu.group12.pangpython.dao.BaseDao;

/**
 * @author pangPython
 *	≤‚ ‘UserBean
 */
public class TestUserBean {

	private static BaseDao baseDao;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		baseDao = new BaseDao();
		ResultSet rs =  baseDao.Query(baseDao.getConn(), baseDao.getConn().createStatement(), "select * from user");
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUser_id(rs.getInt("user_id"));
			user.setUser_name(rs.getString("user_name"));
			user.setUser_sex(rs.getInt("user_sex"));
			user.setEmail(rs.getString("email"));
			user.setTel(rs.getString("tel"));
			list.add(user);
		}
		for (User user : list) {
			System.out.println(user.getUser_id()+" "+user.getUser_name()+" "+user.getEmail()+" "+user.getTel()+" "+user.getUser_sex());
		}
	}
}
