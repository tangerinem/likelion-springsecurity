package com.springboot.securityjwt.service.Impl;

import com.springboot.securityjwt.dto.BoardDto.BoardRequestDto;
import com.springboot.securityjwt.dto.BoardDto.BoardResponseDto;

import com.springboot.securityjwt.entity.Board;


import com.springboot.securityjwt.repository.BoardRepository;

import com.springboot.securityjwt.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoardServiceImpl implements BoardService {
    private Logger logger = LoggerFactory.getLogger(BoardService.class);

    private final BoardRepository boardRepository;


    public BoardServiceImpl(BoardRepository boardRepository
            ){
        this.boardRepository = boardRepository;
    }

    @Override
    public BoardResponseDto getContent(Long id){
        logger.info("[getContent] : 게시글 반환");
        Board board = boardRepository.findById(id).get();

        BoardResponseDto boardResponseDto  = new BoardResponseDto();
        boardResponseDto.setId(board.getId());
        boardResponseDto.setAuthor(board.getAuthor());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setCreateAt(board.getCreateDate());
        boardResponseDto.setUpdateAt(board.getUpdateDate());

        return boardResponseDto;

    }
    @Override
    public BoardResponseDto saveBoard(BoardRequestDto boardRequestDto) {
        logger.info("[saveBoard] 게시글 저장 : {}",boardRequestDto.toString());

            Board board = new Board();
            board.setTitle(boardRequestDto.getTitle());
            board.setAuthor(boardRequestDto.getAuthor());
            board.setCreateDate(LocalDateTime.now());
            board.setUpdateDate(LocalDateTime.now());

            Board savedBoard = boardRepository.save(board);

            BoardResponseDto boardResponseDto = new BoardResponseDto();
            boardResponseDto.setId(savedBoard.getId());
            boardResponseDto.setTitle(savedBoard.getTitle());
            boardResponseDto.setAuthor(savedBoard.getAuthor());
            boardResponseDto.setCreateAt(LocalDateTime.now());
            boardResponseDto.setUpdateAt(LocalDateTime.now());

            return boardResponseDto;

    }

    @Override
    public BoardResponseDto changeBoard(Long id, String title, String author){
        logger.info("[changeBoard] : 게시글 수정");


        Board findBoard = boardRepository.getById(id);
        findBoard.setTitle(title);
        findBoard.setAuthor(author);
        findBoard.setUpdateDate(LocalDateTime.now());
        Board board = boardRepository.save(findBoard);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setId(board.getId());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setAuthor(board.getAuthor());
        boardResponseDto.setCreateAt(board.getCreateDate());
        boardResponseDto.setUpdateAt(LocalDateTime.now());

        return  boardResponseDto;

    }
    @Override
    public void deleteBoard(Long id){
        logger.info("[deleteBoard] : 게시글 삭제");
       boardRepository.deleteById(id);
    }
}
