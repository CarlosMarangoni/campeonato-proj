package com.carlos.campeonato.controller;

import com.carlos.campeonato.dto.NovoConfrontoDTO;
import com.carlos.campeonato.model.Confronto;
import com.carlos.campeonato.repository.ConfrontoRepository;
import com.carlos.campeonato.service.ConfrontoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/confrontos")
public class ConfrontoController {

    private final ConfrontoRepository confrontoRepository;
    private final ConfrontoService confrontoService;

    @GetMapping
    public List<Confronto> getConfrontos() {
        return confrontoService.getConfrontos();
    }

    @GetMapping("/{id}")
    public Confronto getConfronto(@PathVariable Long id) {
        return confrontoRepository.findById(id).orElseThrow(() -> new RuntimeException("Confronto não encontrado"));
    }

    @PostMapping
    public ResponseEntity<Confronto> novoConfronto(@RequestBody NovoConfrontoDTO novoConfrontoDTO) {

        Confronto confronto = confrontoService.novoConfronto(novoConfrontoDTO);

        // Criar o URI para o recurso criado. Supõe que você pode identificá-lo por um ID.
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(confronto.getId())
                .toUri();

        return ResponseEntity.created(location).body(confronto);
    }
}
