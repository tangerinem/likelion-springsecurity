package com.springboot.securityjwt.dto.SignDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Data
public class SignUpDto {
    private String id;
    private String password;
    private String name;
    private String number;
    private String address;
}
