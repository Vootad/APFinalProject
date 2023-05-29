package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.stage.Stage;
import sample.AL;
import sample.Main;
import sample.Model.Security;

import javax.jws.soap.SOAPBinding;
import java.awt.*;

public class CreateSecurityController {
@FXML
private Button securityCreateBTN;
@FXML
private Button BackBTN;
@FXML
private TextField securityFName;
@FXML
private TextField securityLName;
@FXML
private TextField securityPersonnelCode;
@FXML
private TextField securityEmploymentYear;
@FXML
private TextField securitySalaryBase;
@FXML
private TextField securityDShift;
@FXML
private TextField securityNShift;



    @FXML
    public void createSecurity(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.securityCreateBTN.getScene().getWindow(); //click on Create button
        String fName = securityFName.getText();//.toString();
        String lName = securityLName.getText();//.toString();
        String personnelCode = securityPersonnelCode.getText();
        int employmentYear  = Integer.parseInt(securityEmploymentYear.getText());//.toString());
        long salaryBase =Long.parseLong(securitySalaryBase.getText()) ;//.toString();
        int dayShift =Integer.parseInt(securityDShift.getText()) ;//.toString();
        int nightShift =Integer.parseInt(securityNShift.getText()) ;//.toString();

        Security s = new Security(fName , lName , personnelCode , employmentYear , salaryBase , dayShift , nightShift);// mayor created
        AL.SecurityList.add(s);


        //////////////////////////////////////////////////////
//        for(int i=0; i<AL.DeputyList.size(); i++ ){
            int lastS = AL.SecurityList.size()-1;
            System.out.println("First name:  " + AL.SecurityList.get(lastS).getfName());
            System.out.println("saved");
//        }
        //////////////////////////////////////////////////////

        stage.close();
        UserLoginController sc = new UserLoginController();//cause UserMenuPage method is not static
        sc.UserMenuPage();
    }


    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        UserLoginController sc = new UserLoginController();
        sc.UserMenuPage();
    }
}
