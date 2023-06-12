package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.*;

import javax.swing.*;
import java.util.ArrayList;

import static sample.AL.*;
import static sample.AL.donationRequestList;

public class CreateBookController {
//    @FXML
//    private TextField Bookname;
//    @FXML
//    private TextField Bookid; //unique
//    @FXML
//    private TextField BookSubject;
//    @FXML
//    private TextField BookPrice;

    @FXML
    private TextField Bookname;
    @FXML
    private TextField Bookid;
    @FXML
    private TextField BookSubject;
    @FXML
    private TextField BookPrice;
    @FXML
    private TextField bookPublisherName;
    @FXML
    private TextField publisherCode;
    @FXML
    private TextField publisherCountry;
    @FXML
    private TextField bookAuthorName;
    @FXML
    private TextField authorEducation;
    @FXML
    private Button BackBTN;
    @FXML
    private Button addBook;


    @FXML
    public void CreateBook(javafx.event.ActionEvent event){
        try{
            Stage stage = (Stage) this.addBook.getScene().getWindow();
            String bName = Bookname.getText();
            String bId = Bookid.getText();
            String bSubject = BookSubject.getText();
            double bPrice = Double.parseDouble(BookPrice.getText());
            String authorName = bookAuthorName.getText();
            String authorEdu = authorEducation.getText();
            String publisherName = bookPublisherName.getText();
            String publishercode = publisherCode.getText();
            String bPublisherCountry = publisherCountry.getText();

            int n = 0;
//UNIQUE ID
            for (int i = 0; i < donationRequestList.size(); i++) {
                if (bId.equals(donationRequestList.get(i).getBook().getBookId())) {
                    JOptionPane.showMessageDialog(null, "Not unique book ID");
                    n = 1;
                }
            }

            for (int i = 0; i < booksList.size(); i++) {
                if (bId.equals(booksList.get(i).getBookId())) {
                    JOptionPane.showMessageDialog(null, "Not unique book ID");
                    n = 1;
                }
            }

            if (n == 0) {
                int repeatAuthorIndex =-1;
                int repeatPublisherIndex =-1;

                Publisher publisher = new Publisher(publisherName , publishercode , bPublisherCountry) ;
                ArrayList<Book> aB = new ArrayList<>();
                Author a = new Author(authorName , authorEdu , aB);
//                Book b = new sample.Model.LibraryP.Book(bName , bId , bSubject , bPrice , true , publisher , a);
                for(int i=0; i<booksList.size(); i++){
                    if(publisher == booksList.get(i).getPublisher()){
                        repeatPublisherIndex = i;
                        break;
                    }
                }
                for(int j=0; j<booksList.size(); j++){
                    if(a == booksList.get(j).getAuthor()){
                        repeatAuthorIndex = j;
                        break;
                    }
                }
                if(repeatAuthorIndex !=-1 && repeatPublisherIndex !=-1) {
                    Book book = new Book(bName, bId, bSubject, bPrice, true, booksList.get(repeatPublisherIndex).getPublisher(), booksList.get(repeatAuthorIndex).getAuthor());
                    booksList.get(repeatAuthorIndex).getAuthor().getAuthorsBookList().add(book);//add new book to author books arrayList
                    booksList.add(book);
                }

                if(repeatAuthorIndex ==-1 && repeatPublisherIndex !=-1) {
                    Book book = new Book(bName, bId, bSubject, bPrice, true, booksList.get(repeatPublisherIndex).getPublisher(), a);
                    booksList.add(book);
                    authorsList.add(a);
                }

                if(repeatAuthorIndex !=-1 && repeatPublisherIndex ==-1) {
                    Book book = new Book(bName, bId, bSubject, bPrice, true, publisher, booksList.get(repeatAuthorIndex).getAuthor());
                    booksList.get(repeatAuthorIndex).getAuthor().getAuthorsBookList().add(book);
                    booksList.add(book);
                    publishersList.add(publisher);
                }

                if(repeatAuthorIndex ==-1 && repeatPublisherIndex ==-1){
                    Book book = new Book(bName, bId, bSubject, bPrice, true, publisher, a);
                    booksList.add(book);
                    authorsList.add(a);
                    publishersList.add(publisher);
                }


                stage.close();
                LoaderClass.ShowLEmployeePage();

            }
            else{
                JOptionPane.showMessageDialog(null, "Not unique book id");
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



//    @FXML
//    public void CreateBook(javafx.event.ActionEvent event){
//        try{
//            Stage stage = (Stage) this.CreateBook.getScene().getWindow();
//            String bName = Bookname.getText();
//            String bId = Bookid.getText();
//            String bSubject = BookSubject.getText();
//            double bPrice = Double.parseDouble(BookPrice.getText());/////////////
//            int n = 0;
//
//            for (int i = 0; i < booksList.size(); i++) {
//                if (bId.equals(booksList.get(i).getBookId())) {
//                    JOptionPane.showMessageDialog(null, "Not unique book ID");
//                    n = 1;
//                }
//            }
//
//            if (n == 0) {
//                Book book = new Book(bName,bId,bSubject,bPrice,true);
//                booksList.add(book);
//                System.out.println("Book name is: " + booksList.get(booksList.size()-1).getBookName());
//                stage.close();
//                LoaderClass.CreateEmployeeOfLibraryPage();
//            }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Fill all fields correctly");
//        }
//    }




}
