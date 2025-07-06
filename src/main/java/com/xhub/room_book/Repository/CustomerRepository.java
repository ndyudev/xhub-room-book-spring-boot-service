package com.xhub.room_book.Repository;

import com.xhub.room_book.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByIdCard(String idCard);
}
