package com.company;


import java.util.ArrayList;

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
            Bd.escreveBdUsuarios(novoTecnico.getNome() + ";" + novoTecnico.getCpf() +
                    ";" + novoTecnico.getIdade() + ";" + novoTecnico.getTipo());
            return novoTecnico;
        }else if (tipo.equals("caixa")){
            Caixa novoCaixa = new Caixa(nome, cpf, idade);
            Bd.escreveBdUsuarios(novoCaixa.getNome() + ";" + novoCaixa.getCpf() +
                    ";" + novoCaixa.getIdade() + ";" + novoCaixa.getTipo());
            return novoCaixa;
        }else if (tipo.equals("gerente")){
            Gerente novoGerente = new Gerente(nome, cpf, idade);
            Bd.escreveBdUsuarios(novoGerente.getNome() + ";" + novoGerente.getCpf() +
                    ";" + novoGerente.getIdade() + ";" + novoGerente.getTipo());
            return novoGerente;
        }else {
            System.out.print(tipo + " não é um tipo válido!");
            return null;
        }
    }

    public String lerUsuario(){
        Bd.lerBdUsuario();
        String saida = "";
        for( Usuario u : Bd.usersBd){
            saida = saida + u.getNome() + " - " + u.getTipo() +"\n";
        }

        return saida;
    }

    public Produto cadProduto(int codigo, String nome, String marca, double valor, int quantidade){
        Produto novoProduto = new Produto(codigo, nome, marca, valor, quantidade);
        Bd.escreveBdProdutos(novoProduto.getCodigo() + ";" + novoProduto.getNome() +
                ";" + novoProduto.getMarca() + ";" + novoProduto.getValor() + ";" + novoProduto.getEstoque());
        return novoProduto;
    }

    public String lerProduto(){
        Bd.lerBdProduto();
        String saida = "COD  -   NOME   -   MARCA   -  VALOR  -  QTD\n";
        for( Produto p : Bd.prodsBd){
            saida = saida + p.getCodigo() + " - " + p.getNome() + " - " + p.getMarca()
                    + " - " + p.getValor() + " - " + p.getEstoque() +"\n";
        }

        return saida;
    }


    public String dadosGerente(){
        return "Gerente " + getNome() + " portador do cpf " + getCpf();
    }
}
