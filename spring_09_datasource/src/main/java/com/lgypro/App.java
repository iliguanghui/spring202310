package com.lgypro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        executeQuery(connection);
        System.out.println("--------------------");
        dataSource = context.getBean("c3p0DataSource", DataSource.class);
        connection = dataSource.getConnection();
        executeQuery(connection);
    }

    public static void executeQuery(Connection connection) throws SQLException {
        String sql = "select count(*) from EMP";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            System.out.println(count);
        }
    }
}
