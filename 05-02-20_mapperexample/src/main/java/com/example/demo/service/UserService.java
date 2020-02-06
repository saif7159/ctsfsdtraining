package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;

public interface UserService {
public SharedUser createUser(User user);
public SharedUser findByID(int id);
}
