import database.HibernateSessionFactory;
import database.SessionManager;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view\\main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        primaryStage.setOnCloseRequest(event ->  {
            SessionManager.getInstance().closeSession();
            HibernateSessionFactory.shutdown();
            Platform.exit();
            System.exit(0);
        });

    }




    public static void main(String[] args) {
        launch(args);
    }
}
