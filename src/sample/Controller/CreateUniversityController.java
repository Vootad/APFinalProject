package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.Model.University;
import java.nio.file.Paths;
import javafx.scene.control.Button;


public class CreateUniversityController {
    @FXML
    private Button BackBTN;
    @FXML
    private TextField uniNOfEmployees;
    @FXML
    private TextField uniName;
    @FXML
    private TextField uniConstructionCost;
    @FXML
    private TextField uniArea;
    @FXML
    private TextField uniNOfMajors;
    @FXML
    private TextField uniNOfProfessors;
    //////////////////uniNOfProfessors
    @FXML
    private Button uniCreateBTN;


    @FXML
    public void CreateUniversity(){
        Stage stage = (Stage) this.uniCreateBTN.getScene().getWindow(); //click on Create button
        String hName = uniName.getText();//.toString();
        String nOfEmployees = uniNOfEmployees.getText();//.toString();
        String constructionCost;//.toString();
        constructionCost = uniConstructionCost.getText();
        String area = uniArea.getText();//.toString();
        String nOfMajors = uniNOfMajors.getText();//.toString();
        String nOfProfessors = uniNOfProfessors.getText();//.toString();


        University a = new University(hName , nOfEmployees , constructionCost , area , nOfMajors , nOfProfessors);// Airport created
        AL.UniversityList.add(a);
        ////////////////////////
        int lastH = AL.UniversityList.size()-1;
        System.out.println("Name:  " + AL.UniversityList.get(lastH).getName());
        System.out.println("saved");
        ///////////////////////
        stage.close();
        showMayorAcc();
    }





    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        showMayorAcc();
    }
    public void showMayorAcc(){
        try {
            Stage stage1 = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/MayorAccount.fxml").toUri().toURL());

            stage1.setScene(new Scene(root)); //set UserMenu scene
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
