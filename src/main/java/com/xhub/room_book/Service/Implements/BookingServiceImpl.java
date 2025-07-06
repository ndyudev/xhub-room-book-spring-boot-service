package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.BookingDTO;
import com.xhub.room_book.Entity.Booking;
import com.xhub.room_book.Entity.Customer;
import com.xhub.room_book.Entity.Room;
import com.xhub.room_book.Exception.ResourceNotFoundException;
import com.xhub.room_book.Mapper.BookingMapper;
import com.xhub.room_book.Repository.BookingRepository;
import com.xhub.room_book.Repository.CustomerRepository;
import com.xhub.room_book.Repository.RoomRepository;
import com.xhub.room_book.Service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final CustomerRepository customerRepository;
    private final RoomRepository roomRepository;
    private final BookingMapper mapper;

    @Override
    public BookingDTO createBooking(BookingDTO dto) {
        Customer customer = customerRepository.findById(dto.getCustomerId())
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        Room room = roomRepository.findById(dto.getRoomId())
                .orElseThrow(() -> new ResourceNotFoundException("Room not found"));

        Booking booking = mapper.toEntity(dto, customer, room);
        return mapper.toDTO(bookingRepository.save(booking));
    }

    @Override
    public BookingDTO updateBooking(Long id, BookingDTO dto) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));

        Customer customer = customerRepository.findById(dto.getCustomerId())
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        Room room = roomRepository.findById(dto.getRoomId())
                .orElseThrow(() -> new ResourceNotFoundException("Room not found"));

        booking.setCustomer(customer);
        booking.setRoom(room);
        booking.setCheckInTime(dto.getCheckInTime());
        booking.setCheckOutTime(dto.getCheckOutTime());
        booking.setStatus(dto.getStatus());

        return mapper.toDTO(bookingRepository.save(booking));
    }

    @Override
    public void deleteBooking(Long id) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));
        bookingRepository.delete(booking);
    }

    @Override
    public BookingDTO getBookingById(Long id) {
        return bookingRepository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));
    }

    @Override
    public List<BookingDTO> getAllBookings() {
        return bookingRepository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}

