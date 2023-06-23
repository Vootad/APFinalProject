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
import sample.Model.LibraryP.BuyRequest;

import javax.swing.*;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;
import static sample.AL.borrowRequestList;
import static sample.Controller.Library.LoginLMemberController.memberIndex;

public class BuyBooksController implements Initializable {
    @FXML
    private TableView<Book> tableView;
    @FXML
    private TableColumn<Book, String> bookName;
    @FXML
    private TableColumn<Book, String> bookSubject;
    @FXML
    private TableColumn<Book, Double> bookPrice;
    @FXML
    private TextField buyCode;
    @FXML
    private Button buyBTN;

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
    public void BuyBook(javafx.event.ActionEvent event) {
        try {
            Stage stage = (Stage) this.buyBTN.getScene().getWindow();
            String bCode = buyCode.getText();
            allBooks = tableView.getItems();
            bookSelected = tableView.getSelectionModel().getSelectedItems();
            int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
            BuyRequest buyRequest = new BuyRequest(booksList.get(selectedIndex), lMembersList.get(memberIndex), bCode, false);
            buyRequestList.add(buyRequest);
            System.out.println(buyRequestList.get(buyRequestList.size()-1).getBuyCode());
        } catch (Exception e) {
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
