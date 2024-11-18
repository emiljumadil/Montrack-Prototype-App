package com.emil.montrackbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goals {
    private Long Id;
    private Long walledId;
    private BigDecimal amount;
    private String description;
    private String profilePictureUrl;
    private String attachmentUrl;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
