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
import sample.Model.Mayor;

import java.awt.*;

public class CreateHospitalController {
    @FXML
    private TextField hospitalNOfEmployees;
    @FXML
    private TextField hospitalName;
    @FXML
    private TextField hospitalNOfDepartments;
    @FXML
    private TextField hospitalConstructionCost;
    @FXML
    private TextField hospitalArea;
    @FXML
    private Button hospitalCreateBTN;
    @FXML
    private Button BackBTN;



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


    @FXML
    public void CreateHospital(){
        Stage stage = (Stage) this.hospitalCreateBTN.getScene().getWindow(); //click on Create button
        String hName = hospitalName.getText();//.toString();
        String nOfEmployees = hospitalNOfEmployees.getText();//.toString();
        String constructionCost;//.toString();
        constructionCost = hospitalConstructionCost.getText();
        String area = hospitalArea.getText();//.toString();
        String nOfDepartments = hospitalNOfDepartments.getText();//.toString();

//        if(x) {
        Hospital h = new Hospital(hName , nOfEmployees , constructionCost , area , nOfDepartments);// mayor created
        AL.HospitalList.add(h);
        ////////////////////////
        int lastH = AL.HospitalList.size()-1;
        System.out.println("Name:  " + AL.HospitalList.get(lastH).getName());
        System.out.println("saved");
        ///////////////////////

        stage.close();
        showMayorAcc();
    }
}
