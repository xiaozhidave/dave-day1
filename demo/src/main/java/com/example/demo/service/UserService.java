package com.example.demo.service;

import com.example.demo.entity.User;


/**
 * @author dave
 * @version 1.0
 * @date 2019-11-20 16:07
 */
public interface UserService {
    /**
     * add user
     * @param name
     * @param email
     * @return String
     */
    String addUser(String name, String email);

    /**
     * delete user by id
     * @param id
     * @return String
     */
    String deleteUserById(Integer id);

    /**
     * find all users
     * @return
     */
    Iterable<User> findAllUser();

    /**
     * update user info
     * @param user
     * @return
     */
    String updateUser(User user);
}
