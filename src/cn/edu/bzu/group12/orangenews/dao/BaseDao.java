package cn.edu.bzu.group12.orangenews.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author pangPython
 *	基础的数据库操作
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

	//获取数据库连接
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

	//查询 
	public ResultSet Query(String sql) throws SQLException{
		return this.stat.executeQuery(sql);
	}
	//增 insert into table values()
	public boolean Insert(String sql){
		
		return false;
	}
	//删 delete 
	public boolean Delete(String sql){
		return false;
	}
	
	//根据id删对象
	public int DeleteById(int id){
		//delete from table where id = b;
		
		return 0;
	}
	
	//改 update table set ''='';
	public boolean Update(String sql){
		return false;
	}

	public Statement getStat() {
		return stat;
	}

	public void setStat(Statement stat) {
		this.stat = stat;
	}
	//抽象方法 resultset 转换成 bean 对象类型
	abstract Object RS2Obj(ResultSet rs,Object obj) throws SQLException;

}
