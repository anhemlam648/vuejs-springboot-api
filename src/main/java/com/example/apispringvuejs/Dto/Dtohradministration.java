package com.example.apispringvuejs.Dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Dtohradministration {

    private Long id;
    private String title;
    private String description;
    private String content;
    private String image;
    private Long categoryHrAdministration;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Override
    public String toString() {
        return "Dtohradministration{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", categoryHrAdministration=" + categoryHrAdministration +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
