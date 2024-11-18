package com.emil.montrackbackend.usecase.user.impl;


import com.emil.montrackbackend.infrastructure.repository.UsersRepository;
import com.emil.montrackbackend.usecase.CreateUserUsecase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUsecaseImpl implements CreateUserUsecase {
    private final UsersRepository usersRepository;
}
