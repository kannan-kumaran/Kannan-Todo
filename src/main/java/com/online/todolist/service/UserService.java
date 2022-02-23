package com.online.todolist.service;

import com.online.todolist.model.User;

public interface UserService {

    public User findUserByEmail(String email) ;
    public User saveUser(User user);
}
