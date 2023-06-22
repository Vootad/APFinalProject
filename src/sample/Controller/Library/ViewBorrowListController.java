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
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.Book;
import sample.Model.LibraryP.BorrowRequest;
import sample.Model.LibraryP.MemberRequest;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;
import static sample.AL.memberRequests;

public class ViewBorrowListController implements Initializable {
    @FXML
    private TableView<BorrowRequest> tableView;
    @FXML
    private TableColumn<BorrowRequest, String> bookName;
    @FXML
    private TableColumn<BorrowRequest, String> borrowCode;
    @FXML
    private Button Delete_Btn;


    @FXML
    private Button BackBtn;


    ObservableList<BorrowRequest> list = FXCollections.observableArrayList(
            borrowRequestList
    );
    ObservableList<BorrowRequest> borrowRequestSelected, allBorrowRequests;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<BorrowRequest,String>("bookName"));
        borrowCode.setCellValueFactory(new PropertyValueFactory<BorrowRequest,String>("borrowCode"));
        tableView.setItems(list);
    }
    @FXML
    public void deleteFromBorrowList(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.Delete_Btn.getScene().getWindow();
        deleteFromBorrowList();
    }
    public void deleteFromBorrowList(){
        try{
            allBorrowRequests = tableView.getItems();
            borrowRequestSelected = tableView.getSelectionModel().getSelectedItems();
            borrowRequestSelected.forEach(allBorrowRequests::remove);
            int rejectedIndex = tableView.getSelectionModel().getSelectedIndex();
            borrowRequestList.remove(rejectedIndex);
            System.out.println(borrowRequestList.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }
    @FXML
    public void back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLMemberPage();
    }

}
