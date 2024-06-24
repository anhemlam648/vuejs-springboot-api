package com.example.apispringvuejs.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dtouser {
    private Long id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
