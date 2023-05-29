package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.nio.file.Paths;

import javafx.scene.control.TextField;

import javax.swing.*;

public class UserLoginController {
    @FXML
    private TextField userLoginUsername;
    @FXML
    private PasswordField userLoginPassword;
    @FXML
    private Button userLoginBTN;

    @FXML
    public void goToUserAccount(javafx.event.ActionEvent event) {

        Stage stage = (Stage) this.userLoginBTN.getScene().getWindow(); //click on login button
        String userName = userLoginUsername.getText();//.toString();
        String password = userLoginPassword.getText();//.toString();
        //    String userUsername = "Super user";
        //    String userPassword = "SUser00";
        if (userName.equals("Super user") && password.equals("SUser00")) {
            stage.close();
            UserMenuPage();
        }
        else{
            JOptionPane.showMessageDialog(null, "something is wrong");}
    }

    public void UserMenuPage() {
        try {
            Stage mainMenuPage = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserMenu.fxml").toUri().toURL());

            mainMenuPage.setScene(new Scene(root)); //set UserMenu scene
            mainMenuPage.setResizable(false);
//            mainMenuPage.setTitle(userName +  "account:");
            mainMenuPage.show();

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}

