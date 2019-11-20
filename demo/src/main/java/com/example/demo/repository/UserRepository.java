package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author dave
 * @version 1.0
 * @date 2019-11-20 16:01
 */
public interface UserRepository extends CrudRepository<User,Integer> {
}
