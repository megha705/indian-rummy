import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DragNodesHoriontally extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();

        // create label
        Label label1 = new Label( "Drag me");
        label.relocate(100,100);

        for (int i = 1; i <= 13; i++) {

			MouseGestures mg = new MouseGestures();
        	mg.makeDraggable(label);
			root.getChildren().addAll(label);
		}
        /*
        // make label draggable
        MouseGestures mg = new MouseGestures();
        mg.makeDraggable( label);
        */
        

        primaryStage.setScene(new Scene(root, 1024, 768));
        primaryStage.show();
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