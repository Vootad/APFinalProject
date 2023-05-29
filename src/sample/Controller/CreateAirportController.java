package sample.Controller;
import javafx.scene.control.Button;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.Model.Airport;
import sample.Model.Hospital;

import java.awt.*;
import java.nio.file.Paths;

public class CreateAirportController {
    @FXML
    private Button BackBTN;
    @FXML
    private javafx.scene.control.TextField airportNOfEmployees;
    @FXML
    private javafx.scene.control.TextField airportName;
    @FXML
    private javafx.scene.control.TextField airportConstructionCost;
    @FXML
    private TextField airportArea;
    @FXML
    private Button airportCreateBTN;





    @FXML
    public void CreateAirport(){
        Stage stage = (Stage) this.airportCreateBTN.getScene().getWindow(); //click on Create button
        String hName = airportName.getText();//.toString();
        String nOfEmployees = airportNOfEmployees.getText();//.toString();
        String constructionCost;//.toString();
        constructionCost = airportConstructionCost.getText();
        String area = airportArea.getText();//.toString();

        Airport a = new Airport(hName , nOfEmployees , constructionCost , area);// Airport created
        AL.AirportList.add(a);
        ////////////////////////
        int lastH = AL.AirportList.size()-1;
        System.out.println("Name:  " + AL.AirportList.get(lastH).getName());
        System.out.println("saved");
        ///////////////////////
        stage.close();
        showMayorAcc();
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
