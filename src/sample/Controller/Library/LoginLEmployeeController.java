package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;

import javax.swing.*;

import static sample.AL.LElist;

public class LoginLEmployeeController {

        @FXML
        private TextField lEmployeeLoginUsername;
        @FXML
        private TextField lEmployeeLoginPassword;
        @FXML
        private Button lEmployeeLoginBTN;
        @FXML
        private Button backBTN;


        @FXML
        public void back(javafx.event.ActionEvent event){
            Stage stage = (Stage) this.backBTN.getScene().getWindow();
            stage.close();
            LoaderClass.showLibraryPage();
        }



        @FXML //goToLEmployeeAccount
        public void goToLEmployeeAccount(javafx.event.ActionEvent event){
            try {
                Stage stage = (Stage) this.lEmployeeLoginBTN.getScene().getWindow();
                String userName = lEmployeeLoginUsername.getText();
                String password = lEmployeeLoginPassword.getText();
                boolean x = false;
                for(int i=0 ; i< LElist.size(); i++){
                    if(LElist.get(i).getLEmployeeUserName().equals(userName) && LElist.get(i).getLEmployeePassword().equals(password)){
                        x = true;
                        break;
                    }
                }
                if(x){
                stage.close();
                LoaderClass.ShowLEmployeePage();
                }
                else{// username & password are wrong
                    JOptionPane.showMessageDialog(null, "Wrong username or password");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Try again");
            }
        }
}
