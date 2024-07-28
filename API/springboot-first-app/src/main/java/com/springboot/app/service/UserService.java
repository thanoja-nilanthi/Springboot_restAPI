package com.springboot.app.service;

import com.springboot.app.service.UserService;
import com.springboot.app.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"kasuni", 20, "kasuni@gmail.com");
        User user2 = new User(2,"Hansi", 30, "hansi@gmail.com");
        User user3 = new User(3,"Kevin", 35, "kevin@gmail.com");
        User user4 = new User(4,"Thanu", 22, "thanu@gmail.com");
        User user5 = new User(5,"Gayan", 18, "gayan@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}