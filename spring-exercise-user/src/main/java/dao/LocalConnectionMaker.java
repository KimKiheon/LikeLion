package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalConnectionMaker implements ConnectionMaker{
    @Override
    public Connection connectionMaker() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost3306/likelion-db");
        return c;
    }
}
