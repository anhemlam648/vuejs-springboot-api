package com.example.apispringvuejs.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dtocategory {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Dtocategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
