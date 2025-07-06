package com.xhub.room_book.DTO;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomTypeDTO {
    private Long id;
    private String name;
    private BigDecimal pricePerHour;
}
