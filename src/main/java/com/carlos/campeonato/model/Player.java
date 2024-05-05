package com.carlos.campeonato.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_players")
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_player")
    private Long id;

    @Column(name = "nm_player")
    private String nomeplayer;

    @Column(name = "url_twitter")
    private String urlTwitter;

    @Column(name = "nm_role")
    private String role;

}
