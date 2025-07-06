package com.xhub.room_book.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {
    private Long id;
    private String fullName;
    private String phone;
    private String email;
    private String idCard;
    private String address;
}
