package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;

import javax.swing.*;

public class LoginLManagerController {
    @FXML
    private TextField lManagerLoginUsername;
    @FXML
    private TextField lManagerLoginPassword;
    @FXML
    private Button lManagerLoginBTN;
    @FXML
    private Button backBTN;


    @FXML
    public void back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.backBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }

    @FXML
    public void goToLManagerAccount(javafx.event.ActionEvent event){
        try {
             Stage stage = (Stage) this.lManagerLoginBTN.getScene().getWindow();
             String userName = lManagerLoginUsername.getText();
             String password = lManagerLoginPassword.getText();
             if (AL.LibraryList.get(0).getlManagerUsername().equals(userName) && AL.LibraryList.get(0).getlManagerPassword().equals(password)) {
                 stage.close();
              LoaderClass.ManagerLibraryPage();
             }
             else {
                JOptionPane.showMessageDialog(null, "Wrong username or password");
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Try again");
        }
    }



}
