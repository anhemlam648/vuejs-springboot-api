package com.example.apispringvuejs.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dtocomment {
    private Long id;
    private String content;
    private Long hrAdministration;
    private Long users;
}
