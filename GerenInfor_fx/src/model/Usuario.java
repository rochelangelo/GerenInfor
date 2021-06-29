package model;

public class Usuario {
    private int id, idade;
    private String nome, cpf, tipo;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public boolean logar (String usuario, String senha){
        if(getNome().equals(usuario) && getCpf().equals(cpf)){
            return true;
        }else{
            return false;
        }
    }

}
