package com.xhub.room_book.Mapper;

import com.xhub.room_book.DTO.BookingDTO;
import com.xhub.room_book.Entity.Booking;
import com.xhub.room_book.Entity.Customer;
import com.xhub.room_book.Entity.Room;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {

    public Booking toEntity(BookingDTO dto, Customer customer, Room room) {
        return Booking.builder()
                .bookingId(dto.getBookingId())
                .customer(customer)
                .room(room)
                .checkInTime(dto.getCheckInTime())
                .checkOutTime(dto.getCheckOutTime())
                .status(dto.getStatus())
                .durationHours(null)
                .totalPrice(null)
                .notes(null)
                .build();
    }

    public BookingDTO toDTO(Booking booking) {
        return BookingDTO.builder()
                .bookingId(booking.getBookingId())
                .customerId(booking.getCustomer().getCustomerId())
                .roomId(booking.getRoom().getRoomId())
                .checkInTime(booking.getCheckInTime())
                .checkOutTime(booking.getCheckOutTime())
                .status(booking.getStatus())
                .build();
    }
}

