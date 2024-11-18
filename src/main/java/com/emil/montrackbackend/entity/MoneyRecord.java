package com.emil.montrackbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoneyRecord {
    private Long Id;
    private Long pocketId;
    private Long goalId;
    private String name;
    private String type;
    private ZonedDateTime date;
    private BigDecimal amount;
    private String choose_pocket;
    private String description;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
