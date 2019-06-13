package application;
	
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//Main
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws SQLException {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		DBManager accessoDB = new DBManager();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
