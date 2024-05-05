package com.carlos.campeonato.controller;

import com.carlos.campeonato.model.Player;
import com.carlos.campeonato.model.Time;
import com.carlos.campeonato.repository.PlayerRepository;
import com.carlos.campeonato.repository.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/players")
public class PlayerController {

    private final PlayerRepository playerRepository;

    @GetMapping
    public List<Player> getPlayers() {

        return playerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable Long id) {

        return playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player não encontrado"));
    }
}
