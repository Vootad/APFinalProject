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
import sample.LoaderClass;
import sample.Model.LibraryP.Author;
import sample.Model.LibraryP.LEmployee;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.LElist;
import static sample.AL.authorsList;

public class ViewAuthorsController implements Initializable {
    @FXML
    private TableView<Author> tableView;
    @FXML
    private TableColumn<Author,String> name;
    @FXML
    private TableColumn<Author,String> education;

    @FXML
    private Button btn_back;
    ObservableList<Author> list = FXCollections.observableArrayList(
            authorsList
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setCellValueFactory(new PropertyValueFactory<Author,String>("authorName"));
        education.setCellValueFactory(new PropertyValueFactory<Author,String>("authorEducation"));
        tableView.setItems(list);
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.btn_back.getScene().getWindow();
        stage.close();
        LoaderClass.ManagerLibraryPage();
    }
}
