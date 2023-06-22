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

public class BorrowRequestsListController implements Initializable {
    @FXML
    private TableView<BorrowRequest> tableView;
    @FXML
    private TableColumn<BorrowRequest, String> bName;
    @FXML
    private TableColumn<BorrowRequest, String> bSubject;
    @FXML
    private TableColumn<BorrowRequest, String> memberName;
    @FXML
    private Button BackBtn;
    @FXML
    private Button rejectBtn;
    @FXML
    private Button acceptBook;
    ObservableList<BorrowRequest> list = FXCollections.observableArrayList(
            borrowRequestList
    );
    ObservableList<BorrowRequest> selectedBook, allRequests;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bName.setCellValueFactory(new PropertyValueFactory<BorrowRequest,String>("bookName"));
        bSubject.setCellValueFactory(new PropertyValueFactory<BorrowRequest,String>("bookSubject"));
        memberName.setCellValueFactory(new PropertyValueFactory<BorrowRequest,String>("firstName"));
        tableView.setItems(list);
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
            borrowRequestList.remove(rejectedIndex);
            System.out.println(borrowRequestList.size());
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
            String bookName = borrowRequestList.get(acceptedIndex).getBook().getBookName();
            String bookSubject = borrowRequestList.get(acceptedIndex).getBook().getBookSubject();
            String id = borrowRequestList.get(acceptedIndex).getBook().getBookId();
            double price = borrowRequestList.get(acceptedIndex).getBook().getBookPrice();
            Publisher publisher = borrowRequestList.get(acceptedIndex).getBook().getPublisher();
            Author author = borrowRequestList.get(acceptedIndex).getBook().getAuthor();

            Book book = new Book(bookName , id , bookSubject , price , false , publisher , author);

            lMembersList.get(memberIndex).getMemberBorrowedBooksList().add(book);
            borrowRequestList.remove(acceptedIndex);

            selectedBook.forEach(allRequests::remove);
            borrowRequestList.remove(acceptedIndex);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }



    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLEmployeePage();
    }
}
