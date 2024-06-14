package com.example.apispringvuejs.Repository;

import com.example.apispringvuejs.Entity.Architeture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchitetureRepository extends JpaRepository<Architeture, Long> {
}
