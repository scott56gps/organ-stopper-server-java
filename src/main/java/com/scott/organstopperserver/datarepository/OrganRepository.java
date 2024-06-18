package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.Organ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganRepository extends JpaRepository<Organ, Long> {
}
