package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class MaanagerPageController {
    @FXML
    private Button Create_btn;
    @FXML
    private Button View_Btn;
    @FXML
    private Button Memebers_Btn;
    @FXML
    private Button Authors_Btn;
    @FXML
    private Button BackBTN;
    @FXML
    public void gotoCreatePage(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.Create_btn.getScene().getWindow();
        stage.close();
        LoaderClass.CreateEmployeeOfLibaryPage();
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }

}
