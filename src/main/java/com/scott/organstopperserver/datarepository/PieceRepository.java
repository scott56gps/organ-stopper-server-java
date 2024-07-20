package com.scott.organstopperserver.datarepository;

import com.scott.organstopperserver.model.entity.piece.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PieceRepository extends JpaRepository<Piece, Long> {
}
