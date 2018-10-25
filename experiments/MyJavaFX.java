import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    /*
    public MyJavaFX() {
        System.out.println("Test constructor is invoked");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start method is invoked");
    }
    */
    
    @Override
    public void start(Stage primaryStage) {
        Button bt = new Button("OK");
        Scene scene = new Scene(bt, 200, 300);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("2nd stage");
        stage.setScene(new Scene(new Button("Thik Hai"), 200, 200));
        stage.show();
    }
    
    public static void main(String[] args) {
        String[] args2 = args;
        System.out.println("launch application");
		launch(args2);
    }
}