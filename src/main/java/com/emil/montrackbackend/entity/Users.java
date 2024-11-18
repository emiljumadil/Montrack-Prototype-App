package com.emil.montrackbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Long userId;
    private String walled_id;
    private String email;
    private String password;
    private String pin;
    private String profilePictureUrl;
    private String quotes;
    private String oauthProvider;
    private String language;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}


