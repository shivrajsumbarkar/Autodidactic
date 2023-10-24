package com.shivraj.spring.service;

import java.util.List;

import com.shivraj.spring.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
