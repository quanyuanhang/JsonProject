package com.json.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JsonService {

	public JsonService() {
		// TODO Auto-generated constructor stub
	}

	public String getSkey() {
		// String name = "";
		String skey = "";
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名scutcs
		String url = "jdbc:mysql://127.0.0.1:3306/json";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "2834636";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// statement用来执行SQL语句
			Statement statement = conn.createStatement();
			// 要执行的SQL语句
			String sql = "select * from skey";
			// 结果集
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("-----------------");
			System.out.println("执行结果如下所示:");
			
			while (rs.next()) {
				skey = rs.getString("skey");
			}
			System.out.println("-----------------");
			rs.close();
			conn.close();

		} catch (Exception e) {

			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		}
		System.out.println("skey:" + skey);
		return skey;
	}

	public String getName() {
		String name = "";
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名scutcs
		String url = "jdbc:mysql://127.0.0.1:3306/json";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "2834636";
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 连续数据库
			Connection conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// statement用来执行SQL语句
			Statement statement = conn.createStatement();
			// 要执行的SQL语句
			String sql = "select * from skey";
			// 结果集
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("-----------------");
			System.out.println("执行结果如下所示:");
			
			while (rs.next()) {
				// 选择sname这列数据
				name = rs.getString("name");
			}
			System.out.println("-----------------");
			rs.close();
			conn.close();

		} catch (Exception e) {

			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		}

		System.out.println("name:" + name);
		return name;
	}

}
