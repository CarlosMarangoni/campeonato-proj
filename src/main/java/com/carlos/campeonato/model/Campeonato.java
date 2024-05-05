package com.carlos.campeonato.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_campeonato")
@Getter
@Setter
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeonato")
    private Long id;

    @Column(name = "nm_campeonato")
    private String nomeCampeonato;

    @Column(name = "url_logo")
    private String logo;
}
