package com.carlos.campeonato.repository;

import com.carlos.campeonato.model.Confronto;
import com.carlos.campeonato.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConfrontoRepository extends JpaRepository<Confronto, Long> {


    @Query("SELECT c FROM Confronto c order by dtConfronto DESC")
    List<Confronto> findAllConfrontos();
}
