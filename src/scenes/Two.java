package scenes;

import backend.Team;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class Two extends Scene{
	
	public Two(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
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
		info.setText(
				"INSTRUCTIONS:\n-For each game: Enter each team's score then \n   click submit button between the two teams.\n-After completing all games for a round, move\n    on to next round and repeat process to enter teams' scores.\n After submitting the scores for the championship game the \n   top three contenders will be displayed!");
		info.setFont(Font.font("Ariel", 15));
		borderPane.setLeft((info));
		borderPane.setAlignment(info, Pos.CENTER);

		//Round 1 label
		Text round1 = new Text("Round 1");
		round1.setId("rounds");
		round1.minHeight(25);

		//Champion Label
		Label champ = new Label();
		champ.setMinHeight(25);
		champ.setText("Champion:");

		//Runner Up label
		Label runnerUp = new Label();
		runnerUp.setMinHeight(25);
		runnerUp.setText("Runner Up:");

		//Team 1 label
		Label label1 = new Label();
		label1.setMinHeight(25);
		label1.setText(teams.get(0).getTeamName() + ": ");

		//Team 2 label
		Label label2 = new Label();
		label2.setMinHeight(25);
		label2.setText(teams.get(1).getTeamName() + ": ");

		//Team 1 text box
		TextField input1 = new TextField();
		input1.setMaxHeight(20);
		input1.setMaxWidth(200);
		input1.setPromptText("Score 1");
		input1.setFocusTraversable(false);

		//Team two text box
		TextField input2 = new TextField();
		input2.setMaxHeight(20);
		input2.setMaxWidth(200);
		input2.setPromptText("Score 2");
		input2.setFocusTraversable(false);

		Label emptyRow = new Label();
		emptyRow.setText(" ");

		Label emptyCol = new Label();
		emptyCol.setMinWidth(100);
		emptyCol.setText(" ");

		//Submit scores button
		Button submit1 = new Button();
		submit1.setText("Submit Score");
		submit1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					int team1score = Integer.parseInt(input1.getText().trim());
					int team2score = Integer.parseInt(input2.getText().trim());

					if(team1score > team2score){
						champ.setText("Champion: " + teams.get(0).getTeamName());
						runnerUp.setText("Runner Up: " + teams.get(1).getTeamName());
					}else if(team1score < team2score){
						champ.setText(("Champion: " + teams.get(1).getTeamName()));
						runnerUp.setText("Runner Up: " + teams.get(0).getTeamName());
					}else{
						System.out.println("Teams may not have the same score");
					}
				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		gPane.add(round1, 0, 0);
		gPane.add(emptyRow, 0, 1, 4, 1);
		gPane.add(label1, 0, 2);
		gPane.add(input1, 1, 2);

		gPane.add(submit1, 0, 3, 2, 1);

		gPane.add(label2, 0, 4);
		gPane.add(input2, 1, 4);

		gPane.add(emptyCol, 2, 0, 1, 5);

		gPane.add(champ, 3, 3);
		gPane.add(runnerUp, 3, 6);



	}
}
