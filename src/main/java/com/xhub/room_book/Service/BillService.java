package com.xhub.room_book.Service;

import com.xhub.room_book.DTO.BillDTO;
import java.util.List;

public interface BillService {
    BillDTO createBill(BillDTO billDTO);
    List<BillDTO> getAllBills();
    BillDTO getBillById(Long id);
    void deleteBill(Long id);
}

