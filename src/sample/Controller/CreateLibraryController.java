package sample.Controller;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.awt.*;
import java.nio.file.Paths;

import javafx.scene.control.TextField;
import sample.AL;
import sample.LoaderClass;
import sample.Main;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import sample.Model.Hospital;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Model.Library;

import javax.swing.*;

import static sample.LoaderClass.*;

public class CreateLibraryController {
    @FXML
    private TextField lManagerNationalCode;
    @FXML
    private TextField libraryName;
    @FXML
    private TextField lManagerUsername;
    @FXML
    private TextField lManagerPassword;
    @FXML
    private TextField libraryConstructionCost;
    @FXML
    private TextField libraryArea;
    @FXML
    private Button libraryCreateBTN;
    @FXML
    private Button BackBTN;








    @FXML
    public void CreateLibrary(){
        if (AL.LibraryList.size() == 0) {
            try {
                Stage stage = (Stage) this.libraryCreateBTN.getScene().getWindow(); //click on Create button
                String lName = libraryName.getText();//.toString();
                String constructionCost;//.toString();
                constructionCost = libraryConstructionCost.getText();
                String area = libraryArea.getText();//.toString();
                String username = lManagerUsername.getText();
                String nationalCode = lManagerNationalCode.getText();
                String password = lManagerPassword.getText();

                Library l = new Library(lName, "0", constructionCost, area, username, nationalCode, password);
                AL.LibraryList.add(l);
                ////////////////////////
                int lastL = AL.LibraryList.size() - 1;
                System.out.println("Name:  " + AL.LibraryList.get(lastL).getName());
                System.out.println("saved");
                ///////////////////////
                stage.close();
                LoaderClass.showMayorAcc();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Fill in all fields correctly!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "You can create only 1 library!");
        }
    }



    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.showMayorAcc();
    }



}
