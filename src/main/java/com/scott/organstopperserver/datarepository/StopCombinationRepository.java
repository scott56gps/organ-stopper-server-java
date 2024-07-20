package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.piece.StopCombination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopCombinationRepository extends JpaRepository<StopCombination, Long> {
}
