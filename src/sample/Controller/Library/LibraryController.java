package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class LibraryController {
    @FXML
    private Button BackBTN;
    @FXML
    private Button loginToEmpBTN;
    @FXML
    private Button loginToLibraryManagerBTN;
    @FXML
    private Button loginToLibraryMemberBTN;
    @FXML
    private Button createLibraryMemberAcc;




    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.createFirstPage();
    }

    @FXML
    public void goToLoginManager(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.loginToLibraryManagerBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.showLoginManagerPage();
    }
    @FXML
    public void goToMemberRequest(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.createLibraryMemberAcc.getScene().getWindow(); //click on sign up button
        stage.close();
        LoaderClass.CreateMembershipRequest();
    }

}
