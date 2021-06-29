package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Login;

import javax.rmi.PortableRemoteObject;
import javax.swing.*;

public class MenuController {

    @FXML
    protected void cadUsuario(ActionEvent e){
        if(Login.getTipoLogin() == 0){
            Main.changeScreen("cadUser");
        }else{
            JOptionPane.showMessageDialog(null,"Usuario não tem permissão","GERENINFOR-ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }

    @FXML
    protected void listUsuario(ActionEvent e){
        Main.changeScreen("listUser");
    }

    @FXML
    protected void cadProduto(ActionEvent e){
        if(Login.getTipoLogin() == 0){
            Main.changeScreen("cadProd");
        }else{
            JOptionPane.showMessageDialog(null,"Usuario não tem permissão","GERENINFOR-ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    protected void listProduto(ActionEvent e){
        Main.changeScreen("listProd");
    }



    @FXML
    protected void sairApp(ActionEvent e){
        System.exit(0);
    }
}
