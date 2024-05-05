package com.carlos.campeonato.repository;

import com.carlos.campeonato.model.Player;
import com.carlos.campeonato.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
