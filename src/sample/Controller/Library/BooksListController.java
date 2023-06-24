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

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;
import static sample.Controller.Library.LoginLMemberController.memberIndex;

public class BooksListController implements Initializable {
    @FXML
    private TableView<Book> tableView;
    @FXML
    private TableColumn<Book, String> bookName;
    @FXML
    private TableColumn<Book, String> bookSubject;
    @FXML
    private TableColumn<Book, Double> bookPrice;
    @FXML
    private TextField borrowCode;
    @FXML
    private Button borrowBTN;

    @FXML
    private Button BackBtn;
    ObservableList<Book> bookSelected,allBooks;

    ObservableList<Book> list = FXCollections.observableArrayList(
            booksList
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<Book,String>("bookName"));
        bookSubject.setCellValueFactory(new PropertyValueFactory<Book,String>("bookSubject"));
        bookPrice.setCellValueFactory(new PropertyValueFactory<Book,Double>("bookPrice"));
        tableView.setItems(list);
    }
    @FXML
    public void BorrowBook(javafx.event.ActionEvent event){
        try {
            Stage stage = (Stage) this.borrowBTN.getScene().getWindow();
            String bCode = borrowCode.getText();
            allBooks = tableView.getItems();
            bookSelected = tableView.getSelectionModel().getSelectedItems();
            int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
            BorrowRequest borrowRequest = new BorrowRequest(booksList.get(selectedIndex), lMembersList.get(memberIndex), bCode, false);
            borrowRequestList.add(borrowRequest);
            stage.close();
            LoaderClass.ShowLMemberPage();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }

    }


//    public void editBook(){
//        try{
//            ObservableList<Book>currentTableView = tableView.getItems();
//            allBooks = tableView.getItems();
//            bookSelected = tableView.getSelectionModel().getSelectedItems();
//            for(Book newBook : currentTableView){
//                newBook.setBookName(newBookname.getText());
//                newBook.setBookSubject(newBooksubject.getText());
//                newBook.setBookPrice(Double.parseDouble(newBookprice.getText()));
//                tableView.setItems(currentTableView);
//                tableView.refresh();
//                break;
//            }
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Select a row");
//        }
//    }



    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLMemberPage();
    }
}
