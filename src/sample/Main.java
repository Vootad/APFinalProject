package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.nio.file.Paths;
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
        launch(args);
    }
}