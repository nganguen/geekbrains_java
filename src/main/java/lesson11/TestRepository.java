package lesson11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestRepository {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root", "root");

        Repository<User> userRepository = new Repository<>(User.class, connection);

        //userRepository.insert(new User(null, "lion", "ccc"));
        //userRepository.insert(new User(null, "prada", "ddd"));

        User user = userRepository.findById(2L);
        System.out.println(user);

        userRepository.delete(3L);
        System.out.println("==================");

        User toUpdate = new User(null, "new", "new");

        userRepository.update(toUpdate, 4L);

        List<User> findAll = userRepository.findAll();
        for (User element: findAll) {
            System.out.println(element);
        }
    }
}