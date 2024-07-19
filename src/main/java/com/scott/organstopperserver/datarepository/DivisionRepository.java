package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.organ.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
