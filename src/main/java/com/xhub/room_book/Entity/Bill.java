package com.xhub.room_book.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Long billId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private User staff;

    @Column(name = "issued_at")
    private java.time.LocalDateTime issuedAt;

    @Column(name = "total_amount")
    private java.math.BigDecimal totalAmount;

    @Column(name = "payment_method")
    private String paymentMethod;

    private String notes;
}
