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
        try {
            jdbcContextWithStatementStrategy(new AddStrategy(user));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findById(String id) {
        Connection c;
        try {
            c = connectionMaker.connectionMaker();

            PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("password"));

            rs.close();
            ps.close();
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
        userDao.add(new User("9", "Ruru", "1234qwer"));
        User user = userDao.findById("7");
        System.out.println(user.getName());
    }
}