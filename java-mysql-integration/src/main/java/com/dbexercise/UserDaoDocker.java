package com.dbexercise;

import java.sql.*;
import java.util.Map;

public class UserDaoDocker {
    public void add() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        //PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES (?,?,?)");
        //ps.setString(1,"6");
        //ps.setString(2,"aftertruncate");
        //ps.setString(3,"1234");
        Statement stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("SELECT *FROM users");
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String password = rs.getString("password");

            System.out.println(id + " " + name + " " + password);
        }
        //int status = ps.executeUpdate();
        //System.out.println(status);
        //ps.executeUpdate();
        //ps.close();
        conn.close();
        System.out.println("DB Insert Sueccess");
    }

    public static void main(String[] args) throws SQLException {
        UserDaoDocker userDaoDocker = new UserDaoDocker();
        userDaoDocker.add();
    }
}
