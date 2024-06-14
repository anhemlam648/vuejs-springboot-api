package com.example.apispringvuejs.Repository;

import com.example.apispringvuejs.Entity.CategoryHrAdministration;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryHrAdministration, Long> {
}
