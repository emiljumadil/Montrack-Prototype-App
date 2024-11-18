package com.emil.montrackbackend.usecase;


import com.emil.montrackbackend.infrastructure.users.dto.BulkCreateUserRequestDTO;
import com.emil.montrackbackend.infrastructure.users.dto.CreateUserRequestDTO;
import org.apache.catalina.User;

import java.util.List;

public interface CreateUserUsecase {
    User createUser(CreateUserRequestDTO req);
    List<User> bulkCreateUser(BulkCreateUserRequestDTO req);
}
