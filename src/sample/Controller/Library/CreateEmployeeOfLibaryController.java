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

import static sample.AL.LElist;

public class CreateEmployeeOfLibaryController {
    @FXML
    private TextField FName;
    @FXML
    private TextField LName ;
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
    public void CreateEmployeeOfLibary(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.EmployeeCreateBTN.getScene().getWindow();
        String leName = FName.getText();
        String leLastname = LName.getText();
        String leNationalCode = nationalCode.getText();
        String leAge = Employeeage.getText();
        String leGender = gender.getText();
        String lePhoneNumber = phoneNumber.getText();
        String leAddress = address.getText();
        String leUserName = username.getText();
        String lePassword = password.getText();
        LEmployee le = new LEmployee(leName,leLastname,leNationalCode,leAge,leGender,lePhoneNumber,leAddress,leUserName,lePassword);
                LElist.add(le);
                JOptionPane.showMessageDialog(null, "Name of employee is:  "+LElist.get(LElist.size()-1).fName);
                JOptionPane.showMessageDialog(null, "Name of employee is:  "+LElist.get(LElist.size()-1).getLEmployeePassword());
                stage.close();
                LoaderClass.ManagerLibraryPage();
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.BackBTN.getScene().getWindow();
        stage.close();
        LoaderClass.ManagerLibraryPage();
    }
    }
