package com.example.apispringvuejs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @OneToOne
    @JoinColumn(name = "hradministration_id")
    private HrAdministration hrAdministration;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User users;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", hrAdministration=" + hrAdministration +
                ", users=" + users +
                '}';
    }
}
