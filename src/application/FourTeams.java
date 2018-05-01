package application;

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
////////////////////////////////////////////////////////////////////////////
//Semester:         CS400 Spring 2018
//PROJECT:          Tournament Bracket GUI
//
//Authors:          Steven Wood, Jacob Latts, Ben Schulman, Dylan Breon
//
//Instructor:       Deb Deppeler (deppeler@cs.wisc.edu)
//Bugs:             No known bugs
//
//2018 Apr 23, 2018 Four.java
////////////////////////////////////////////////////////////////////////////
/**
 * Generates a scene that represents a tournament bracket of four competing teams.
 */
public class FourTeams extends Scene {

	/**
	 * Constructor that generates a GUI for the four teams in the given teams ArrayList.
	 * 
	 * @param root - BorderPane that is the root of the GUI
	 * @param width - width of GUI
	 * @param height - height of GUI
	 * @param fill - Color to fill as background
	 * @param teams - List of all teams participating in tournament. Length should be four.
	 */
	public FourTeams(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
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

		// Generate textboxes and labels to be added to screen
		//Round 1 text
		Text round1 = new Text("Round 1");
		round1.setId("rounds");
		round1.minHeight(25);

		//Round 2 Text
		Text round2 = new Text("Round 2");
		round2.setId("rounds");
		round2.minHeight(25);

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

		//Winer 1 Text
		Label winner1 = new Label();
		winner1.setMinHeight(25);
		winner1.setText("Winner 1: ");

		//Winner 2 Text
		Label winner2 = new Label();
		winner2.setMinHeight(25);
		winner2.setText("Winner 2: ");

		//Champion label
		Label champ = new Label();
		champ.setMinHeight(25);
		champ.setText("Champion:");

		Label runnerUp = new Label();
		runnerUp.setMinHeight(25);
		runnerUp.setText("Runner Up:");

		Label empty1 = new Label();
		empty1.setMinHeight(200);
		empty1.setMinWidth(50);
		empty1.setText(" ");

		Label empty2 = new Label();
		empty2.setMinHeight(200);
		empty2.setMinWidth(100);
		empty2.setText(" ");

		Label empty3 = new Label();
		empty3.setMinHeight(200);
		empty3.setMinWidth(100);
		empty3.setText(" ");

		Label empty4 = new Label();
		empty4.setMaxHeight(300);
		empty4.setText(" ");

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

		Button submit1 = new Button();
		submit1.setText("Submit Score");
		submit1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					winner1.setText("Winner 1: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					int team1score = Integer.parseInt(input1.getText().trim());
					int team2score = Integer.parseInt(input2.getText().trim());

					if(team1score > team2score){
						winner1.setText(teams.get(0).getTeamName());
					} else if(team1score < team2score){
						winner1.setText(teams.get(1).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit2 = new Button();
		submit2.setText("Submit Score");
		submit2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					winner2.setText("Winner 2: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					int team1score = Integer.parseInt(input3.getText().trim());
					int team2score = Integer.parseInt(input4.getText().trim());

					if(team1score > team2score){
						winner2.setText(teams.get(2).getTeamName());
					} else if(team1score < team2score){
						winner2.setText(teams.get(3).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit3 = new Button();
		submit3.setText("Submit Score");
		submit3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					int team1score = Integer.parseInt(input5.getText().trim());
					int team2score = Integer.parseInt(input6.getText().trim());

					if(team1score > team2score){
						champ.setText("Champion: " + winner1.getText());
						runnerUp.setText("Runner Up: " + winner2.getText());
					} else if(team1score < team2score){
						champ.setText("Champion: " + winner2.getText());
						runnerUp.setText("Runner Up: " + winner1.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});
		// Add event handlers for the buttons


		// Add components to the pane
		gPane.add(round1, 0, 0);
		gPane.add(round2, 3, 0);

		gPane.add(empty4, 0, 1, 7, 1);

		gPane.add(label1, 0, 2);
		gPane.add(label2, 0, 4);
		gPane.add(label3, 0, 8);
		gPane.add(label4, 0, 10);

		gPane.add(empty1, 0, 6);
		gPane.add(empty2, 2, 2, 1, 7);
		gPane.add(empty3, 5, 2, 1, 7);

		gPane.add(submit1, 0, 3, 2, 1);
		gPane.add(submit2, 0, 9, 2, 1);
		gPane.add(submit3, 3, 6, 2, 1);

		gPane.add(input1, 1, 2);
		gPane.add(input2, 1, 4);
		gPane.add(input3, 1, 8);
		gPane.add(input4, 1, 10);

		gPane.add(winner1, 3, 3);
		gPane.add(winner2, 3, 9);

		gPane.add(input5, 4, 3);
		gPane.add(input6, 4, 9);

		gPane.add(champ, 6, 6);
		gPane.add(runnerUp, 6, 12);
	}

}
