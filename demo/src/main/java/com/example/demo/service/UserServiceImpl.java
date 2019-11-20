package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author dave
 * @version 1.0
 * @date 2019-11-20 16:08
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public String addUser(String name, String email) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return "Saved";
    }

    @Override
    public String deleteUserById(Integer id) {
        userRepository.deleteById(id);
        return "Delete";
    }

    @Override
    public Iterable<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Success";
    }
}
