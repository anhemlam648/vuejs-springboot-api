package com.example.apispringvuejs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
