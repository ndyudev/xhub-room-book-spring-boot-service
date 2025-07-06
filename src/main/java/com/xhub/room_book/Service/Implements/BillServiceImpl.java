package com.xhub.room_book.Service.Implements;

import com.xhub.room_book.DTO.BillDTO;
import com.xhub.room_book.Entity.Bill;
import com.xhub.room_book.Entity.Booking;
import com.xhub.room_book.Entity.User;
import com.xhub.room_book.Mapper.BillMapper;
import com.xhub.room_book.Repository.BillRepository;
import com.xhub.room_book.Repository.BookingRepository;
import com.xhub.room_book.Repository.UserRepository;
import com.xhub.room_book.Service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {

    private final BillRepository billRepository;
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;
    private final BillMapper billMapper;

    @Override
    public BillDTO createBill(BillDTO dto) {
        Bill bill = billMapper.toEntity(dto);

        Booking booking = bookingRepository.findById(dto.getBookingId())
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        User staff = userRepository.findById(dto.getStaffId())
                .orElseThrow(() -> new RuntimeException("Staff not found"));

        bill.setBooking(booking);
        bill.setStaff(staff);

        return billMapper.toDTO(billRepository.save(bill));
    }

    @Override
    public List<BillDTO> getAllBills() {
        return billRepository.findAll()
                .stream().map(billMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BillDTO getBillById(Long id) {
        return billRepository.findById(id)
                .map(billMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Bill not found"));
    }

    @Override
    public void deleteBill(Long id) {
        billRepository.deleteById(id);
    }
}
