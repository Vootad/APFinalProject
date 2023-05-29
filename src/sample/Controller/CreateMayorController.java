package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.Main;
import sample.Model.Mayor;

import javax.swing.*;
import java.nio.file.Paths;

public class CreateMayorController {

    public Boolean x = true; //just one mayor!

    @FXML
    private TextField mayorFName;
    @FXML
    private TextField mayorLName;
    @FXML
    private TextField mayorPersonnelCode;
    @FXML
    private TextField mayorEmploymentYear;
    @FXML
    private TextField mayorSalaryBase;
    @FXML
    private PasswordField mayorPassword;
    @FXML
    private Button mayorCreateBTN;
    @FXML
    private Button BackBTN;


    @FXML
    public void createMayor(javafx.event.ActionEvent event){

        try{
            Stage stage = (Stage) this.mayorCreateBTN.getScene().getWindow(); //click on Create button
            String fName = mayorFName.getText();//.toString();
            String lName = mayorLName.getText();//.toString();
            String personnelCode;//.toString();
            personnelCode = mayorPersonnelCode.getText();
            int employmentYear  = Integer.parseInt(mayorEmploymentYear.getText());//.toString());
            long salaryBase  = Long.parseLong(mayorSalaryBase.getText());//.toString());
            String password = mayorPassword.getText();//.toString();

            Mayor m = new Mayor(fName, lName, personnelCode, employmentYear, salaryBase , password);// mayor created
            AL.MayorList.add(m);
            //////////////////////////////////////////////////////
            System.out.println(AL.MayorList.get(0).getfName() + " saved");
            //////////////////////////////////////////////////////
            stage.close();
            UserMenuPage();
        }
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null, "Fill in all fields!");
        }

    }


    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        UserMenuController sc = new UserMenuController();
        sc.UserMenuPage();
    }




















    public void UserMenuPage() {
        try {
            Stage mainMenuPage = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserMenu.fxml").toUri().toURL());

            mainMenuPage.setScene(new Scene(root)); //set UserMenu scene
            mainMenuPage.setResizable(false);
            mainMenuPage.show();

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
