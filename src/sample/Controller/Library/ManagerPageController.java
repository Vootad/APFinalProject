package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class ManagerPageController {
    @FXML
    private Button CreateEmployee_btn;
    @FXML
    private Button View_Btn;
    @FXML
    private Button MembersList_Btn;
    @FXML
    private Button AuthorsList_Btn;
    @FXML
    private Button BackBTN;
    @FXML
    public void gotoCreateEmployeePage(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.CreateEmployee_btn.getScene().getWindow();
        stage.close();
        LoaderClass.CreateEmployeeOfLibaryPage();
    }
    @FXML
    public void gotoViewEmployeePage(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.View_Btn.getScene().getWindow();
        stage.close();
        LoaderClass.ViewEmployeeOfLibaryPage();

    }

    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }

}
