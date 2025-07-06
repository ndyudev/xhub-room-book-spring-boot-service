package com.xhub.room_book.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomDTO {
    private Long id;
    private String roomNumber;
    private String status;
    private Long typeId;
    private String typeName;
}
