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



    //Library pages

    public static void showLoginManagerPage(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LoginLManager.fxml").toUri().toURL());

            stage.setScene(new Scene(root));
            stage.setTitle("Library manager login page");
            stage.setResizable(false);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void showLibraryPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/Library.fxml").toUri().toURL());

            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void ManagerLibraryPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/ManagerOfLibraryPage.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void CreateEmployeeOfLibraryPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/CreateLibraryEmployee.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void ViewEmployeeOfLibraryPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LViewEmployees.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void CreateMembershipRequest(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/MembershipRequest.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void ShowMemberShipRequestsPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/ShowMembershipRequests.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void ShowLoginEmployee(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LoginLEmployee.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void ShowLEmployeePage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LEmployeePage.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void CreateBookPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/CreateBook.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void ViewBooksPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/ViewBooks.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void ViewMembersListPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/ShowMembersList.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void DonateBookPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/BookDonation.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void ShowLMemberLoginPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LoginLMember.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }


    public static void ShowLMemberPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/LMemberPage.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void ARBookPage(){
        try {
            Stage stage1 = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/Library/ARBooks.fxml").toUri().toURL());
            stage1.setScene(new Scene(root));
            stage1.setResizable(false);
            stage1.show();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
