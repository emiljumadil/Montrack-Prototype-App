package com.emil.montrackbackend.usecase;


import org.apache.catalina.User;

import java.util.List;

public interface GetUsersUseCase {
    List<User> getAllUsers();
    User getUserById(Long id);
}
