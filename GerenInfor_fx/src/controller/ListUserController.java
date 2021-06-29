package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Bd;
import model.Usuario;

public class ListUserController {

    @FXML
    private TableView<Usuario> listUsers;
    @FXML
    private TableColumn<Usuario, String> colNome;
    @FXML
    private TableColumn<Usuario, String> colCpf;
    @FXML
    private TableColumn<Usuario, Integer> colIdade;
    @FXML
    private TableColumn<Usuario, String> colTipo;


    @FXML
    protected void initialize(){
        colNome.setCellValueFactory(
                new PropertyValueFactory<>("nome"));
        colCpf.setCellValueFactory(
                new PropertyValueFactory<>("cpf"));
        colIdade.setCellValueFactory(
                new PropertyValueFactory<>("idade"));
        colTipo.setCellValueFactory(
                new PropertyValueFactory<>("tipo"));
        upLista();
    }


    @FXML
    protected void vltMenu(ActionEvent e){
        Main.changeScreen("menu");
    }

    @FXML
    private void upLista(){
        Bd.lerBdUsuario();
        listUsers.setItems(FXCollections.observableArrayList(Bd.usersBd));
        listUsers.getColumns().addAll(colNome, colCpf, colIdade, colTipo);
    }
}
