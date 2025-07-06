package com.xhub.room_book.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "room_number", nullable = false, unique = true)
    private String roomNumber;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
}
