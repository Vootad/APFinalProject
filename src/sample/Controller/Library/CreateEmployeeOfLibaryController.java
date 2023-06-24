package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;

import javax.swing.*;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sample.AL.LElist;

public class CreateEmployeeOfLibaryController {
    @FXML
    private TextField FName;
    @FXML
    private TextField LName;
    @FXML
    private TextField nationalCode;
    @FXML
    private TextField Employeeage;
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
    private Button EmployeeCreateBTN;

    @FXML
    public void CreateEmployeeOfLibrary(javafx.event.ActionEvent event) {
        try {
            Stage stage = (Stage) this.EmployeeCreateBTN.getScene().getWindow();


            String leName = FName.getText();

            String leLastname = LName.getText();

            String leNationalCode = nationalCode.getText(); //unique ok

            String leAge = Employeeage.getText();

            String leGender = gender.getText();
            if(!leGender.equals("Female") && !leGender.equals("female") && !leGender.equals("Male") && !leGender.equals("male")){
                throw new IOException("Incorrect phone number");
            }

            String lePhoneNumber = phoneNumber.getText();
            String re = "09[0-3][0-9]-?[0-9]{3}-?[0-9]{4}";
            Pattern pt = Pattern.compile(re);
            Matcher mt = pt.matcher(lePhoneNumber);
            boolean result = mt.matches();
            if(!result){
                throw new IOException("Incorrect phone number");
            }

            String leAddress = address.getText();

            String leUserName = username.getText();  //unique ok

            String lePassword = password.getText();  //unique ok
            int n = 0;

            for (int i = 0; i < LElist.size(); i++) {
                if (leNationalCode.equals(LElist.get(i).getNationalCode()) || lePassword.equals(LElist.get(i).getLEmployeePassword()) || leUserName.equals(LElist.get(i).getLEmployeeUserName())) {
                    JOptionPane.showMessageDialog(null, "Not unique username,password or national code");
                    n = 1;
                }
            }

            if (n == 0) {
                LEmployee le = new LEmployee(leName, leLastname, leNationalCode, leAge, leGender, lePhoneNumber, leAddress, leUserName, lePassword);
                LElist.add(le);
                System.out.println("Name of employee is: " + LElist.get(LElist.size() - 1).getFirstName());
                stage.close();
                LoaderClass.ManagerLibraryPage();
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Fill all fields correctly");
        }
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.ManagerLibraryPage();
    }
}
