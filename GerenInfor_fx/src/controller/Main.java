package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import model.Bd;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScreen;
    private static Scene menuScreen;
    private static Scene cUserScreen;
    private static Scene lUserScreen;
    private static Scene cProdScreen;
    private static Scene lProdScreen;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("GERENINFOR");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("../view/mainScreen.fxml"));
        mainScreen = new Scene(fxmlMain, 300, 150);

        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("../view/menuScreen.fxml"));
        menuScreen = new Scene(fxmlMenu, 600, 400);

        Parent fxmlCUser = FXMLLoader.load(getClass().getResource("../view/cadUsuario.fxml"));
        cUserScreen = new Scene(fxmlCUser, 800, 600);

        Parent fxmlLUser = FXMLLoader.load(getClass().getResource("../view/listUsuario.fxml"));
        lUserScreen = new Scene(fxmlLUser, 800, 600);

        Parent fxmlCProd = FXMLLoader.load(getClass().getResource("../view/cadProduto.fxml"));
        cProdScreen = new Scene(fxmlCProd, 800, 600);

        Parent fxmlLProd = FXMLLoader.load(getClass().getResource("../view/listProduto.fxml"));
        lProdScreen = new Scene(fxmlLProd, 800, 600);


        primaryStage.setScene(mainScreen);
        primaryStage.show();


        Bd.init();
    }

    public static void changeScreen(String tela){
        switch (tela){
            case "menu":
                stage.setScene(menuScreen);
                break;

            case "cadUser":
                stage.setScene(cUserScreen);
                break;

            case "listUser":
                stage.setScene(lUserScreen);
                break;

            case "cadProd":
                stage.setScene(cProdScreen);
                break;

            case "listProd":
                stage.setScene(lProdScreen);
                break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
