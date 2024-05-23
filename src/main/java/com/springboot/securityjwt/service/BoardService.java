package com.springboot.securityjwt.service;

import com.springboot.securityjwt.dto.BoardDto.BoardRequestDto;
import com.springboot.securityjwt.dto.BoardDto.BoardResponseDto;

public interface BoardService {
    BoardResponseDto getContent(Long id);
    BoardResponseDto saveBoard(BoardRequestDto boardRequestDto );
    BoardResponseDto changeBoard(Long id, String title, String content);
    void deleteBoard(Long id);

}
