package dio.jpa;

import dio.jpa.model.User;
import dio.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Tio Phill");
        user.setUsername("Ph1ll");
        user.setPassaword("333");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}

