package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Main;
import sample.Model.Mayor;

import javax.swing.*;
import java.nio.file.Paths;

import static com.sun.glass.ui.Cursor.setVisible;

public class LoginMayorController {

    @FXML
    private TextField loginFName;
    @FXML
    private TextField loginLName;
    @FXML
    private TextField loginPassword;
    @FXML
    private Button BackBTN;
    @FXML
    private Button LoginBTN;
    @FXML
    private TextField error;

    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.createFirstPage();
        //set it on action
    }

    @FXML
    public void Login(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.LoginBTN.getScene().getWindow();
        String fName = loginFName.getText();//.toString();
        String lName = loginLName.getText();//.toString();
        String password = loginPassword.getText();//.toString();



        if(AL.MayorList.size()==1) {
            Mayor m = AL.MayorList.get(0);
            if (m.getfName().equals(fName) && m.getlName().equals(lName) && m.getPassword().equals(password)) {

                System.out.println("Login successfully");
                stage.close();
                //load another fxml file instead
                createMayorAccountPage();
            } else {//set a text for that label
                JOptionPane.showMessageDialog(null, "something is wrong");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "There is no mayor");
        }

    }


    public void createMayorAccountPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/MayorAccount.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("Mayor Account page");

            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


}
