package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Model.Buildings;
import javafx.scene.control.Button;
import sample.Model.Library;


import javax.swing.*;
import java.awt.*;
import java.nio.file.Paths;

public class FirstPageController {

    @FXML
    private Button userLogin;
    @FXML
    private Button mayorLogin;
    @FXML
    private Button librarySystem;



    @FXML
    public void goToMayorLogin(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.mayorLogin.getScene().getWindow();
        stage.close();
        LoaderClass.CreateLoginPage();
    }


    @FXML
    public void goToUserLogin(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.userLogin.getScene().getWindow();
        stage.close();
        LoaderClass.CreateUserLoginPage();
    }

    @FXML
    public void goToLibrary(javafx.event.ActionEvent event) {

        Stage stage = (Stage) this.librarySystem.getScene().getWindow();

        if (AL.LibraryList.size() == 1) {
                stage.close();
            LoaderClass.showLibraryPage();
        }
        else{
            JOptionPane.showMessageDialog(null, "There is no library!");
        }
    }
}
