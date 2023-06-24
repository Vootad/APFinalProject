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
import sample.Model.LibraryP.*;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;
import static sample.Controller.Library.LoginLMemberController.memberIndex;

public class BuyRequestListController implements Initializable {
    @FXML
    private TableView<BuyRequest> tableView;
    @FXML
    private TableColumn<BuyRequest, String> bName;
    @FXML
    private TableColumn<BuyRequest, String> bSubject;
    @FXML
    private TableColumn<BuyRequest, String> memberName;
    @FXML
    private Button BackBtn;
    @FXML
    private Button rejectBtn;
    @FXML
    private Button acceptBook;
    ObservableList<BuyRequest> list = FXCollections.observableArrayList(
            buyRequestList
    );
    ObservableList<BuyRequest> selectedBook, allRequests;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bName.setCellValueFactory(new PropertyValueFactory<BuyRequest,String>("bookName"));
        bSubject.setCellValueFactory(new PropertyValueFactory<BuyRequest,String>("bookSubject"));
        memberName.setCellValueFactory(new PropertyValueFactory<BuyRequest,String>("fName"));
        tableView.setItems(list);
    }


    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        LoaderClass.ShowLEmployeePage();
    }
    @FXML
    public void rejectBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.rejectBtn.getScene().getWindow();
        deleteRow();
    }
    public void deleteRow(){
        try{
            allRequests = tableView.getItems();
            selectedBook = tableView.getSelectionModel().getSelectedItems();
            selectedBook.forEach(allRequests::remove);

            int rejectedIndex = tableView.getSelectionModel().getSelectedIndex();
            buyRequestList.remove(rejectedIndex);
            System.out.println(buyRequestList.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }

    @FXML
    public void addBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.acceptBook.getScene().getWindow();
        accept();
    }
    public void accept() {
        try {
            allRequests = tableView.getItems();
            selectedBook = tableView.getSelectionModel().getSelectedItems();
            int acceptedIndex = tableView.getSelectionModel().getSelectedIndex();
            String bookName = buyRequestList.get(acceptedIndex).getBook().getBookName();
            String bookSubject = buyRequestList.get(acceptedIndex).getBook().getBookSubject();
            String id = buyRequestList.get(acceptedIndex).getBook().getBookId();
            double price = buyRequestList.get(acceptedIndex).getBook().getBookPrice();
            Publisher publisher = buyRequestList.get(acceptedIndex).getBook().getPublisher();
            Author author = buyRequestList.get(acceptedIndex).getBook().getAuthor();

            Book book = new Book(bookName , id , bookSubject , price , false , publisher , author);

            lMembersList.get(memberIndex).getMemberBorrowedBooksList().add(book);
            buyRequestList.remove(acceptedIndex);

            selectedBook.forEach(allRequests::remove);
            buyRequestList.remove(acceptedIndex);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }
    
}
