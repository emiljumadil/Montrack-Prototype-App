package com.emil.montrackbackend.infrastructure.controller;


import com.emil.montrackbackend.usecase.CreateUserUsecase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UsersPublicController {
    private final GetUsersUseCase getUsersUseCase;
    private final CreateUserUsecase createUserUsecase;

    public UsersPublicController(final GetUsersUseCase getUsersUseCase, CreateUserUsecase createUserUsecase) {
        this.getUsersUseCase = getUsersUseCase;
        this.createUserUsecase = createUserUsecase;
    }
}
