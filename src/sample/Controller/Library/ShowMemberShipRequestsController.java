package sample.Controller.Library;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;
import sample.Model.LibraryP.MemberRequest;

import java.net.URL;
import java.util.ResourceBundle;
import static sample.AL.memberRequests;

public class ShowMemberShipRequestsController implements Initializable {
        @FXML
        private TableView<MemberRequest> tableView;
        @FXML
        private TableColumn<MemberRequest, String> fNameC;
        @FXML
        private TableColumn<MemberRequest, String> lNameC;
        @FXML
        private TableColumn<MemberRequest, String> ageC;
        @FXML
        private TableColumn<MemberRequest, String> phoneNumberC;
        @FXML
        private Button BackBtn;


        ObservableList<MemberRequest> list = FXCollections.observableArrayList(
                memberRequests
        );

        @Override
        public void initialize(URL location, ResourceBundle resources) {
                fNameC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("firstName"));
                lNameC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("lastName"));
                ageC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("Age"));
                phoneNumberC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("phoneNumber"));
                tableView.setItems(list);
        }


        @FXML
        public void Back(javafx.event.ActionEvent event){
                Stage stage = (Stage) this.BackBtn.getScene().getWindow();
                stage.close();
                LoaderClass.ManagerLibraryPage();
        }

    }

