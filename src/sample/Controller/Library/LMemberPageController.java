package sample.Controller.Library;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class LMemberPageController {
    @FXML
    private Button BackBTN;

    @FXML
    private Button searchBookBtn;

    @FXML
    private Button borrowedBookBtn;

    @FXML
    private Button donationBtn;

    @FXML
    private Button buyBookBtn;

    @FXML
    public void back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }







}
