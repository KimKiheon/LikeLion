package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAllStragegy implements  StatementStrategy{


    @Override
    public PreparedStatement makePreparedStatement(Connection connection)throws SQLException{
        return connection.prepareStatement("delete from users");
    }
}
