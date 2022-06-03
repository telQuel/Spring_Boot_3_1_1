package com.example.sb_crud_3_1_1.service;

import com.example.sb_crud_3_1_1.model.User;
import com.example.sb_crud_3_1_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public List<User> findAll();

    public User findById(int id);

    public User saveUser(User user);

    public void deleteById(Integer id);
}
