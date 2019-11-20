package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author dave
 * @version 1.0
 * @date 2019-11-20 16:04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestParam String name,@RequestParam String email){
        String str = "Failed";
        try {
            str = userService.addUser(name, email);
        }catch(Exception e){
            return str;
        }
        return str;
    }

    @DeleteMapping("/delete")
    public String deleteUserById(@RequestParam Integer id){
        String str = "Failed";
        try {
            str = userService.deleteUserById(id);
        }catch(Exception e){
            return str;
        }
        return str;
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user){
        String str = "Failed";
        try {
            str = userService.updateUser(user);
        }catch(Exception e){
            return str;
        }
        return str;
    }


    @GetMapping("/get")
    public Iterable<User> findAllUser(){
        Iterable<User> list = null;
        try {
            list = userService.findAllUser();
        }catch (Exception e){
            return list;
        }
        return list;
    }
}
