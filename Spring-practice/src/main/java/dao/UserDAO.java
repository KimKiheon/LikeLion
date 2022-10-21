package dao;

import domain.User;

import java.sql.*;
import java.util.Map;

public class UserDAO {
    private final ConnectionMaker connectionMaker;

    public UserDAO() {
        this.connectionMaker = new AwsConnectionMaker();
    }

    public UserDAO(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }


    public void add(User user) {
        Map<String, String> env = System.getenv();
        try {
            Connection c = connectionMaker.connectionMaker();

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

    public User findById(String id) {
        Map<String, String> env = System.getenv();
        Connection c;
        try {
            // DB접속 (ex sql workbeanch실행)
            c = connectionMaker.connectionMaker();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("password"));

            rs.close();
            pstmt.close();
            c.close();

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        UserDAO userDao = new UserDAO();
        //userDao.add(new User("7", "Ruru", "1234qwer"));
        User user = userDao.findById("7");
        System.out.println(user.getName());
    }
}