package com.marcos.springwithgradle.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;


public class FilmeDTO {

    @Size (min=5, message="Nome não pode ultrapassar o tamanho determinado")
    @NotBlank (message = "Nome é obrigatorio")
    private String nome;

    public final String getNome(){
        return nome;
    } 

    public final void setNome(String nome){
        this.nome = nome;
    }
}