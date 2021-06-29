package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Gerente;

import javax.swing.*;

public class CadProdController {

    @FXML
    private TextField inp_codigo, inp_estoque, inp_nome, inp_marca, inp_valor;

    @FXML
    protected void btnCadastrar(ActionEvent e){
        if(inp_codigo.getText() != null && inp_estoque.getText() != null && inp_nome.getText() != null && inp_marca.getText() != null && inp_valor.getText() != null){
            Gerente gerente = new Gerente("adm", "0000", 21);
            int codigo = Integer.parseInt(inp_codigo.getText());
            int estoque = Integer.parseInt(inp_estoque.getText());
            String nome = inp_nome.getText();
            String marca = inp_marca.getText();
            double valor = Double.parseDouble(inp_valor.getText());

            gerente.cadProduto(codigo, nome, marca, valor, estoque);

            JOptionPane.showMessageDialog(null,"Produto Cadastrado","GERENINFOR",JOptionPane.YES_OPTION);
            Main.changeScreen("menu");
            inp_codigo.setText("");
            inp_nome.setText("");
            inp_estoque.setText("");
            inp_marca.setText("");
            inp_valor.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Campos Incompletos","GERENINFOR-ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    protected void vltMenu(ActionEvent e){
        Main.changeScreen("menu");
    }
}
