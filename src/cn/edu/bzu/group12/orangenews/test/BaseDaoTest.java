package cn.edu.bzu.group12.orangenews.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cn.edu.bzu.group12.orangenews.dao.BaseDao;

/**
 * @author pangPython
 *	����
 */
public class BaseDaoTest {
	private static Connection conn = null;
	private static Statement stat = null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		BaseDao baseDao = new BaseDao();
		conn = baseDao.getConn();
		stat = conn.createStatement();
		ResultSet rs = baseDao.Query("select * from user");
		while (rs.next()) {
			System.out.println(rs.getInt("user_id")+" "+rs.getString("user_name"));
			
		}
	}
}
