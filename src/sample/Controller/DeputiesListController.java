package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.AL;
import sample.Main;

import sample.Model.Deputy;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class DeputiesListController {

    @FXML
    private TableView<Deputy> table;
    @FXML
    private TableColumn<Deputy, String> fName;
    @FXML
    private TableColumn<Deputy, String> lName;
    @FXML
    private TableColumn<Deputy, Integer> experience;
    @FXML
    private TableColumn<Deputy, Integer> salary;
    @FXML
    private Button BackBTN;





    ObservableList<Deputy> list = FXCollections.observableArrayList(
//        new Deputy(AL.DeputyList.get(0).getfName() , AL.DeputyList.get(0).getlName() , AL.DeputyList.get(0).get())
    );








//    public void initialize(URL url, ResourceBundle rb){
//        String dep1LName = AL.DeputyList.get(0).getlName();
//    }









    @FXML
    public void Back(javafx.event.ActionEvent event){

        Stage stage = (Stage) this.BackBTN.getScene().getWindow(); //click on sign up button
        stage.close();
        showList();
    }
    public void showList(){
        try {
            Stage stage1 = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/List.fxml").toUri().toURL());

            stage1.setScene(new Scene(root)); //set UserMenu scene
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


//    String DepLName1 = Main.DeputyList.get(0).getlName();
//            Dep1LName.setText("2");
}
