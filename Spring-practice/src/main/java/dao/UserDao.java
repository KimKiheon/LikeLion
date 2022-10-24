package dao;

import com.mysql.cj.result.Row;
import domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;
    public UserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    /*public void jdbcContextWithStatementStrategy(StatementStrategy st) throws SQLException {
        Connection c = dataSource.getConnection();
        PreparedStatement ps = st.makePreparedStatement(c);
        ps.executeUpdate();
        ps.close();
        c.close();
    }*/

    public void add(User user) throws SQLException {
        this.jdbcTemplate.update("insert into users (id, name, pasword) values (?,?,?);",
                user.getId(),user.getName(),user.getPassword());
    }

    public User findById(String id) {
        String sql = "select *from users where id = ?";
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));

                return user;
            }
        };
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
    public List<User> getAll(){
        String sql = "select *from users order by id";
        RowMapper<User> rowMapper = new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User(rs.getString("id"),rs.getString("name"),
                        rs.getString("password"));
                return user;
            }
        };
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("delete from users");
    }

    public int getCount() throws SQLException {
        return this.jdbcTemplate.queryForObject("select count(*) from users;",Integer.class);
    }

}