package com.xhub.room_book.Controller;

import com.xhub.room_book.DTO.BillDTO;
import com.xhub.room_book.Service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping
    public ResponseEntity<BillDTO> createBill(@RequestBody BillDTO billDTO) {
        return ResponseEntity.ok(billService.createBill(billDTO));
    }

    @GetMapping
    public ResponseEntity<List<BillDTO>> getAllBills() {
        return ResponseEntity.ok(billService.getAllBills());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillDTO> getBill(@PathVariable Long id) {
        return ResponseEntity.ok(billService.getBillById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
        return ResponseEntity.noContent().build();
    }
}
