package com.emil.montrackbackend.infrastructure.users.dto;

import java.util.HashSet;
import java.util.Set;

import com.emil.montrackbackend.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestDTO {
    private String email;
    private String password;
    private String pin;

    public Users toEntity() {
       Users users = new Users();
       Users.setEmail(email);
       users.setPassword(password);
       users.setPin(pin);
    }
}
