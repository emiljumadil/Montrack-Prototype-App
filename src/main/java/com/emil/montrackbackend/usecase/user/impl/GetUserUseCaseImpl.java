package com.emil.montrackbackend.usecase.user.impl;


import com.emil.montrackbackend.infrastructure.repository.UsersRepository;
import com.emil.montrackbackend.usecase.GetUsersUseCase;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserUseCaseImpl implements GetUsersUseCase {
    private final UsersRepository usersRepository;

    public GetUserUseCaseImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

}
