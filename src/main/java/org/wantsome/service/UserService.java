package org.wantsome.service;


import org.springframework.stereotype.Service;
import org.wantsome.domain_dao.User;
import org.wantsome.domain_dao.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public Long saveUser(User user){
        return userRepository.save(user);
    }
}
