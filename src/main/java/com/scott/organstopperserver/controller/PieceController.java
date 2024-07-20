package com.scott.organstopperserver.controller;

import com.scott.organstopperserver.exception.PieceNotFoundException;
import com.scott.organstopperserver.model.entity.piece.Piece;
import com.scott.organstopperserver.service.PieceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PieceController {
    private final PieceService pieceService;

    PieceController(PieceService pieceService) {
        this.pieceService = pieceService;
    }

    @GetMapping("/piece/{id}")
    public ResponseEntity<Piece> getPieceById(@PathVariable Long id) throws PieceNotFoundException {
        return ResponseEntity.ok(pieceService.getPieceById(id));
    }
}
