package cn.edu.bzu.group12.pangpython.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author pangPython
 *	���������ݿ����
 */
public class BaseDao {
	
	private Connection conn = null;
	private Statement stat = null;
	
	
	public BaseDao() throws ClassNotFoundException, SQLException {
		this.setConn(getConnection());
		this.setStat(conn.createStatement());
	}

	//��ȡ���ݿ�����
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		final String url = "jdbc:mysql://localhost:3306/group12";
		final String user = "root";
		final String password = "root";
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url,user,password);
	} 

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	//��ѯ 
	public ResultSet Query(Connection conn,Statement state,String sql) throws SQLException{
		Statement stat = conn.createStatement();
		return stat.executeQuery(sql);
	}
	//�� insert into table values()
	public boolean Insert(String sql){
		
		return false;
	}
	//ɾ delete 
	public boolean Delete(String sql){
		return false;
	}
	
	//����idɾ����
	public int DeleteById(int id){
		//delete from table where id = b;
		
		return 0;
	}
	
	//�� update table set ''='';
	public boolean Update(String sql){
		return false;
	}

	public Statement getStat() {
		return stat;
	}

	public void setStat(Statement stat) {
		this.stat = stat;
	}

}
