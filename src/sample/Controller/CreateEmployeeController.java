package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.Model.Employee;

public class CreateEmployeeController {
     @FXML
        private TextField FName;
        @FXML
        private TextField LName;
        @FXML
        private TextField PersonnelCode;
        @FXML
        private TextField EmploymentYear;
        @FXML
        private TextField SalaryBase;
        @FXML
        private Button EmployeeCreateBTN;
        @FXML
        private Button BackBTN;



        @FXML
        public void Back(javafx.event.ActionEvent event){

            Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
            stage.close();
            UserMenuController sc = new UserMenuController();
            sc.UserMenuPage();
        }



        @FXML
        public void createEmployee(javafx.event.ActionEvent event){
            Stage stage = (Stage) this.EmployeeCreateBTN.getScene().getWindow(); //click on Create button
            String fName = FName.getText();//.toString();
            String lName = LName.getText();//.toString();
            String personnelCode = PersonnelCode.getText();
            int employmentYear  = Integer.parseInt(EmploymentYear.getText());//.toString());
            long salaryBase =Long.parseLong(SalaryBase.getText()) ;//.toString();

            Employee d = new Employee(fName , lName , personnelCode , employmentYear , salaryBase);// mayor created
            AL.EmployeesList.add(d);

            //////////////////////////////////////////////////////
            int lastS = AL.EmployeesList.size()-1;
            System.out.println("First name:  " + AL.EmployeesList.get(lastS).getfName());
            System.out.println("saved");
            //////////////////////////////////////////////////////

            stage.close();
            UserMenuController sc = new UserMenuController();//cause UserMenuPage method is not static
            sc.UserMenuPage();
        }

}
