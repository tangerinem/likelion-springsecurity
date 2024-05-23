package com.springboot.securityjwt.dto.BoardDto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardChangeDto {
    private Long id;
    private String title;
    private String author;
}
