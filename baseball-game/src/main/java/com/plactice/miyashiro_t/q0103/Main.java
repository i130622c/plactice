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
	static final String URL = "jdbc:mysql://localhost:3306/baseball_game?autoReconnect=true&useSSL=false";
	static final String USER = "root";
	static final String PASSWARD = "Miyashiro0930";
	static final String SQL_SELECT = "SELECT name_kanji FROM member";
	static final String SQL_INSERT = "INSERT INTO member VALUES(1, 'test', 'テスト')";

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWARD)) {
			System.out.println("MySQLに接続できました。");
			PreparedStatement statement = null;
			
			statement = connection.prepareStatement(SQL_SELECT);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String name_kanji = resultSet.getString(1);
				System.out.println(name_kanji);
			}
		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした。");
		}
	}
}