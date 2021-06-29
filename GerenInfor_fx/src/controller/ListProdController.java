package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Bd;
import model.Produto;

public class ListProdController {

    @FXML
    private TableView<Produto> listProds;
    @FXML
    private TableColumn<Produto, Integer> colCodigo;
    @FXML
    private TableColumn<Produto, String> colNome;
    @FXML
    private TableColumn<Produto, String> colMarca;
    @FXML
    private TableColumn<Produto, Double> colValor;
    @FXML
    private TableColumn<Produto, Integer> colEstoque;

    @FXML
    protected void initialize(){
        colCodigo.setCellValueFactory(
                new PropertyValueFactory<>("COD."));
        colNome.setCellValueFactory(
                new PropertyValueFactory<>("NOME"));
        colMarca.setCellValueFactory(
                new PropertyValueFactory<>("MARCA"));
        colValor.setCellValueFactory(
                new PropertyValueFactory<>("VALOR"));
        colEstoque.setCellValueFactory(
                new PropertyValueFactory<>("QTD."));
        upLista();
    }


    @FXML
    protected void vltMenu(ActionEvent e){
        Main.changeScreen("menu");
    }

    @FXML
    private void upLista(){
        Bd.lerBdProduto();
        listProds.setItems(FXCollections.observableArrayList(Bd.prodsBd));
        listProds.getColumns().addAll(colCodigo, colNome, colMarca, colValor, colEstoque);
    }
}
