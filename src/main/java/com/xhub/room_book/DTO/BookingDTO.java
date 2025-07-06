package com.xhub.room_book.DTO;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDTO {
    private Long bookingId;
    private Long customerId;
    private Long roomId;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private String status;
}

