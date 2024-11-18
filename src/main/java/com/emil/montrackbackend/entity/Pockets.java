package com.emil.montrackbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pockets {
    private Long Id;
    private Long walledId;
    private String name;
    private BigDecimal balance;
    private BigDecimal amount;
    private ZonedDateTime transactionDate;
    private String description;
    private String emojiId;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
