package com.example.apispringvuejs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hradministrations")
public class HrAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Column(name = "content", length = 1500)
    private String content;

    @OneToOne
    @JoinColumn (name = "category_hradministration")
    private CategoryHrAdministration categoryHrAdministration;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    @Override
    public String toString() {
        return "HrAdministration{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descreption='" + description + '\'' +
                ", content='" + content + '\'' +
                ", categoryHrAdministration=" + categoryHrAdministration +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
