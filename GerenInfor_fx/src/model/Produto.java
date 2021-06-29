package model;

public class Produto {
    private int codigo, estoque;
    private String nome, marca;
    private double valor;

    public Produto (int codigo, String nome, String marca, double valor, int estoque) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setMarca(marca);
        this.setValor(valor);
        this.setEstoque(estoque);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getEstoque() {
        return estoque;
    }
}
