package dao;

import com.line.dao.AWSUserDaoImpl;
import com.line.dao.UserDao;
import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException {
        UserDao userDao = new UserDao();
        String id = "19";
        User user = new User(id, "EternityHwan", "1123");
        userDao.add(user);

        User selectedUser = userDao.findById(id);
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
        Assertions.assertEquals("1123", selectedUser.getPassword());
    }
}


