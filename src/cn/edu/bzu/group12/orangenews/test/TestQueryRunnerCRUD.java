package cn.edu.bzu.group12.orangenews.test;

import java.sql.*;


/**
 * @author pangPython
 *	����dbutils��queryrunner��CRUD
 */
public class TestQueryRunnerCRUD {

	//��ȡ����
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/group12");
		return conn;
	}
	
	public static void insert(){
		
	}
	
	
}
