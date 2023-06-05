package sample.Controller.Library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.AL;
import sample.LoaderClass;
import sample.Model.LibraryP.LEmployee;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static sample.AL.LElist;

public class LViewEmployeesController implements Initializable {
    @FXML
    private TableView<LEmployee> tableView;
    @FXML
    private TableColumn<LEmployee,String> firstName;
    @FXML
    private TableColumn<LEmployee,String> lastName;
    @FXML
    private TableColumn<LEmployee,String> age;
    @FXML
     private Button btn_back;
    ObservableList<LEmployee> list = FXCollections.observableArrayList(
            LElist
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        firstName.setCellValueFactory(new PropertyValueFactory<LEmployee,String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<LEmployee,String>("lastName"));
        age.setCellValueFactory(new PropertyValueFactory<LEmployee,String>("Age"));
        tableView.setItems(list);
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.btn_back.getScene().getWindow();
        stage.close();
        LoaderClass.showLibraryPage();
    }
}
