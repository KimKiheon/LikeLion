package dao;

import domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new AwsConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }


    public void add(User user) {
        Map<String, String> env = System.getenv();
        try {
            jdbcContextWithStatementStrategy(new AddStrategy(user));

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

    public void deleteAll() throws SQLException {
        jdbcContextWithStatementStrategy(new DeleteAllStragegy());
    }
    public int getCount() throws SQLException {
        Connection c = connectionMaker.connectionMaker();
        PreparedStatement ps = c.prepareStatement("select count(*) from users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        rs.close();
        ps.close();
        c.close();
        return count;
    }
    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws  SQLException{
        Connection c = connectionMaker.connectionMaker();
        PreparedStatement ps = stmt.makePreparedStatement(c);
        ps.executeUpdate();
        ps.close();
        c.close();
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        //userDao.add(new User("7", "Ruru", "1234qwer"));
        User user = userDao.findById("7");
        System.out.println(user.getName());
    }
}