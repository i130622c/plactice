/**
 * 
 */
/**
 * @author tmiya
 *
 */
package com.plactice.miyashiro_t.q0103;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		String connectionURL = "jdbc:mysql://localhost:3306/baseball_game?autoReconnect=true&useSSL=false";

		try {
			connection = DriverManager.getConnection(connectionURL, "root", "Miyashiro0930");
			System.out.println("MySQLに接続できました。");
		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした。");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("MySQLのクローズに失敗しました。");
				}
			}
		}
	}
}