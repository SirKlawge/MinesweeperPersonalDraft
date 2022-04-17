package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MinesweeperView extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new VBox();
		
		primaryStage.setScene(new Scene(root, 400, 400));
		primaryStage.setTitle("Minesweeper");
		primaryStage.show();
	}

}
