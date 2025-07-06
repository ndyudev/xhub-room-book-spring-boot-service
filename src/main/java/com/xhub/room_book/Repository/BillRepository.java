package com.xhub.room_book.Repository;

import com.xhub.room_book.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
