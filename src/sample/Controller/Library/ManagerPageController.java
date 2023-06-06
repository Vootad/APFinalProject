package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class ManagerPageController {
    @FXML
    private Button CreateEmployee_btn;
    @FXML
    private Button employeeListBtn;
    @FXML
    private Button MembersListBtn;
    @FXML
    private Button AuthorsListBtn;
    @FXML
    private Button PublishersListBtn;
    @FXML
    private Button memberShipRequestBtn;
    @FXML
    private Button BackBTN;

    @FXML
    public void gotoCreateEmployeePage(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.CreateEmployee_btn.getScene().getWindow();
        stage.close();
        LoaderClass.CreateEmployeeOfLibraryPage();
    }

    @FXML
    public void gotoViewEmployeePage(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.employeeListBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ViewEmployeeOfLibraryPage();
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }

    @FXML
    public void memberShipRequest(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.memberShipRequestBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ShowMemberShipRequestsPage();
    }

}
