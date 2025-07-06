package com.xhub.room_book.Service;

import com.xhub.room_book.DTO.BookingDTO;
import java.util.List;

public interface BookingService {
    BookingDTO createBooking(BookingDTO dto);
    BookingDTO updateBooking(Long id, BookingDTO dto);
    void deleteBooking(Long id);
    BookingDTO getBookingById(Long id);
    List<BookingDTO> getAllBookings();
}

