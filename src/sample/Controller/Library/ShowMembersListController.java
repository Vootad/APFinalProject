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
import sample.Model.LibraryP.LMember;
import sample.Model.LibraryP.MemberRequest;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.lMembersList;
import static sample.AL.memberRequests;

public class ShowMembersListController implements Initializable {
    @FXML
    private TableView<LMember> tableView;
    @FXML
    private TableColumn<LMember, String> fNameC;
    @FXML
    private TableColumn<LMember, String> lNameC;
    @FXML
    private TableColumn<LMember, String> ageC;
    @FXML
    private TableColumn<LMember, String> phoneNumberC;
    @FXML
    private Button BackBtn;
    @FXML
    private Button deleteBtn;


    ObservableList<LMember> list = FXCollections.observableArrayList(
            lMembersList
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fNameC.setCellValueFactory(new PropertyValueFactory<LMember,String>("firstName"));
        lNameC.setCellValueFactory(new PropertyValueFactory<LMember,String>("lastName"));
        ageC.setCellValueFactory(new PropertyValueFactory<LMember,String>("Age"));
        phoneNumberC.setCellValueFactory(new PropertyValueFactory<LMember,String>("phoneNumber"));
        tableView.setItems(list);
    }


    @FXML
    public void deleteROW(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.deleteBtn.getScene().getWindow();
        deleteRow();
    }
    public void deleteRow(){
        try{
            ObservableList<LMember> memberSelected, allMembers;
            allMembers = tableView.getItems();
            memberSelected = tableView.getSelectionModel().getSelectedItems();
            memberSelected.forEach(allMembers::remove);

            int deletedIndex = tableView.getSelectionModel().getSelectedIndex();
            lMembersList.remove(deletedIndex);
            System.out.println(memberRequests.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
//                LoaderClass.ManagerLibraryPage();
    }

}
