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
public class Dtoapply {

    private Long id;
    private String title;
    private String description;
    private String content;
    private String image;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Override
    public String toString() {
        return "Dtoapply{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
