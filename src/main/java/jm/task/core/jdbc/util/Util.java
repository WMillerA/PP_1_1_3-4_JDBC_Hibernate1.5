package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usersbd";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD);
            System.out.println("Соединение с БД установлено");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Ошибка подключения к БД");
        }
        return connection;
    }
}
