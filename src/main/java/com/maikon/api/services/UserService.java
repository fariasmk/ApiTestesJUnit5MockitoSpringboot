package com.maikon.api.services;

import com.maikon.api.domain.User;
import com.maikon.api.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);
}
