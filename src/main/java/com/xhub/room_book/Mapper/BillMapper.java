package com.xhub.room_book.Mapper;

import com.xhub.room_book.DTO.BillDTO;
import com.xhub.room_book.Entity.Bill;
import org.springframework.stereotype.Component;

@Component
public class BillMapper {

    public BillDTO toDTO(Bill bill) {
        if (bill == null) return null;

        return BillDTO.builder()
                .billId(bill.getBillId())
                .bookingId(bill.getBooking() != null ? bill.getBooking().getBookingId() : null)
                .staffId(bill.getStaff() != null ? bill.getStaff().getUserId() : null)
                .staffName(bill.getStaff() != null ? bill.getStaff().getFullName() : null)
                .issuedAt(bill.getIssuedAt())
                .totalAmount(bill.getTotalAmount())
                .paymentMethod(bill.getPaymentMethod())
                .notes(bill.getNotes())
                .build();
    }

    public Bill toEntity(BillDTO dto) {
        // Chỉ map các trường primitive, các trường liên kết cần xử lý ở Service
        return Bill.builder()
                .billId(dto.getBillId())
                .issuedAt(dto.getIssuedAt())
                .totalAmount(dto.getTotalAmount())
                .paymentMethod(dto.getPaymentMethod())
                .notes(dto.getNotes())
                .build();
    }
}
