package scenes;

import backend.Team;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class Sixteen extends Scene{
	
	public Sixteen(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
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

		Text round4 = new Text("Round 4");
		round4.setId("rounds");
		round4.minHeight(25);

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

		Label label9 = new Label();
		label9.setMinHeight(25);
		label9.setText(teams.get(8).getTeamName() + ": ");

		Label label10 = new Label();
		label10.setMinHeight(25);
		label10.setText(teams.get(9).getTeamName() + ": ");

		Label label11 = new Label();
		label11.setMinHeight(25);
		label11.setText(teams.get(10).getTeamName() + ": ");

		Label label12 = new Label();
		label12.setMinHeight(25);
		label12.setText(teams.get(11).getTeamName() + ": ");

		Label label13 = new Label();
		label13.setMinHeight(25);
		label13.setText(teams.get(12).getTeamName() + ": ");

		Label label14 = new Label();
		label14.setMinHeight(25);
		label14.setText(teams.get(13).getTeamName() + ": ");

		Label label15 = new Label();
		label15.setMinHeight(25);
		label15.setText(teams.get(14).getTeamName() + ": ");

		Label label16 = new Label();
		label16.setMinHeight(25);
		label16.setText(teams.get(15).getTeamName() + ": ");

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
		winner3.setMinHeight(25);
		winner3.setText("Winner 3: ");

		//Winner 4 Text
		Label winner4 = new Label();
		winner4.setMinHeight(25);
		winner4.setText("Winner 4: ");

		//Winner 5 Text
		Label winner5 = new Label();
		winner5.setMinHeight(25);
		winner5.setText("Winner 5: ");

		//Winner 6 Text
		Label winner6 = new Label();
		winner6.setMinHeight(25);
		winner6.setText("Winner 6: ");

		//Winner 7 Text
		Label winner7 = new Label();
		winner7.setMinHeight(25);
		winner7.setText("Winner 7: ");

		//Winner 8 Text
		Label winner8 = new Label();
		winner8.setMinHeight(25);
		winner8.setText("Winner 8: ");

		Label winner9 = new Label();
		winner9.setMinHeight(25);
		winner9.setText("Winner 9: ");

		Label winner10 = new Label();
		winner10.setMinHeight(25);
		winner10.setText("Winner 10: ");

		Label winner11 = new Label();
		winner11.setMinHeight(25);
		winner11.setText("Winner 11: ");

		Label winner12 = new Label();
		winner12.setMinHeight(25);
		winner12.setText("Winner 12: ");

		Label winner13 = new Label();
		winner13.setMinHeight(25);
		winner13.setText("Winner 13: ");

		Label winner14 = new Label();
		winner14.setMinHeight(25);
		winner14.setText("Winner 14: ");

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

		TextField input15 = new TextField();
		input15.setMaxHeight(20);
		input15.setMaxWidth(200);
		input15.setPromptText("Score 15");
		input15.setFocusTraversable(false);

		TextField input16 = new TextField();
		input16.setMaxHeight(20);
		input16.setMaxWidth(200);
		input16.setPromptText("Score 16");
		input16.setFocusTraversable(false);

		TextField inputW1 = new TextField();
		inputW1.setMaxHeight(20);
		inputW1.setMaxWidth(200);
		inputW1.setPromptText("Score 17");
		inputW1.setFocusTraversable(false);

		TextField inputW2 = new TextField();
		inputW2.setMaxHeight(20);
		inputW2.setMaxWidth(200);
		inputW2.setPromptText("Score 18");
		inputW2.setFocusTraversable(false);

		TextField inputW3 = new TextField();
		inputW3.setMaxHeight(20);
		inputW3.setMaxWidth(200);
		inputW3.setPromptText("Score 19");
		inputW3.setFocusTraversable(false);

		TextField inputW4 = new TextField();
		inputW4.setMaxHeight(20);
		inputW4.setMaxWidth(200);
		inputW4.setPromptText("Score 20");
		inputW4.setFocusTraversable(false);

		TextField inputW5 = new TextField();
		inputW5.setMaxHeight(20);
		inputW5.setMaxWidth(200);
		inputW5.setPromptText("Score 21");
		inputW5.setFocusTraversable(false);

		TextField inputW6 = new TextField();
		inputW6.setMaxHeight(20);
		inputW6.setMaxWidth(200);
		inputW6.setPromptText("Score 22");
		inputW6.setFocusTraversable(false);

		TextField inputW7 = new TextField();
		inputW7.setMaxHeight(20);
		inputW7.setMaxWidth(200);
		inputW7.setPromptText("Score 23");
		inputW7.setFocusTraversable(false);

		TextField inputW8 = new TextField();
		inputW8.setMaxHeight(20);
		inputW8.setMaxWidth(200);
		inputW8.setPromptText("Score 24");
		inputW8.setFocusTraversable(false);

		TextField inputW9 = new TextField();
		inputW9.setMaxHeight(20);
		inputW9.setMaxWidth(200);
		inputW9.setPromptText("Score 25");
		inputW9.setFocusTraversable(false);

		TextField inputW10 = new TextField();
		inputW10.setMaxHeight(20);
		inputW10.setMaxWidth(200);
		inputW10.setPromptText("Score 26");
		inputW10.setFocusTraversable(false);

		TextField inputW11 = new TextField();
		inputW11.setMaxHeight(20);
		inputW11.setMaxWidth(200);
		inputW11.setPromptText("Score 27");
		inputW11.setFocusTraversable(false);

		TextField inputW12 = new TextField();
		inputW12.setMaxHeight(20);
		inputW12.setMaxWidth(200);
		inputW12.setPromptText("Score 28");
		inputW12.setFocusTraversable(false);

		TextField inputW13 = new TextField();
		inputW13.setMaxHeight(20);
		inputW13.setMaxWidth(200);
		inputW13.setPromptText("Score 29");
		inputW13.setFocusTraversable(false);

		TextField inputW14 = new TextField();
		inputW14.setMaxHeight(20);
		inputW14.setMaxWidth(200);
		inputW14.setPromptText("Score 30");
		inputW14.setFocusTraversable(false);

		Button submit1 = new Button();
		submit1.setText("Submit " + teams.get(0).getTeamName() + " vs. " + teams.get(1).getTeamName());

		Button submit2 = new Button();
		submit2.setText("Submit " + teams.get(2).getTeamName() + " vs. " + teams.get(3).getTeamName());

		Button submit3 = new Button();
		submit3.setText("Submit " + teams.get(4).getTeamName() + " vs. " + teams.get(5).getTeamName());

		Button submit4 = new Button();
		submit4.setText("Submit " + teams.get(6).getTeamName() + " vs. " + teams.get(7).getTeamName());

		Button submit5 = new Button();
		submit5.setText("Submit " + teams.get(8).getTeamName() + " vs. " + teams.get(9).getTeamName());

		Button submit6 = new Button();
		submit6.setText("Submit " + teams.get(10).getTeamName() + " vs. " + teams.get(11).getTeamName());

		Button submit7 = new Button();
		submit7.setText("Submit " + teams.get(12).getTeamName() + " vs. " + teams.get(13).getTeamName());

		Button submit8 = new Button();
		submit8.setText("Submit " + teams.get(14).getTeamName() + " vs. " + teams.get(15).getTeamName());

		Button submit9 = new Button();
		submit9.setText("Submit Winner 1 vs. Winner 2");

		Button submit10 = new Button();
		submit10.setText("Submit Winner 3 vs. Winner 4");

		Button submit11 = new Button();
		submit11.setText("Submit Winner 5 vs. Winner 6");

		Button submit12 = new Button();
		submit12.setText("Submit Winner 7 vs. Winner 8");

		Button submit13 = new Button();
		submit13.setText("Submit Winner 9 vs. Winner 10");

		Button submit14 = new Button();
		submit14.setText("Submit Winner 11 vs. Winner 12");

		Button submit15 = new Button();
		submit15.setText("Submit Winner 13 vs. Winner 14");




	}
}
