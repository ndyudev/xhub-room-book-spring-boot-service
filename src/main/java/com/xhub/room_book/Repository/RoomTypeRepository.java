package com.xhub.room_book.Repository;


import com.xhub.room_book.Entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
    boolean existsByName(String name);
}
