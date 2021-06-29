package model;


public class Servico {
    private int codigo;
    private String descricao, tecnicoResp, nomeCliente, telefoneCliente, dataEntrada, dataSaida;
    private double valor;

    public Servico(int codigo, String descricao, String tecnicoResp, String nomeCliente, String telefoneCliente, String dataEntrada, String dataSaida, double valor){
        setCodigo(codigo);
        setDescricao(descricao);
        setTecnicoResp(tecnicoResp);
        setNomeCliente(nomeCliente);
        setTelefoneCliente(telefoneCliente);
        setDataEntrada(dataEntrada);
        setDataSaida(dataSaida);
        setValor(valor);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setTecnicoResp(String tecnicoResp) {
        this.tecnicoResp = tecnicoResp;
    }

    public String getTecnicoResp() {
        return tecnicoResp;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

}
