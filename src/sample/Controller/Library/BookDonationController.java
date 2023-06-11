package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Model.LibraryP.*;

import javax.swing.*;

import java.util.ArrayList;

import static sample.AL.*;

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
    private TextField donationCode;

    @FXML
    private Button BackBTN;
    @FXML
    private Button donateBook;
//    ArrayList<Book> aB = new ArrayList<>();


    @FXML
    public void DonateBook(javafx.event.ActionEvent event){
        try{
            Stage stage = (Stage) this.donateBook.getScene().getWindow();
            String bName = Bookname.getText();
            String bId = Bookid.getText();
            String bSubject = BookSubject.getText();
            double bPrice = Double.parseDouble(BookPrice.getText());
            String authorName = bookAuthorName.getText();
            String authorEdu = authorEducation.getText();
            String publisherName = bookPublisherName.getText();
            String publishercode = publisherCode.getText();
            String bPublisherCountry = publisherCountry.getText();
            String DonationCode = donationCode.getText();

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
                    booksList.get(repeatAuthorIndex).getAuthor().getAuthorsBookList().add(book);

                    LoginLMemberController x = new LoginLMemberController();
                    LMember member = lMembersList.get(x.memberIndex);
                    DonationRequest dR = new DonationRequest(book , member , DonationCode);
                    donationRequestList.add(dR);
                }

                if(repeatAuthorIndex ==-1 && repeatPublisherIndex !=-1) {
                    Book book = new Book(bName, bId, bSubject, bPrice, true, booksList.get(repeatPublisherIndex).getPublisher(), a);

                    LoginLMemberController x = new LoginLMemberController();
                    LMember member = lMembersList.get(x.memberIndex);
                    DonationRequest dR = new DonationRequest(book , member , DonationCode);
                    donationRequestList.add(dR);
                }

                if(repeatAuthorIndex !=-1 && repeatPublisherIndex ==-1) {
                    Book book = new Book(bName, bId, bSubject, bPrice, true, publisher, booksList.get(repeatAuthorIndex).getAuthor());
                    booksList.get(repeatAuthorIndex).getAuthor().getAuthorsBookList().add(book);

                    LoginLMemberController x = new LoginLMemberController();
                    LMember member = lMembersList.get(x.memberIndex);
                    DonationRequest dR = new DonationRequest(book , member , DonationCode);
                    donationRequestList.add(dR);
                }

                if(repeatAuthorIndex ==-1 && repeatPublisherIndex ==-1){
                    Book book = new Book(bName, bId, bSubject, bPrice, true, publisher, a);

                    LoginLMemberController x = new LoginLMemberController();
                    LMember member = lMembersList.get(x.memberIndex);
                    DonationRequest dR = new DonationRequest(book , member , DonationCode);
                    donationRequestList.add(dR);

                }




                stage.close();
                LoaderClass.ShowLMemberPage();

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
        LoaderClass.ShowLMemberPage();
    }
}
