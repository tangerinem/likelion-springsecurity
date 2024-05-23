package com.springboot.securityjwt.repository;

import com.springboot.securityjwt.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {

}
