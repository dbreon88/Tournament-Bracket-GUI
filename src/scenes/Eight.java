package scenes;

import backend.Team;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
		gPane.setGridLinesVisible(true);
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


		//Round 1 text
		Text round1 = new Text("Round 1");
		round1.setId("rounds");
		round1.minHeight(25);

		//Round 2 Text
		Text round2 = new Text("Round 2");
		round2.setId("rounds");
		round2.minHeight(25);

		//Round 3 Text
		Text round3 = new Text("Round 3");
		round3.setId("rounds");
		round3.minHeight(25);

		//Team 1 Text
		Label label1 = new Label();
		label1.setMinHeight(25);
		label1.setText(teams.get(0).getTeamName() + ": ");

		//Team 2 text
		Label label2 = new Label();
		label2.setMinHeight(25);
		label2.setText(teams.get(1).getTeamName() + ": ");

		//Team 3 text
		Label label3 = new Label();
		label3.setMinHeight(25);
		label3.setText(teams.get(2).getTeamName() + ": ");

		//Team 4 text
		Label label4 = new Label();
		label4.setMinHeight(25);
		label4.setText(teams.get(3).getTeamName() + ": ");

		//Team 5 Text
		Label label5 = new Label();
		label5.setMinHeight(25);
		label5.setText(teams.get(4).getTeamName() + ": ");

		//Team 6 text
		Label label6 = new Label();
		label6.setMinHeight(25);
		label6.setText(teams.get(5).getTeamName() + ": ");

		//Team 7 text
		Label label7 = new Label();
		label7.setMinHeight(25);
		label7.setText(teams.get(6).getTeamName() + ": ");

		//Team 8 text
		Label label8 = new Label();
		label8.setMinHeight(25);
		label8.setText(teams.get(7).getTeamName() + ": ");

		//Winner 1 text
		Label winner1 = new Label();
		winner1.setMinHeight(25);
		winner1.setText("Winner 1: ");

		//Winner 2 Text
		Label winner2 = new Label();
		winner2.setMinHeight(25);
		winner2.setText("Winner 2: ");

		//Winner 3 text
		Label winner3 = new Label();
		winner1.setMinHeight(25);
		winner1.setText("Winner 3: ");

		//Winner 4 Text
		Label winner4 = new Label();
		winner2.setMinHeight(25);
		winner2.setText("Winner 4: ");

		Label winner5 = new Label();
		winner1.setMinHeight(25);
		winner1.setText("Winner 5: ");

		//Winner 6 Text
		Label winner6 = new Label();
		winner2.setMinHeight(25);
		winner2.setText("Winner 6: ");

		Label champ = new Label();
		champ.setMinHeight(25);
		champ.setText("Champion:");

		Label runnerUp = new Label();
		runnerUp.setMinHeight(25);
		runnerUp.setText("Runner Up:");

		TextField input1 = new TextField();
		input1.setMaxHeight(20);
		input1.setMaxWidth(200);
		input1.setPromptText("Score 1");
		input1.setFocusTraversable(false);

		TextField input2 = new TextField();
		input2.setMaxHeight(20);
		input2.setMaxWidth(200);
		input2.setPromptText("Score 2");
		input2.setFocusTraversable(false);

		TextField input3 = new TextField();
		input3.setMaxHeight(20);
		input3.setMaxWidth(200);
		input3.setPromptText("Score 3");
		input3.setFocusTraversable(false);

		TextField input4 = new TextField();
		input4.setMaxHeight(20);
		input4.setMaxWidth(200);
		input4.setPromptText("Score 4");
		input4.setFocusTraversable(false);

		TextField input5 = new TextField();
		input5.setMaxHeight(20);
		input5.setMaxWidth(200);
		input5.setPromptText("Score 5");
		input5.setFocusTraversable(false);

		TextField input6 = new TextField();
		input6.setMaxHeight(20);
		input6.setMaxWidth(200);
		input6.setPromptText("Score 6");
		input6.setFocusTraversable(false);

		TextField input7 = new TextField();
		input7.setMaxHeight(20);
		input7.setMaxWidth(200);
		input7.setPromptText("Score 7");
		input7.setFocusTraversable(false);

		TextField input8 = new TextField();
		input8.setMaxHeight(20);
		input8.setMaxWidth(200);
		input8.setPromptText("Score 8");
		input8.setFocusTraversable(false);

		TextField input9 = new TextField();
		input9.setMaxHeight(20);
		input9.setMaxWidth(200);
		input9.setPromptText("Score 9");
		input9.setFocusTraversable(false);

		TextField input10 = new TextField();
		input10.setMaxHeight(20);
		input10.setMaxWidth(200);
		input10.setPromptText("Score 10");
		input10.setFocusTraversable(false);

		TextField input11 = new TextField();
		input11.setMaxHeight(20);
		input11.setMaxWidth(200);
		input11.setPromptText("Score 11");
		input11.setFocusTraversable(false);

		TextField input12 = new TextField();
		input12.setMaxHeight(20);
		input12.setMaxWidth(200);
		input12.setPromptText("Score 12");
		input12.setFocusTraversable(false);

		TextField input13 = new TextField();
		input13.setMaxHeight(20);
		input13.setMaxWidth(200);
		input13.setPromptText("Score 13");
		input13.setFocusTraversable(false);

		TextField input14 = new TextField();
		input14.setMaxHeight(20);
		input14.setMaxWidth(200);
		input14.setPromptText("Score 14");
		input14.setFocusTraversable(false);

		Label emptyRow1 = new Label(" ");

		gPane.add(round1, 0, 0);
		gPane.add(round2, 3, 0);

		gPane.add(emptyRow1, 0, 1, 9, 1);

		gPane.add(label1, 0, 2);
		gPane.add(label2, 0, 4);
		gPane.add(label3, 0, 6);
		gPane.add(label4, 0, 8);
		gPane.add(label5, 0, 10);
		gPane.add(label6, 0, 12);
		gPane.add(label7, 0, 14);
		gPane.add(label8, 0, 16);

		gPane.add(input1, 1, 2);
		gPane.add(input2, 1, 4);
		gPane.add(input3, 1, 6);
		gPane.add(input4, 1, 8);
		gPane.add(input5, 1, 10);
		gPane.add(input6, 1, 12);
		gPane.add(input7, 1, 14);
		gPane.add(input8, 1, 16);


		//gPane.add(submit1, 0, 3, 2, 1);
		//gPane.add(submit2, 0, 9, 2, 1);
		//gPane.add(submit3, 3, 6, 2, 1);

		//gPane.add(input1, 1, 2);
		//gPane.add(input2, 1, 4);
		//gPane.add(input3, 1, 8);
		//gPane.add(input4, 1, 10);

		//gPane.add(winner1, 3, 3);
		//gPane.add(winner2, 3, 9);

		//gPane.add(input5, 4, 3);
		//gPane.add(input6, 4, 9);

		//gPane.add(champ, 6, 6);
		//gPane.add(runnerUp, 6, 12);


	}
}
