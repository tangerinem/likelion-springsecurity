package com.springboot.securityjwt.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomAccessDenideHandler implements AccessDeniedHandler {
    private Logger logger = LoggerFactory.getLogger(CustomAccessDenideHandler.class);
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException{
        logger.info("[handle] 접근이 막혔을 경우 리다이렉트");
        response.sendRedirect("/sign-api/exception");
    }
}
