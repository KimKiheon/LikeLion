package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDAO awsUserDao(){
        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDAO userDao = new UserDAO(awsConnectionMaker);
        return userDao;
    }
    @Bean
    public UserDAO localUserDao(){
        UserDAO userDao = new UserDAO(new LocalConnectionMaker());
        return userDao;
    }
}
