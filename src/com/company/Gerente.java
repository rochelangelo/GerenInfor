package com.company;


import java.util.Scanner;

public class Gerente extends Usuario{

    public Gerente(String nome, String cpf, int idade){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setId(idade);
        this.setTipo("gerente");
    }


    public Usuario cadUsuario(String nome, String cpf, int idade, String tipo){
        if(tipo.equals("tecnico")){
            Tecnico novoTecnico = new Tecnico(nome, cpf, idade);
            return novoTecnico;
        }else if (tipo.equals("caixa")){
            Caixa novoCaixa = new Caixa(nome, cpf, idade);
            return novoCaixa;
        }else if (tipo.equals("gerente")){
            Gerente novoGerente = new Gerente(nome, cpf, idade);
            return novoGerente;
        }else {
            System.out.print(tipo + " não é um tipo válido!");
            return null;
        }
    }

    public Produto cadProduto(int codigo, String nome, String marca, double valor, int quantidade){
        Produto novoProduto = new Produto(codigo, nome, marca, valor, quantidade);
        return novoProduto;
    }

    public String dadosGerente(){
        return "Gerente " + getNome() + " portador do cpf " + getCpf();
    }
}
