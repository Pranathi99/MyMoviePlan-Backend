package com.MyMoviePlan.config;

import com.MyMoviePlan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitialData implements CommandLineRunner {

    @Autowired
    private UserService service;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

//        final UserEntity super_admin = new UserEntity("Ram S", "rams@gmail.com",
//                "8099531318", "Male", passwordEncoder.encode("super"), true,
//                true, true, true, true,
//                ROLE_SUPER_ADMIN);
//
//        final UserEntity admin = new UserEntity("Jaya R", "jayar@gmail.com",
//                "9019168638", "Male", passwordEncoder.encode("admin"), true,
//                true, true, true, true,
//                ROLE_ADMIN);
//
//        final UserEntity user = new UserEntity("Sohail F", "sohailf@gmail.com",
//                "8985462507", "Male", passwordEncoder.encode("user"), true,
//                true, true, true, true,
//                ROLE_USER);
//
//        service.save(super_admin);
//        service.save(admin);
//        service.save(user);
    }
}
