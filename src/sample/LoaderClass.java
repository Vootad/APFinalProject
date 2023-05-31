package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.nio.file.Paths;

public class LoaderClass {

    public static void UserMenuPage() {
        try {
            Stage mainMenuPage = new Stage();   //create new stage
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserMenu.fxml").toUri().toURL());

            mainMenuPage.setScene(new Scene(root)); //set UserMenu scene
            mainMenuPage.setResizable(false);
            mainMenuPage.show();

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void CreateMayorPage() {
        if(AL.MayorList.size() == 0)//only 1 mayor
        {
            try {
                Stage stage1 = new Stage();
                FXMLLoader loader = new FXMLLoader();
                Pane root = (Pane) loader.load(Paths.get("src/sample/View/CreateMayor.fxml").toUri().toURL());

                stage1.setScene(new Scene(root));
                stage1.setTitle("Create mayor");
                stage1.setResizable(false);
                stage1.show();
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        else{
            System.out.println("only one mayor!");
            UserMenuPage();
        }
    }

    public static void createFirstPage(){
        try{
            Stage firstPage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/FirstPage.fxml").toUri().toURL());

            firstPage.setTitle("Sign up page");
            firstPage.setScene(new Scene(root));
            firstPage.setResizable(false);
            firstPage.show();
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }

    public static void showMayorAcc(){
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


    public static void showLibraryPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void CreateLoginPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/LoginMayor.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("Mayor login page");

            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void CreateUserLoginPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/UserLogin.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("User login page");

            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


}