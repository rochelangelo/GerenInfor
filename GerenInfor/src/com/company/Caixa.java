package com.company;

public class Caixa extends Usuario{

    public Caixa(String nome, String cpf, int idade){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setTipo("caixa");
    }
}
