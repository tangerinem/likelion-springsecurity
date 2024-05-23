package com.springboot.securityjwt.dto.SignDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class SignUpResultDto {
    private boolean success;
    private int code;
    private String msg;
}
