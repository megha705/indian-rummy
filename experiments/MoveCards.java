import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class Display13Cards extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		for (int i = 1; i <= 13; i++) {
			pane.getChildren().add(new ImageView(new Image("card/" + i + ".png")));
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("13 Cards"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}	
}