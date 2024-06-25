package com.example.apispringvuejs.Entity;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="categoryhr_administration")
public class CategoryHrAdministration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Override
    public String toString() {
        return "CategoryHrAdministration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
