package com.carlos.campeonato.repository;

import com.carlos.campeonato.model.Campeonato;
import com.carlos.campeonato.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampeonatoRepository extends JpaRepository<Campeonato, Long> {

    Campeonato findByNomeCampeonato(String nome);
}
