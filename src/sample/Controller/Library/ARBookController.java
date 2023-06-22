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
import sample.Model.LibraryP.Author;
import sample.Model.LibraryP.Book;
import sample.Model.LibraryP.DonationRequest;
import sample.Model.LibraryP.Publisher;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.*;

public class ARBookController implements Initializable {
    @FXML
    private TableView<DonationRequest> tableView;
    @FXML
    private TableColumn<DonationRequest, String> bName;
    @FXML
    private TableColumn<DonationRequest, String> bId;
    @FXML
    private TableColumn<DonationRequest, String> bSubject;
    @FXML
    private TableColumn<DonationRequest, String> memberName;
    @FXML
    private Button BackBtn;
    @FXML
    private Button rejectBtn;
    @FXML
    private Button acceptBook;
    ObservableList<DonationRequest> list = FXCollections.observableArrayList(
            donationRequestList
    );
    ObservableList<DonationRequest> bookDonatesSelected, allBookDonates;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bName.setCellValueFactory(new PropertyValueFactory<DonationRequest,String>("bookName"));
        bId.setCellValueFactory(new PropertyValueFactory<DonationRequest,String>("bookId"));
        bSubject.setCellValueFactory(new PropertyValueFactory<DonationRequest,String>("bookSubject"));
        memberName.setCellValueFactory(new PropertyValueFactory<DonationRequest,String>("firstName"));
        tableView.setItems(list);
    }


    @FXML
    public void rejectBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.rejectBtn.getScene().getWindow();
        deleteRow();
    }
    public void deleteRow(){
        try{
            allBookDonates = tableView.getItems();
            bookDonatesSelected = tableView.getSelectionModel().getSelectedItems();
            bookDonatesSelected.forEach(allBookDonates::remove);

            int rejectedIndex = tableView.getSelectionModel().getSelectedIndex();
            donationRequestList.remove(rejectedIndex);
            System.out.println(donationRequestList.size());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select a row");
        }
    }

    @FXML
    public void AddBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.acceptBook.getScene().getWindow();
        addBook();
    }
    public void addBook() {
        try {
            allBookDonates = tableView.getItems();
            bookDonatesSelected = tableView.getSelectionModel().getSelectedItems();
            int acceptedIndex = tableView.getSelectionModel().getSelectedIndex();
            String bookName = donationRequestList.get(acceptedIndex).getBook().getBookName();
            String bookId = donationRequestList.get(acceptedIndex).getBook().getBookId();
            String bookSubject = donationRequestList.get(acceptedIndex).getBook().getBookSubject();
            double bookPrice = donationRequestList.get(acceptedIndex).getBook().getBookPrice();
            Publisher publisher = donationRequestList.get(acceptedIndex).getBook().getPublisher();
            Author author = donationRequestList.get(acceptedIndex).getBook().getAuthor();


                Book newBook = new Book(bookName,bookId,bookSubject,bookPrice,true,publisher,author);
                booksList.add(newBook);
                System.out.println("New book name: " + booksList.get(booksList.size() - 1).getBookName());
                System.out.println("New book id: " + booksList.get(booksList.size() - 1).getBookId());
                bookDonatesSelected.forEach(allBookDonates::remove);
                donationRequestList.remove(acceptedIndex);

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
