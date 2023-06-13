package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.BorrowRequest;

import javax.swing.*;

import static sample.AL.*;
import static sample.Controller.Library.LoginLMemberController.memberIndex;

public class BorrowBookController {
    @FXML
    private TextField Bookname;
    @FXML
    private TextField Borrowcode;
    @FXML
    private Button borrowBook;
    @FXML
    private Button BackBTN;
    @FXML
    public void BorrowBook(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.borrowBook.getScene().getWindow();
        String bName = Bookname.getText();
        String bCode = Borrowcode.getText();
        for(int i = 0;i<booksList.size();i++){
            if(bName.equals(booksList.get(i).getBookName())){
                BorrowRequest borrowRequest = new BorrowRequest(booksList.get(i),lMembersList.get(memberIndex),bCode,false);
                borrowRequestList.add(borrowRequest);
                stage.close();
                LoaderClass.ShowLMemberPage();
            }
            else{
                JOptionPane.showMessageDialog(null, "This book doesn't exist!");
            }
        }
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.ShowLMemberPage();
    }
}
