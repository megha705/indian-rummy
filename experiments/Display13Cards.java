import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Node;



public class Display13Cards extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a HBox pane
		HBox pane = new HBox(-55);
		pane.setPadding(new Insets(5, 5, 5, 5));

		// Add nodes to pane
		for (int i = 1; i <= 13; i++) {
			ImageView imgv = new ImageView(new Image("card/" + i + ".png"));
			MouseGestures mg = new MouseGestures();
        	mg.makeDraggable(imgv);
			pane.getChildren().add(imgv);
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("13 Cards"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}	

	public static class MouseGestures {

        class DragContext {
            double x;
            double y;
        }

        DragContext dragContext = new DragContext();

        public void makeDraggable( Node node) {
            node.setOnMousePressed( onMousePressedEventHandler);
            node.setOnMouseDragged( onMouseDraggedEventHandler);
        }

        EventHandler<MouseEvent> onMousePressedEventHandler = event -> {

                Node node = ((Node) (event.getSource()));

                dragContext.x = node.getTranslateX() - event.getSceneX();
                dragContext.y = node.getTranslateY() - event.getSceneY();
        };

        EventHandler<MouseEvent> onMouseDraggedEventHandler = event -> {

                Node node = ((Node) (event.getSource()));

                node.setTranslateX( dragContext.x + event.getSceneX());
//                  node.setTranslateY( dragContext.y + event.getSceneY()); // uncomment this if you want x/y dragging

		};
	}
}