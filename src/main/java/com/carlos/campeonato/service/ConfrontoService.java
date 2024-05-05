package com.carlos.campeonato.service;

import com.carlos.campeonato.dto.NovoConfrontoDTO;
import com.carlos.campeonato.model.Campeonato;
import com.carlos.campeonato.model.Confronto;
import com.carlos.campeonato.model.Time;
import com.carlos.campeonato.repository.CampeonatoRepository;
import com.carlos.campeonato.repository.ConfrontoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ConfrontoService {

    private final ConfrontoRepository confrontoRepository;
    private final CampeonatoRepository campeonatoRepository;
    private final TimeService timeService;

    public Confronto novoConfronto(NovoConfrontoDTO novoConfrontoDTO) {

        Confronto confronto = buildNewConfronto(novoConfrontoDTO);
        return confrontoRepository.save(confronto);
    }

    public List<Confronto> getConfrontos() {

        return confrontoRepository.findAllConfrontos();
    }


    private Confronto buildNewConfronto(NovoConfrontoDTO novoConfrontoDTO) {
        List<Time> times = new ArrayList<>();
        Confronto confronto = new Confronto();
        Campeonato campeonato = campeonatoRepository.findByNomeCampeonato(novoConfrontoDTO.getNmCampeonato());
        Time timeA = timeService.findById(novoConfrontoDTO.getTimeA());
        Time timeB = timeService.findById(novoConfrontoDTO.getTimeB());
        times.add(timeA);
        times.add(timeB);
        Time vencedor = times.stream().filter(time -> time.getId().equals(novoConfrontoDTO.getTimeVencedor())).
                findAny().orElseThrow(() -> new RuntimeException("Time vencedor não encontrado"));

        confronto.setTimeA(timeA);
        confronto.setTimeB(timeB);
        confronto.setTimeVencedor(vencedor);
        confronto.setCampeonato(campeonato);
        confronto.setDtConfronto(novoConfrontoDTO.getDtConfronto());

        return confronto;
    }
}
