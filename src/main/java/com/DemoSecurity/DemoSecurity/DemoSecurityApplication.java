package com.DemoSecurity.DemoSecurity;

import com.DemoSecurity.DemoSecurity.Repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoSecurityApplication  {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityApplication.class, args);
    }

//    @Override
   // public void run(String... args) {
        // This code will be executed after the application context has been initialized.

        // Check if the user already exists
//        if (usersRepo.findByUsername("ram").isEmpty()) {
//            User user = new User();
//            user.setUsername("ram");
//            user.setEmail("ram");
//            user.setPassword(passwordEncoder.encode("ram"));
//            usersRepo.save(user);
//        }
//    }
}
