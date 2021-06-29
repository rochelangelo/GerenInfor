package model;

public class Tecnico extends Usuario{

    public Tecnico(String nome, String cpf, int idade){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setTipo("tecnico");
    }

    public void realizaServico(){

    }
}
