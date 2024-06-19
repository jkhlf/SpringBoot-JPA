package dio.jpa;

import dio.jpa.model.User;
import dio.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("GLEYSON");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("Yuri Alberto");
        user.setUsername("SemSeEsconder");
        user.setPassword("semSeomitir");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}

