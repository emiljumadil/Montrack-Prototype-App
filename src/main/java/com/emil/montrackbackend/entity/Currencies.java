package com.emil.montrackbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Currencies {
    private Long Id;
    private String name;
    private String code;
    private Boolean isDeleted;
    private ZonedDateTime createdAt;
}
