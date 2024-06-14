package com.example.apispringvuejs.Repository;

import com.example.apispringvuejs.Entity.HrAdministration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrAdministrationRepository extends JpaRepository<HrAdministration,Long> {
}
