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
import sample.Model.LibraryP.MemberRequest;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.books;
import static sample.AL.memberRequests;

public class ViewBooksController implements Initializable {
    @FXML
    private TableView<Book> tableView;
    @FXML
    private TableColumn<Book, String> bookName;
    @FXML
    private TableColumn<Book, String> bookSubject;
    @FXML
    private TableColumn<Book, Double> bookPrice;
    @FXML
    private Button BackBtn;


    ObservableList<Book> list = FXCollections.observableArrayList(
            books
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookName.setCellValueFactory(new PropertyValueFactory<Book,String>("bookName"));
        bookSubject.setCellValueFactory(new PropertyValueFactory<Book,String>("bookSubject"));
        bookPrice.setCellValueFactory(new PropertyValueFactory<Book,Double>("bookPrice"));
        tableView.setItems(list);
    }


    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBtn.getScene().getWindow();
        stage.close();
        LoaderClass.ManagerLibraryPage();
    }
}
