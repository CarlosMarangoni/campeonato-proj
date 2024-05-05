package com.carlos.campeonato.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NovoConfrontoDTO {

    private String nmCampeonato;

    private Long timeA;

    private Long timeB;

    private Long timeVencedor;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dtConfronto;
}
