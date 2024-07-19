package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.organ.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopRepository extends JpaRepository<Stop, Long> {
}
