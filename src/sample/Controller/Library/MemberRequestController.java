package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;
import sample.Model.LibraryP.MemberRequest;

import javax.swing.*;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.AL.*;

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
    private Button BTN;
    public void MemberShip(javafx.event.ActionEvent event){
        try {
            Stage stage = (Stage) this.BTN.getScene().getWindow();

            String memberName = FName.getText();

            String memberLastname = LName.getText();

            String memberNationalCode = nationalCode.getText();

            String memberAge = memberage.getText();

            String memberGender = gender.getText();
            if(!memberGender.equals("Female") && !memberGender.equals("female") && !memberGender.equals("Male") && !memberGender.equals("male")){
                throw new IOException("Incorrect phone number");
            }

            String memberPhoneNumber = phoneNumber.getText();
            String re = "09[0-3][0-9]-?[0-9]{3}-?[0-9]{4}";
            Pattern pt = Pattern.compile(re);
            Matcher mt = pt.matcher(memberPhoneNumber);
            boolean result = mt.matches();
            if(!result){
                throw new IOException("Incorrect phone number");
            }

            String memberAddress = address.getText();

            String memberUserName = username.getText();

            String memberPassword = password.getText();

            boolean x = true;

                for (int i = 0; i < memberRequests.size(); i++) {
                    if (memberRequests.get(i).getUserName().equals(memberUserName) || memberRequests.get(i).getPassword().equals(memberPassword)) {
                        x = false;
                    }
                    break;
                }

                for (int i = 0; i < lMembersList.size(); i++) {
                    if (lMembersList.get(i).getUserName().equals(memberUserName) || lMembersList.get(i).getUserName().equals(memberPassword)) {
                        x = false;
                    }
                }

            if(x){
                MemberRequest memberRequest = new MemberRequest(memberName, memberLastname, memberNationalCode, memberAge, memberGender, memberPhoneNumber, memberAddress, memberUserName, memberPassword);
                memberRequests.add(memberRequest);
                System.out.println("request saved");
//                JOptionPane.showMessageDialog(null, "Done ");
                stage.close();
                LoaderClass.showLibraryPage();
            }
            else{
                JOptionPane.showMessageDialog(null, "Not unique username or password");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fill all fields correctly ");

        }
    }

    @FXML
    public void Back(javafx.event.ActionEvent event) {
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }
}
