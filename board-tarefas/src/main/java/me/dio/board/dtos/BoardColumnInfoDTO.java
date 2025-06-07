package me.dio.board.dtos;

import me.dio.board.persistence.entities.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
