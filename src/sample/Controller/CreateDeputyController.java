package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.Main;
import sample.Model.Deputy;
import sample.Model.Mayor;

public class CreateDeputyController {
    @FXML
    private TextField deputyFName;
    @FXML
    private TextField deputyLName;
    @FXML
    private TextField deputyPersonnelCode;
    @FXML
    private TextField deputyEmploymentYear;
    @FXML
    private TextField deputySalaryBase;
    @FXML
    private Button deputyCreateBTN;
    @FXML
    private Button BackBTN;


    @FXML
    public void createDeputy(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.deputyCreateBTN.getScene().getWindow(); //click on Create button
        String fName = deputyFName.getText();//.toString();
        String lName = deputyLName.getText();//.toString();
        String personnelCode = deputyPersonnelCode.getText();
        int employmentYear  = Integer.parseInt(deputyEmploymentYear.getText());//.toString());
        long salaryBase =Long.parseLong(deputySalaryBase.getText()) ;//.toString();

        Deputy d = new Deputy(fName , lName , personnelCode , employmentYear , salaryBase);// mayor created
        AL.DeputyList.add(d);

        //////////////////////////////////////////////////////
        int lastS = AL.DeputyList.size()-1;
        System.out.println("First name:  " + AL.DeputyList.get(lastS).getfName());
        System.out.println("saved");
        //////////////////////////////////////////////////////

        stage.close();
        UserLoginController sc = new UserLoginController();//cause UserMenuPage method is not static
        sc.UserMenuPage();
    }

    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
//        SignupController sc = new SignupController();
//        sc.UserMenuPage();
    }
}
