package com.carlos.campeonato.service;

import com.carlos.campeonato.model.Time;
import com.carlos.campeonato.repository.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeService {

    private final TimeRepository timeRepository;

    public Time findById(Long id) {
        return timeRepository.findById(id).orElseThrow(() -> new RuntimeException("Time não encontrado"));
    }
}
