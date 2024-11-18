package com.emil.montrackbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallets {
    private Long Id;
    private Long userId;
    private String name;
    private BigDecimal currency;
    private BigDecimal balance;
    private Boolean isUsed;
    private Boolean isDeleted;
}
