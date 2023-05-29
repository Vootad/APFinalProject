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
import sample.Main;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import sample.Model.Hospital;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Model.Library;

import javax.swing.*;

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
        try{
            Stage stage = (Stage) this.libraryCreateBTN.getScene().getWindow(); //click on Create button
            String lName = libraryName.getText();//.toString();
            String constructionCost;//.toString();
            constructionCost = libraryConstructionCost.getText();
            String area = libraryArea.getText();//.toString();
            String username = lManagerUsername.getText();
            String nationalCode = lManagerNationalCode.getText();
            String password = lManagerPassword.getText();

            Library l = new Library(lName , "0", constructionCost , area , username , nationalCode , password);
            AL.LibraryList.add(l);
            ////////////////////////
            int lastL = AL.LibraryList.size()-1;
            System.out.println("Name:  " + AL.LibraryList.get(lastL).getName());
            System.out.println("saved");
            ///////////////////////
            stage.close();
            showMayorAcc();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fill in all fields!");
        }

    }




    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        showMayorAcc();
    }
    public void showMayorAcc(){
        try {
            Stage stage1 = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/MayorAccount.fxml").toUri().toURL());

            stage1.setScene(new Scene(root)); //set UserMenu scene
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



}
