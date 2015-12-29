package pak;
//@author Csabi
// http://www.programmerinterview.com/index.php/java-questions/java-anonymous-class-example/
// http://www.javacodegeeks.com/wp-content/uploads/2014/10/Java-8-Features.pdf
import javafx.application.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application implements EventHandler{

	Button button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the wi");
		button = new Button();
		button.setText("button");
		button.setOnAction(this);
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,200,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(Event arg0) {
		button.setText("Clicled");
		
	}

}
