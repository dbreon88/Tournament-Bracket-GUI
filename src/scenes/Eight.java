package scenes;

import backend.Team;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Eight extends Scene {

	public Eight(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
		super(root, width, height, fill);

		GridPane gPane = new GridPane();
		gPane.setGridLinesVisible(false);
		BorderPane borderPane = ((BorderPane) root);
		borderPane.setCenter(gPane);
		gPane.setAlignment(Pos.CENTER);
		gPane.getStyleClass().add("pane");

		DropShadow shad = new DropShadow();
		shad.setOffsetY(3.0f);
		shad.setColor(Color.color(0.4f, 0.4f, 0.4f));

		Text title = new Text("Tournament Bracket");
		title.setId("fancytext");
		title.setEffect(shad);
		borderPane.setTop(title);
		borderPane.setAlignment(title, Pos.CENTER);

		Label info = new Label();
		info.setMinHeight(100);
		info.setText(
				"INSTRUCTIONS:\n-For each game: Enter each team's score then click submit button between the two teams.\n-After completing all games for a round, move on to next round and repeat process to enter teams' scores.\n After submitting the scores for the championship game the top three contenders will be displayed!");
		info.setFont(Font.font("Ariel", 15));
		borderPane.setBottom(info);
		borderPane.setAlignment(info, Pos.CENTER);


	}
}
