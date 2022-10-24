package dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {
    private DataSource dataSource;
    public JdbcContext(DataSource dataSource){
        this.dataSource=dataSource;
    }
    public void workWithStatementStrategy(StatementStrategy st) throws SQLException {
        Connection c = dataSource.getConnection();
        PreparedStatement ps = st.makePreparedStatement(c);
        ps.executeUpdate();
        ps.close();
        c.close();
    }
    public void executeSql(String sql) throws SQLException {
        this.workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException{
                return c.prepareStatement(sql);
            }
        });
    }

}
