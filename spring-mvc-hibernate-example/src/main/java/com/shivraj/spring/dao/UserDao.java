package com.shivraj.spring.dao;

import java.util.List;

import com.shivraj.spring.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
