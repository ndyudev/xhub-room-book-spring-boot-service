package com.xhub.room_book.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "check_in_time")
    private java.time.LocalDateTime checkInTime;

    @Column(name = "check_out_time")
    private java.time.LocalDateTime checkOutTime;

    @Column(name = "duration_hours")
    private java.math.BigDecimal durationHours;

    @Column(name = "total_price")
    private java.math.BigDecimal totalPrice;

    @Column(name = "status")
    private String status;

    private String notes;
}

