package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Model.LibraryP.LMember;

import java.awt.print.Book;
import java.nio.file.Paths;
import java.util.ArrayList;

import static sample.AL.lMembersList;

public class Main extends Application {
  
    @Override
    public void start(Stage primaryStage) throws Exception{

        Stage signupPage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Pane root = (Pane) loader.load(Paths.get("src/sample/View/FirstPage.fxml").toUri().toURL());

        signupPage.setTitle("Sign up page");
        signupPage.setScene(new Scene(root));
        signupPage.setResizable(false);
        signupPage.show();
    }
    public static void main(String[] args) {
        LMember detaultMember = new LMember("ss","dd","ee","qq","male","ww","ere","babak","2","22",null);
        lMembersList.add(detaultMember);
        launch(args);
    }
    //in accepting donation request part  repeat author and publisher not recognizable
    // ,and they don't add to publisherList & authorsList
}