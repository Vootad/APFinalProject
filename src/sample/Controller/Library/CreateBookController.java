package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.Book;
import sample.Model.LibraryP.LEmployee;

import javax.swing.*;

import static sample.AL.LElist;
import static sample.AL.booksList;

public class CreateBookController {
    @FXML
    private TextField Bookname;
    @FXML
    private TextField Bookid; //unique
    @FXML
    private TextField BookSubject;
    @FXML
    private TextField BookPrice;
    @FXML
    private Button BackBTN;
    @FXML
    private Button CreateBook;
    @FXML
    public void CreateBook(javafx.event.ActionEvent event){
        try{
            Stage stage = (Stage) this.CreateBook.getScene().getWindow();
            String bName = Bookname.getText();
            String bId = Bookid.getText();
            String bSubject = BookSubject.getText();
            double bPrice = Double.parseDouble(BookPrice.getText());/////////////
            int n = 0;

            for (int i = 0; i < booksList.size(); i++) {
                if (bId.equals(booksList.get(i).getBookId())) {
                    JOptionPane.showMessageDialog(null, "Not unique book ID");
                    n = 1;
                }
            }

            if (n == 0) {
                Book book = new Book(bName,bId,bSubject,bPrice,true);
                booksList.add(book);
                System.out.println("Book name is: " + booksList.get(booksList.size()-1).getBookName());
                stage.close();
                LoaderClass.CreateEmployeeOfLibraryPage();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fill all fields correctly");
        }
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLEmployeePage();
    }



}
