package com.springboot.securityjwt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String author;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    @ManyToOne //다대일 관계, 여러 게시물이 하나의 babyLion의것
    @JoinColumn(name = "babyLion_pid")
    @JsonIgnore
    private BabyLion babyLion;
}
