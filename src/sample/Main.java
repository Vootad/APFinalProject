package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Model.LibraryP.*;

import java.nio.file.Paths;
import java.util.ArrayList;

import static sample.AL.*;

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
        /////////////////////////////////////////////////////////////////////
        LMember detaultMember = new LMember("ss","dd","ee","qq","male","ww","ere","","","22",null,null);
        lMembersList.add(detaultMember);

        LEmployee detaultEmployee = new LEmployee("ss","dd","ee","qq","male","ww","ere","","");
        LElist.add(detaultEmployee);

        Book b = new Book("a" , "a" , "a" , 123 , true , new Publisher() , new Author());
        booksList.add(b);
        ////////////////////////////////////////////////////////////////////////
        launch(args);

    }
    //in accepting donation request part  repeat author and publisher not recognizable
    // ,and they don't add to publisherList & authorsList
}