package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import sample.LoaderClass;

import java.awt.*;
import java.nio.file.Paths;

public class MayorAccountController {
    @FXML
    private Button BackBTN;         //ok
    @FXML
    private Button universityBTN;   //
    @FXML
    private Button libraryBTN;      //
    @FXML
    private Button airportBTN;       //
    @FXML
    private Button hospitalBTN;     //




    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.createFirstPage();
    }

    @FXML
    public void goToCreateHospital(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.hospitalBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        createHospital();
    }
    public void createHospital(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateHospital.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Build hospital");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



    @FXML
    public void goToCreateLibrary(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.libraryBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        createLibrary();
    }
    public void createLibrary(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateLibrary.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Build library");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }




    @FXML
    public void goToCreateAirport(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.airportBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        createAirport();
    }
    public void createAirport(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateAirport.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Build airport");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



    @FXML
    public void goToCreateUniversity(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.universityBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        createUniversity();
    }
    public void createUniversity(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateUniversity.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Build university");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }




}
