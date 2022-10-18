package com.line.dao;

import com.line.domain.User;

import java.sql.*;
import java.util.Map;

public abstract class UserDaoAbstract {
    public abstract Connection makeConnection() throws SQLException;

    public void add(User user) throws SQLException {
        Map<String, String> env = System.getenv();
        UserDaoAbstract awsUserDao = new AWSUserDaoImpl();
        Connection c = awsUserDao.makeConnection();
        try {


            PreparedStatement pstmt = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?,?,?);");
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());

            pstmt.executeUpdate();

            pstmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findById(String id) throws SQLException {
        Map<String, String> env = System.getenv();
        UserDaoAbstract awsUserDao = new AWSUserDaoImpl();
        Connection c = awsUserDao.makeConnection();
        try {

            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            ResultSet rs = pstmt.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("name"));

            rs.close();
            pstmt.close();
            c.close();

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        //userDao.add(new User("7", "Ruru", "1234qwer"));
        User user = userDao.findById("7");
        System.out.println(user.getName());
    }

}
