package com.example.apispringvuejs.Repository;

import com.example.apispringvuejs.Entity.Apply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRepository extends JpaRepository<Apply,Long> {
}
