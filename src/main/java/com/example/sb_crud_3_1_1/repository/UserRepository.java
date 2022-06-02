package com.example.sb_crud_3_1_1.repository;

import com.example.sb_crud_3_1_1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
