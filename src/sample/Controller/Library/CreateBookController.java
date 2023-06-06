package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.Book;

import static sample.AL.books;

public class CreateBookController {
    private Boolean condition = true;
    @FXML
    private TextField Bookname;
    @FXML
    private TextField Bookid;
    @FXML
    private TextField BookSubject;
    @FXML
    private TextField BookPrice;
    @FXML
    private Button BackBTN;
    @FXML
    private Button CreateBook;;
    @FXML
    public void CreateBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.CreateBook.getScene().getWindow();
        String bName = Bookname.getText();
        String bId = Bookid.getText();
        String bSubject = BookSubject.getText();
        long bPrice = Long.parseLong(BookPrice.getText());
        Book book = new Book(bName,bId,bSubject,bPrice,condition);
        books.add(book);
        System.out.println(books.get(books.size()-1));
        stage.close();
        LoaderClass.ShowLEmployeePage();

    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLEmployeePage();
    }



}
