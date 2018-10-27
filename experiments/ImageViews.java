import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class ImageViews extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a HBox pane
		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		// Add nodes to pane
		for (int i = 1; i <= 13; i++) {
			pane.getChildren().add(new ImageView(new Image("card/" +
				i + ".png")));
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("13 Cards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}	
}