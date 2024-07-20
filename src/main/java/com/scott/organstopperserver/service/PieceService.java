package com.scott.organstopperserver.service;

import com.scott.organstopperserver.datarepository.PieceRepository;
import com.scott.organstopperserver.exception.PieceNotFoundException;
import com.scott.organstopperserver.model.entity.piece.Piece;
import org.springframework.stereotype.Service;

@Service
public class PieceService {
    private final PieceRepository pieceRepository;

    public PieceService(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public Piece getPieceById(Long id) throws PieceNotFoundException {
        return pieceRepository.findById(id)
                .orElseThrow(() -> new PieceNotFoundException(id));
    }
}
