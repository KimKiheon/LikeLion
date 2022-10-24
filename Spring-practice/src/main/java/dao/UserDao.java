package dao;

import domain.User;

import javax.sql.DataSource;
import java.sql.*;

public class UserDao {
    private final DataSource dataSource;
    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void jdbcContextWithStatementStrategy(StatementStrategy st) throws SQLException {
        Connection c = dataSource.getConnection();
        PreparedStatement ps = st.makePreparedStatement(c);
        ps.executeUpdate();
        ps.close();
        c.close();
    }
    public void add(User user) throws SQLException {
        jdbcContextWithStatementStrategy(new AddStrategy(user));
    }
    public User findById(String id) {
        Connection c;
        try {
            c = dataSource.getConnection();

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
        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement("select count(*) from users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        rs.close();
        ps.close();
        c.close();
        return count;
    }
}