package cn.edu.bzu.group12.orangenews.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author pangPython
 *	���������ݿ����
 */
public abstract class BaseDao {
	
	private Connection conn = null;
	private Statement stat = null;
	
	
	public BaseDao(){
		try {
			this.setConn(getConnection());
			this.setStat(conn.createStatement());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//��ȡ���ݿ�����
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		final String url = "jdbc:mysql://192.168.50.103:3306/group12";
		final String user = "group12";
		final String password = "group12";
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
	public ResultSet Query(String sql) throws SQLException{
		return this.stat.executeQuery(sql);
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
	//���󷽷� resultset ת���� bean ��������
	abstract Object RS2Obj(ResultSet rs,Object obj) throws SQLException;

}
