package com.example.apispringvuejs.Dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dtoarchiteture {
    private Long id;
    private String title;
    private String description;
    private String content;
    private String image;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
