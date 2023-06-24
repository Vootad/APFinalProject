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
import sample.Model.LibraryP.Book;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;
import static sample.Controller.Library.LoginLMemberController.memberIndex;

public class MemberBorrowedBooksListController implements Initializable {
    @FXML
    private TableView<Book> tableView;
    @FXML
    private TableColumn<Book, String> bookName;

    @FXML
    private TableColumn<Book, String> bookSubject;

    @FXML
    private TableColumn<Book, String> bookId;

    @FXML
    private Button BackBtn;

    @FXML
    private Button returnBTN;

    int memberIndex = LoginLMemberController.memberIndex;

    ObservableList<Book> bookSelected,allBooks;

    ObservableList<Book> list = FXCollections.observableArrayList(
            lMembersList.get(memberIndex).getMemberBorrowedBooksList()
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<Book,String>("bookName"));
        bookSubject.setCellValueFactory(new PropertyValueFactory<Book,String>("bookSubject"));
        bookId.setCellValueFactory(new PropertyValueFactory<Book,String>("bookId"));
        tableView.setItems(list);
    }
    @FXML
    public void returnBook(javafx.event.ActionEvent event){
        try {
            Stage stage = (Stage) this.returnBTN.getScene().getWindow();
            allBooks = tableView.getItems();
            bookSelected = tableView.getSelectionModel().getSelectedItems();
            int selectedIndex = tableView.getSelectionModel().getSelectedIndex();

            bookSelected.forEach(allBooks::remove); //remove from tableview

            Book b = lMembersList.get(memberIndex).getMemberBorrowedBooksList().get(selectedIndex);
            booksList.add(b);
            lMembersList.get(memberIndex).getMemberBorrowedBooksList().remove(selectedIndex);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
            Stage stage = (Stage) this.BackBtn.getScene().getWindow();
            stage.close();
            LoaderClass.ShowLMemberPage();
    }
}
