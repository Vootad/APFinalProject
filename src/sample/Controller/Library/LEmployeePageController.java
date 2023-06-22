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
    @FXML
    public void gotoCreateBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.AddBookBtn.getScene().getWindow();
        stage.close();
        LoaderClass.CreateBookPage();
    }
    @FXML
    public void goToBooksList(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BooksListBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ViewBooksPage();
    }

    @FXML
    public void memberShipRequest(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.MemberShipRequestsBtn.getScene().getWindow();
//        stage.close();
        LoaderClass.ShowMemberShipRequestsPage();
    }
    @FXML
    public void gotoDonationPage(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.DonationRequestBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ARBookPage();
    }

    @FXML
    public void gotoViewMembersList(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.MembersListBtn.getScene().getWindow();
//        stage.close();
        LoaderClass.ViewMembersListPage();
    }
    @FXML
    public void goToBorrowReq(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BorrowRequestsBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ShowBorrowRequests();
    }

}
