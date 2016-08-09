package com.smartflow.smartflow.mail;


import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyDataSourceFactory {

	public static DataSource getMySQLDataSource() {
		MysqlDataSource mysqlDS = null;

			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost:3306/epo");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("Password123");
		
		return mysqlDS;
	}
	
	
		
}
