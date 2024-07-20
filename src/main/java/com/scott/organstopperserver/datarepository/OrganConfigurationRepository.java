package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.piece.OrganConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganConfigurationRepository extends JpaRepository<OrganConfiguration, Long> {
}
