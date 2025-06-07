package me.dio.board.dtos;

import java.util.List;

public record BoardDetailsDTO(Long id,
                              String name,
                              List<BoardColumnDTO> columns) {
}
