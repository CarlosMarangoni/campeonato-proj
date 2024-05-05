package com.carlos.campeonato.controller;

import com.carlos.campeonato.model.Time;
import com.carlos.campeonato.repository.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/times")
public class TimeController {

    private final TimeRepository timeRepository;

    @GetMapping
    public List<Time> getTimes() {
        return timeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Time getTime(@PathVariable Long id) {
        return timeRepository.findById(id).orElseThrow(() -> new RuntimeException("Time não encontrado"));
    }
}
