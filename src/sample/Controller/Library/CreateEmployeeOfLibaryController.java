package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;

import javax.swing.*;

import static sample.AL.LElist;

public class CreateEmployeeOfLibaryController {
    @FXML
    private TextField employeeUsername;
    @FXML
    private TextField employeePassword;
    @FXML
    private Button CreateLibaryEmployee_Btn;
    @FXML
    private Button BackBTN;
    public void CreateEmployeeOfLibary(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.CreateLibaryEmployee_Btn.getScene().getWindow();
        String leName = employeeUsername.getText();
        String lePassword = employeePassword.getText();
        LEmployee le = new LEmployee(leName,lePassword);
                LElist.add(le);
                JOptionPane.showMessageDialog(null, "Name of employee is:  "+LElist.get(LElist.size()-1).getLEmployeeUserName());
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
