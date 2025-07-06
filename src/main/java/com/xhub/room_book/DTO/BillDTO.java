package com.xhub.room_book.DTO;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BillDTO {
    private Long billId;
    private Long bookingId;
    private Long staffId;
    private String staffName;
    private LocalDateTime issuedAt;
    private BigDecimal totalAmount;
    private String paymentMethod;
    private String notes;
}

