package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.Book;
import sample.Model.LibraryP.BookDonate;

import javax.swing.*;

import static sample.AL.bookDonateList;
import static sample.AL.booksList;

public class BookDonationController {
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
    private Button donateBook;
    @FXML
    public void DonateBook(javafx.event.ActionEvent event){
        try{
            Stage stage = (Stage) this.donateBook.getScene().getWindow();
            String bName = Bookname.getText();
            String bId = Bookid.getText();
            String bSubject = BookSubject.getText();
            double bPrice = Double.parseDouble(BookPrice.getText());
            int n = 0;

            for (int i = 0; i < bookDonateList.size(); i++) {
                if (bId.equals(bookDonateList.get(i).getBookId())) {
                    JOptionPane.showMessageDialog(null, "Not unique book ID");
                    n = 1;
                }
            }

            if (n == 0) {
                BookDonate donate = new BookDonate(bName,bId,bSubject,bPrice,true);
                bookDonateList.add(donate);
                System.out.println("Book name is: " + bookDonateList.get(bookDonateList.size()-1).getBookName());
                stage.close();

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
