package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import sample.Main;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Paths;

public class ListController {
    @FXML
    private Button mayorListBTN;
    @FXML
    private Button deputyListBTN;
    @FXML
    private Button inspectorListBTN;
    @FXML
    private Button securityListBTN;
    @FXML
    private Button employeeListBTN;
    @FXML
    private Button BackBTN;



    @FXML
    public void goToDeputiesList(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.deputyListBTN.getScene().getWindow();
        stage.close();
        DeputiesListPage();
    }

    public void DeputiesListPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/DeputiesList.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("Deputies info");
            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        }
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        UserLoginController sc = new UserLoginController();
        sc.UserMenuPage();
    }





}
