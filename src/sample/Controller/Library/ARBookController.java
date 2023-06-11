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
import sample.Model.LibraryP.Book;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;

public class ARBookController implements Initializable {
    @FXML
    private TableView<BookDonate> tableView;
    @FXML
    private TableColumn<BookDonate, String> bName;
    @FXML
    private TableColumn<BookDonate, String> bId;
    @FXML
    private TableColumn<BookDonate, String> bSubject;
    @FXML
    private TableColumn<BookDonate, Double> bPrice;
    @FXML
    private Button BackBtn;
    @FXML
    private Button rejectBtn;
    @FXML
    private Button acceptBook;



    ObservableList<BookDonate> list = FXCollections.observableArrayList(
            bookDonateList
    );
    ObservableList<BookDonate> bookDonatesSelected, allBookDonates;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bName.setCellValueFactory(new PropertyValueFactory<BookDonate,String>("bookName"));
        bId.setCellValueFactory(new PropertyValueFactory<BookDonate,String>("bookId"));
        bSubject.setCellValueFactory(new PropertyValueFactory<BookDonate,String>("bookSubject"));
        bPrice.setCellValueFactory(new PropertyValueFactory<BookDonate,Double>("bookPrice"));
        tableView.setItems(list);
    }


    @FXML
    public void deleteROW(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.rejectBtn.getScene().getWindow();
        deleteRow();
    }
    public void deleteRow(){
        try{
            allBookDonates = tableView.getItems();
            bookDonatesSelected = tableView.getSelectionModel().getSelectedItems();
            bookDonatesSelected.forEach(allBookDonates::remove);

            int rejectedIndex = tableView.getSelectionModel().getSelectedIndex();
            bookDonateList.remove(rejectedIndex);
            System.out.println(bookDonateList.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }

    @FXML
    public void addBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.acceptBook.getScene().getWindow();
        addBook();
    }
    public void addBook() {
        try {
            allBookDonates = tableView.getItems();
            bookDonatesSelected = tableView.getSelectionModel().getSelectedItems();
            int acceptedIndex = tableView.getSelectionModel().getSelectedIndex();
            String bookName = bookDonateList.get(acceptedIndex).getBookName();
            String bookId = bookDonateList.get(acceptedIndex).getBookId();
            String bookSubject = bookDonateList.get(acceptedIndex).getBookSubject();
            double bookPrice = bookDonateList.get(acceptedIndex).getBookPrice();


                Book newBook = new Book(bookName,bookId,bookSubject,bookPrice,true);
                booksList.add(newBook);
                System.out.println("The name of new book is: " + booksList.get(booksList.size() - 1).getBookName());
                System.out.println("The id of new book is: " + booksList.get(booksList.size() - 1).getBookId());
                bookDonatesSelected.forEach(allBookDonates::remove);
                bookDonateList.remove(acceptedIndex);

        } catch (Exception e) {
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
