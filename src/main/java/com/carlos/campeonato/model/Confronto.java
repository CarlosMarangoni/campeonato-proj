package com.carlos.campeonato.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_confrontos")
@Getter
@Setter
public class Confronto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_confronto")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id_time_a")
    private Time timeA;

    @ManyToOne
    @JoinColumn(name = "id_time_b")
    private Time timeB;

    @ManyToOne
    @JoinColumn(name = "id_time_vencedor")
    private Time timeVencedor;

    @ManyToOne
    @JoinColumn(name = "id_campeonato")
    private Campeonato campeonato;

    @Column(name = "dt_confronto")
    private Date dtConfronto;

}
