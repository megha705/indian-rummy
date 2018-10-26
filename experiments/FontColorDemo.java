import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontColorDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new StackPane();
        Circle circle = new Circle(50);
        circle.setRadius(40);
        circle.setStroke(Color.ROSYBROWN);
        circle.setFill(new Color(0.5, 0.5, 0.6, 0.1));
        pane.getChildren().add(circle);

        Label label = new Label("Circle");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Circle with Text and color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}