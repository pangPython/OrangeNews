package cn.edu.bzu.group12.orangenews.test;

import java.sql.*;


/**
 * @author pangPython
 *	测试dbutils的queryrunner的CRUD
 */
public class TestQueryRunnerCRUD {

	//获取连接
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/group12");
		return conn;
	}
	
	public static void insert(){
		
	}
	
	
}
