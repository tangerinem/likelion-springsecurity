package com.springboot.securityjwt.dto.BoardDto;


import com.springboot.securityjwt.entity.BabyLion;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
public class BoardResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private BabyLion babyLion;

}
