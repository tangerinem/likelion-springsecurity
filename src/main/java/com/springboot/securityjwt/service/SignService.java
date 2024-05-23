package com.springboot.securityjwt.service;

import com.springboot.securityjwt.dto.SignDto.SignInResultDto;
import com.springboot.securityjwt.dto.SignDto.SignUpDto;
import com.springboot.securityjwt.dto.SignDto.SignUpResultDto;

public interface SignService {
    SignUpResultDto SignUp(SignUpDto SignUpDto, String roles);
    SignInResultDto SignIn(String email, String password);
}
