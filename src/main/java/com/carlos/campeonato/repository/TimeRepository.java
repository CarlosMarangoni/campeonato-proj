package com.carlos.campeonato.repository;

import com.carlos.campeonato.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}
