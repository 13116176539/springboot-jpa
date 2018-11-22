package com.example.demo.dao;

import com.example.demo.pojo.Person;
import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈〉
 *
 * @author hanxulei
 * @create 2018/10/11
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository <User, Integer> {

}
