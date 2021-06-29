package controller;

import javafx.fxml.FXML;

import javax.swing.*;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Login;

public class LoginController {


    @FXML
    private TextField inp_user;
    @FXML
    private PasswordField inp_senha;

    @FXML
    protected void login(ActionEvent e){
        String usuario;
        String senha;
        usuario = inp_user.getText();
        senha = inp_senha.getText();
        Boolean logado = Login.logar(usuario, senha);
        if(logado){
            if(Login.getTipoLogin() == 0) {
                Main.changeScreen("menu");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Usuario/Senha incorretas","GERENINFOR-ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }


    @FXML
    protected void sairApp(ActionEvent e){
        System.exit(0);
    }
}
