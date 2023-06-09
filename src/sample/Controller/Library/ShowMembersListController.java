package sample.Controller.Library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
    private TextField newFName;
    @FXML
    private TextField newLName;
    @FXML
    private TextField newAge;
    @FXML
    private TextField newPhoneNumber;

    @FXML
    private Button BackBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private Button edit;


    ObservableList<LMember> list = FXCollections.observableArrayList(
            lMembersList
    );
    ObservableList<LMember> memberSelected, allMembers;

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
    public void editRow(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.edit.getScene().getWindow();
        editRow();
    }
    public void editRow(){
        try{
            ObservableList<LMember> currentTableData = tableView.getItems();
            allMembers = tableView.getItems();
            memberSelected = tableView.getSelectionModel().getSelectedItems();
            for(LMember lMember : currentTableData){
                lMember.setFirstName(newFName.getText());
                lMember.setLastName(newLName.getText());
                lMember.setAge(newAge.getText());
                lMember.setPhoneNumber(newPhoneNumber.getText());
                tableView.setItems(currentTableData);
                tableView.refresh();
                break;

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }
    @FXML
    void rowClicked(MouseEvent event){
        LMember clickedMember = tableView.getSelectionModel().getSelectedItem();
        newFName.setText(String.valueOf(clickedMember.getFirstName()));
        newLName.setText(String.valueOf(clickedMember.getLastName()));
        newAge.setText(String.valueOf(clickedMember.getAge()));
        newPhoneNumber.setText(String.valueOf(clickedMember.getPhoneNumber()));
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
//        LoaderClass.ManagerLibraryPage();
    }

}
