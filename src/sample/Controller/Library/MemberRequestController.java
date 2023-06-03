package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;
import sample.Model.LibraryP.MemberRequest;

import javax.swing.*;

import static sample.AL.LElist;
import static sample.AL.memberRequests;

public class MemberRequestController {
    @FXML
    private TextField FName;
    @FXML
    private TextField LName ;
    @FXML
    private TextField nationalCode;
    @FXML
    private TextField memberage;
    @FXML
    private TextField gender;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField address;
    @FXML
    private Button BackBTN;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField membership;
    @FXML
    private Button BTN;
    public void MemberShip(javafx.event.ActionEvent event){
        try {
            Stage stage = (Stage) this.BTN.getScene().getWindow();
            String memberName = FName.getText();
            String memberLastname = LName.getText();
            String memberNationalCode = nationalCode.getText();
            String memberAge = memberage.getText();
            String memberGender = gender.getText();
            String memberPhoneNumber = phoneNumber.getText();
            String memberAddress = address.getText();
            String memberUserName = username.getText();
            String memberPassword = password.getText();
//            String memberShip = membership.getText();
            MemberRequest memberRequest = new MemberRequest(memberName, memberLastname, memberNationalCode, memberAge, memberGender, memberPhoneNumber, memberAddress, memberUserName, memberPassword);
            memberRequests.add(memberRequest);
            JOptionPane.showMessageDialog(null, "Done ");
            stage.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fill fields correctly ");

        }
    }

    @FXML
    public void Back(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.createFirstPage();
    }
}
