package com.carlos.campeonato.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_time")
@Getter
@Setter
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_time")
    private Long id;

    @Column(name = "nm_time")
    private String nomeTime;

    @Column(name = "url_logo")
    private String urlLogo;

    @Column(name = "url_twitter")
    private String urlTwitter;

}
