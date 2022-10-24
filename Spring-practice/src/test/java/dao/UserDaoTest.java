package dao;

import domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    ApplicationContext context;
    User user1,user2,user3;
    UserDao userDao;
    @BeforeEach
    void SetUp(){
        this.userDao = context.getBean("awsUserDao",UserDao.class);
    }

    @Test
    void addAndSelect() throws SQLException {

        String id = "11112";
        User user = new User(id, "spring", "1123");
        userDao.add(user);


        User selectedUser = userDao.findById(id);
        Assertions.assertEquals(user.getName(), selectedUser.getName());
        Assertions.assertEquals(user.getPassword(), selectedUser.getPassword());

        userDao.deleteAll();
        Assertions.assertEquals(0,userDao.getCount());
    }
    @Test
    void findByID(){
        Assertions.assertThrows(EmptyStackException.class, () ->
                userDao.findById("30"));
    }
    @Test
    @DisplayName("없을 때 빈 리스트 리턴 하는지, 있을 때 개수만큼 리턴 하는지")
    void getAllTest() throws SQLException {
        userDao.deleteAll();
        List<User> users = userDao.getAll();
        Assertions.assertEquals(0,users.size());
        userDao.add(user1);
        userDao.add(user2);
        userDao.add(user3);
        users = userDao.getAll();
        Assertions.assertEquals(3,users.size());
    }
}



