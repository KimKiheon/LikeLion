package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserDaoDocker {
    Map<String, String> env = System.getenv();
    String dbHost = env.get("DB_HOST");
    String dbUser = env.get("DB_USER");
    String dbPassword = env.get("DB_PASSWORD");

    public UserDaoDocker() throws SQLException {
    }


    public User get(String id) throws SQLException {
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = conn.prepareStatement("SELECT *FROM users Where id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User user = new User(rs.getString("id"), rs.getString("name"),
                rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();

        return user;
    }
    public List<User> findAll() throws SQLException {
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        List<User> userList = new ArrayList();
        String sql = "SELECT id, name, password from users";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs;
        rs = ps.executeQuery();
        while (rs.next()) {
            User user = new User(rs.getString("id"),
                    rs.getString("name"), rs.getString("password"));

            userList.add(user);
        }
        rs.close();
        ps.close();
        conn.close();
        return userList;

    }

    public void add(String id, String name, String password) throws SQLException {
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES (?,?,?)");
        ps.setString(1, id);
        ps.setString(2, name);
        ps.setString(3, password);

        ps.executeQuery();
        ps.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        UserDaoDocker userDaoDocker = new UserDaoDocker();
        User user = userDaoDocker.get("1");
        Scanner sc = new Scanner(System.in);
        userDaoDocker.add("345","hihi","asdasd");

        //System.out.println("Id, name, password 입력");
        //userDaoDocker.add(sc.next(), sc.next(), sc.next());
        //System.out.println(user.getName());
        List<User> list = new ArrayList<>();
        list = userDaoDocker.findAll();
        for(User user1: list){
            System.out.println(user1);
        }
    }
}
