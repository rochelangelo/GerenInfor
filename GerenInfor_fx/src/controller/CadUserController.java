package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Gerente;

import javax.swing.*;

public class CadUserController {

    @FXML
    private TextField inp_nome, inp_cpf, inp_idade, inp_tipo;

    @FXML
    protected void btnCadastrar(ActionEvent e){
        if(inp_nome.getText() != null && inp_cpf.getText() != null && inp_idade.getText() != null && inp_tipo.getText() != null){
            Gerente gerente = new Gerente("adm", "0000", 21);
            String nome = inp_nome.getText();
            String cpf = inp_cpf.getText();
            int idade = Integer.parseInt(inp_idade.getText());
            String tipo = inp_tipo.getText();

            gerente.cadUsuario(nome, cpf, idade, tipo);

            JOptionPane.showMessageDialog(null,"Usuario Cadastrado","GERENINFOR",JOptionPane.OK_OPTION);
            Main.changeScreen("menu");
        }else{
            JOptionPane.showMessageDialog(null,"Usuario/Senha incorretas","GERENINFOR-ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    protected void vltMenu(ActionEvent e){
        Main.changeScreen("menu");
    }
}
