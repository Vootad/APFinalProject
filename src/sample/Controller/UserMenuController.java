package sample.Controller;

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

public class UserMenuController {


//    @FXML
//    private Button signUpButton;
    @FXML
    private Button CreateMayorBTN;
    @FXML
    private Button CreateDeputyBTN;
    @FXML
    private Button CreateInspectorBTN;
    @FXML
    private Button CreateSecurityBTN;
    @FXML
    private Button CreateEmployeeBTN;
    @FXML
    private Button ListBTN;
    @FXML
    private Button BackBTN;


    @FXML
    public void goToCreateMayor(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.CreateMayorBTN.getScene().getWindow();
        stage.close();
        LoaderClass.CreateMayorPage();
    }


    @FXML
    public void goToFirstPage(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.createFirstPage();
    }






    @FXML
    public void goToCreateDeputy(javafx.event.ActionEvent event) {
        Stage stage_ = (Stage) this.CreateDeputyBTN.getScene().getWindow();
        stage_.close();
        CreateDeputyPage();
    }

    public void CreateDeputyPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateDeputy.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Create Deputy");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }




    @FXML
    public void goToCreateSecurity(javafx.event.ActionEvent event) {
        Stage stage_ = (Stage) this.CreateSecurityBTN.getScene().getWindow();
        stage_.close();
        CreateSecurityPage();
    }
    public void CreateSecurityPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateSecurity.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Create Security");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



    @FXML
    public void goToCreateInspector(javafx.event.ActionEvent event) {
        Stage stage_ = (Stage) this.CreateInspectorBTN.getScene().getWindow();
        stage_.close();
        CreateInspectorPage();
    }

    public void CreateInspectorPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateInspector.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Create Inspector");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



    public void CreateEmployeePage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateEmployee.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setTitle("Create Employee");
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    @FXML
    public void goToList(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.ListBTN.getScene().getWindow();
        stage.close();
        CreateListPage();
    }

    public void CreateListPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/List.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("List");
            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }



    public void UserMenuPage() {
        try {
            Stage mainMenuPage = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserMenu.fxml").toUri().toURL());

            mainMenuPage.setScene(new Scene(root)); //set UserMenu scene
            mainMenuPage.setResizable(false);
            mainMenuPage.show();

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
