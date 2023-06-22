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
import sample.Model.LibraryP.LEmployee;
import sample.Model.LibraryP.Publisher;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.AL.LElist;
import static sample.AL.publishersList;

public class ViewPublishersController implements Initializable {
    @FXML
    private TableView<Publisher> tableView;
    @FXML
    private TableColumn<Publisher,String> name;
    @FXML
    private TableColumn<Publisher,String> code;
    @FXML
    private TableColumn<Publisher,String> country;
    @FXML
    private Button btn_back;
    ObservableList<Publisher> list = FXCollections.observableArrayList(
            publishersList
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setCellValueFactory(new PropertyValueFactory<Publisher,String>("publisherName"));
        code.setCellValueFactory(new PropertyValueFactory<Publisher,String>("publisherCode"));
        country.setCellValueFactory(new PropertyValueFactory<Publisher,String>("publisherCountry"));
        tableView.setItems(list);
    }
    @FXML
    public void Back(javafx.event.ActionEvent event){
        Stage stage = (Stage) this.btn_back.getScene().getWindow();
        stage.close();
        LoaderClass.ManagerLibraryPage();
    }
}
