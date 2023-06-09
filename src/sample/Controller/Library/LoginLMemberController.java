package sample.Controller.Library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.LoaderClass;

import javax.swing.*;

import static sample.AL.LElist;
import static sample.AL.lMembersList;

public class LoginLMemberController {

    @FXML
    private TextField lMemberLoginUsername;
    @FXML
    private TextField lMemberLoginPassword;
    @FXML
    private Button lMemberLoginBTN;
    @FXML
    private Button backBTN;
    public int memberIndex = -1;



    @FXML
    public void back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.backBTN.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }



    @FXML
    public void goToLEmployeeAccount(javafx.event.ActionEvent event){
        try {
            Stage stage = (Stage) this.lMemberLoginBTN.getScene().getWindow();
            String userName = lMemberLoginUsername.getText();
            String password = lMemberLoginPassword.getText();
            boolean x = false;
//            public int memberIndex = -1;
            for(int i=0 ; i< lMembersList.size(); i++){
                if(lMembersList.get(i).getUserName().equals(userName) && lMembersList.get(i).getPassword().equals(password)){
                    memberIndex = i;
                    break;
                }
            }
            if(memberIndex != -1){
                stage.close();
                LoaderClass.ShowLMemberPage();
            }
            else{// username & password are wrong
                JOptionPane.showMessageDialog(null, "Wrong username or password");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something is wrong");
        }
    }
}


