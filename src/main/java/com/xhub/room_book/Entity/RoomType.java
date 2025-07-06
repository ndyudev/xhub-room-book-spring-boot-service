package com.xhub.room_book.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_type_id")
    private Long roomTypeId;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "price_per_hour", nullable = false)
    private java.math.BigDecimal pricePerHour;

    public String getTypeName() {
        return name;
    }
}
