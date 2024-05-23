package com.springboot.securityjwt.dto.SignDto;

import lombok.*;
import org.springframework.context.annotation.Bean;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignInResultDto extends SignUpResultDto {
    private String token;

    @Builder
    public SignInResultDto(boolean success, int code, String msg, String token){
        super(success, code, msg);
        this.token = token;
    }
}
