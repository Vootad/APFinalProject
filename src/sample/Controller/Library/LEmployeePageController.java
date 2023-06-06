package sample.Controller.Library;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.LoaderClass;

public class LEmployeePageController {

        @FXML
        private Button BackBTN;

        @FXML
        private Button AddBookBtn;

        @FXML
        private Button BooksListBtn;

        @FXML
        private Button MembersListBtn;

        @FXML
        private Button DonationRequestBtn;

        @FXML
        private Button BorrowRequestsBtn;

        @FXML
        private Button MemberShipRequestsBtn;


    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }

}