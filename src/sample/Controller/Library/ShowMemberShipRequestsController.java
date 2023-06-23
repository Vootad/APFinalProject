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
import sample.Model.LibraryP.LEmployee;
import sample.Model.LibraryP.LMember;
import sample.Model.LibraryP.MemberRequest;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static sample.AL.lMembersList;
import static sample.AL.memberRequests;
public class ShowMemberShipRequestsController implements Initializable {
        @FXML
        private TableView<MemberRequest> tableView;
        @FXML
        private TableColumn<MemberRequest, String> fNameC;
        @FXML
        private TableColumn<MemberRequest, String> lNameC;
        @FXML
        private TableColumn<MemberRequest, String> ageC;
        @FXML
        private TableColumn<MemberRequest, String> phoneNumberC;
        @FXML
        private Button BackBtn;
        @FXML
        private Button rejectBtn;
        @FXML
        private Button acceptMember;
        @FXML
        private TextField memberId;


        ObservableList<MemberRequest> list = FXCollections.observableArrayList(
                memberRequests
        );
        ObservableList<MemberRequest> memberRequestSelected, allMemberRequests;

        @Override
        public void initialize(URL location, ResourceBundle resources) {
                fNameC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("firstName"));
                lNameC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("lastName"));
                ageC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("Age"));
                phoneNumberC.setCellValueFactory(new PropertyValueFactory<MemberRequest,String>("phoneNumber"));
                tableView.setItems(list);
        }


        @FXML
        public void deleteROW(javafx.event.ActionEvent event){
                Stage stage = (Stage) this.rejectBtn.getScene().getWindow();
                deleteRow();
        }
        public void deleteRow(){
                try{
                        allMemberRequests = tableView.getItems();
                        memberRequestSelected = tableView.getSelectionModel().getSelectedItems();
                        memberRequestSelected.forEach(allMemberRequests::remove);

                        int rejectedIndex = tableView.getSelectionModel().getSelectedIndex();
                        memberRequests.remove(rejectedIndex);
                        System.out.println(memberRequests.size());
                }
               catch(Exception e){
                       JOptionPane.showMessageDialog(null, "Select a row");
               }
        }

        @FXML
        public void addMember(javafx.event.ActionEvent event){
                Stage stage = (Stage) this.acceptMember.getScene().getWindow();
                addMember();
        }
        public void addMember(){
                try{
                        allMemberRequests = tableView.getItems();
                        memberRequestSelected = tableView.getSelectionModel().getSelectedItems();
                        int acceptedIndex = tableView.getSelectionModel().getSelectedIndex();
                        String setMemberId = memberId.getText();
                        String memberName = memberRequests.get(acceptedIndex).getFirstName();
                        String memberLastName = memberRequests.get(acceptedIndex).getLastName();
                        String memberNationalCode = memberRequests.get(acceptedIndex).getNationalCode();
                        String memberAge = memberRequests.get(acceptedIndex).getAge();
                        String memberGender = memberRequests.get(acceptedIndex).getGender();
                        String memberPhoneNumber = memberRequests.get(acceptedIndex).getPhoneNumber();
                        String memberAddress = memberRequests.get(acceptedIndex).getAddress();
                        String memberUserName = memberRequests.get(acceptedIndex).getUserName();
                        String memberPassword = memberRequests.get(acceptedIndex).getPassword();
                        ArrayList<Book> memberBooks = new ArrayList<Book>();
                        ArrayList<Book> memberBoughtBooks = new ArrayList<>();

                        if(setMemberId.equals("")) {
                                JOptionPane.showMessageDialog(null , "Fill MemberShip ID field");
                        }
                        else{
                                boolean x = true;
                                for(int i=0; i<lMembersList.size(); i++){
                                    if(lMembersList.get(i).getMemberShipCode().equals(setMemberId)){
                                        JOptionPane.showMessageDialog(null , "Membership code must be unique");
                                        x = false;
                                    }
                                }

                                if(x) {
                                     LMember newMember = new LMember(memberName, memberLastName, memberNationalCode, memberAge, memberGender, memberPhoneNumber, memberAddress, memberUserName, memberPassword, setMemberId, memberBooks,memberBoughtBooks);
                                     lMembersList.add(newMember);
                                     System.out.println("The name of new member is: " + lMembersList.get(lMembersList.size() - 1).getFirstName());
                                     System.out.println("The id of new member is: " + lMembersList.get(lMembersList.size() - 1).getMemberShipCode());
                                     memberRequestSelected.forEach(allMemberRequests::remove);
                                     memberRequests.remove(acceptedIndex);
                                }
                        }

                }
                catch (Exception e){
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


