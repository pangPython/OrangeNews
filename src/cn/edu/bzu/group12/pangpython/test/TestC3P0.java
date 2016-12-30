package cn.edu.bzu.group12.pangpython.test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;




/**
 * @author pangPython
 *	≤‚ ‘C3P0
 */	
public class TestC3P0 {
	public static void main(String[] args) throws PropertyVetoException, SQLException {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass("org.gjt.mm.mysql.Driver");
		cpds.setJdbcUrl("jdbc:mysql://localhost/group12");
		cpds.setUser("root");
		cpds.setPassword("root");
		cpds.setMaxStatements(180);
		cpds.setMaxPoolSize(100);
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			conn = cpds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rs = stat.executeQuery("select * from user");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		while (rs.next()) {
			System.out.println(rs.getInt("user_id")+" "+rs.getString("user_name"));
			
		}
		//œ˙ªŸ
		cpds.close();
		
	}
}
