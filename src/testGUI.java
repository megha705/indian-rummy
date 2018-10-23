import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class testGUI extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		String imagePath = "ff.png";
		
		// Scale the iamge to 200 X 100
		double requestedWidth = 2000;
		double requestedHeight = 1000;
		boolean preserveRatio = false;
		boolean smooth = true;
		Image image = new Image(imagePath, 
		                        requestedWidth, 
		                        requestedHeight, 
		                        preserveRatio, 
		                        smooth);
		ImageView imageView = new ImageView(image);
		
		HBox root = new HBox(imageView);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Displaying an Image");
		stage.show();
}
}