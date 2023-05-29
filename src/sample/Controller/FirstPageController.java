package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Model.Buildings;
import javafx.scene.control.Button;


import java.awt.*;
import java.nio.file.Paths;

public class FirstPageController {

    @FXML
    private Button userLogin;
    @FXML
    private Button mayorLogin;
    @FXML
    private Button librarySystem;


//    String userUsername = "Super user";
//    String userPassword = "SUser00";

    @FXML
    public void goToMayorLogin(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.mayorLogin.getScene().getWindow();
        stage.close();
        CreateLoginPage();
    }

    public void CreateLoginPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/LoginMayor.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("Mayor login page");

            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    @FXML
    public void goToUserLogin(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.userLogin.getScene().getWindow();
        stage.close();
        CreateUserLoginPage();
    }

    public void CreateUserLoginPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserLogin.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("User login page");

            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    @FXML
    public void goToLibrary(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.userLogin.getScene().getWindow();
        stage.close();
        CreateLibraryPage();
    }

    public void CreateLibraryPage(){
//        try {
//            Stage stage = new Stage();
//            FXMLLoader loader = new FXMLLoader();
//            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library.fxml").toUri().toURL());
//
//            stage.setScene(new Scene(root));
//            stage.setTitle("Library page");
//
//            stage.setResizable(false);
//            stage.show();
//        }
//        catch (Exception e) {
//            System.out.println("Exception");
//        }
    }
}
