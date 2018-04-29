package scenes;

import backend.Team;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import java.util.ArrayList;

public class Sixteen extends Scene{
	
	public Sixteen(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
		super(root, width, height, fill);
		GridPane gPane = new GridPane();
		gPane.setGridLinesVisible(true);
		BorderPane borderPane = ((BorderPane) root);
		borderPane.setCenter(gPane);
		gPane.setAlignment(Pos.CENTER);
		gPane.getStyleClass().add("pane");
		}

}
