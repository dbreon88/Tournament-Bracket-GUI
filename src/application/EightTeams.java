package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
//2018 Apr 23, 2018 Eight.java
////////////////////////////////////////////////////////////////////////////
/**
 * Generates a scene that represents a tournament bracket of two competing teams.
 */
public class EightTeams extends Scene {

	/**
	 * Constructor that generates a GUI for the eight teams in the given teams ArrayList.
	 * 
	 * @param root - BorderPane that is the root of the GUI
	 * @param width - width of GUI
	 * @param height - height of GUI
	 * @param fill - Color to fill as background
	 * @param teams - List of all teams participating in tournament. Length should be eight.
	 */
	public EightTeams(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
		super(root, width, height, fill);

		Team gameOneLoser = new Team();
		Team gameTwoLoser = new Team();

		//Create GridPane
		GridPane gPane = new GridPane();
		gPane.setGridLinesVisible(false);
		
		/*
		 * The actual content of the scene will be stored in borderPane,
		 * which is a BorderPane sitting in the root ScrollPane
		 */
		ScrollPane scrollPane = ((ScrollPane) root);
		BorderPane borderPane = new BorderPane();
		scrollPane.setContent(borderPane);
		borderPane.setCenter(gPane);
		gPane.setAlignment(Pos.CENTER);
		gPane.getStyleClass().add("pane");

		//Add shadows
		DropShadow shad = new DropShadow();
		shad.setOffsetY(3.0f);
		shad.setColor(Color.color(0.4f, 0.4f, 0.4f));

		//Add title and instructions to borderPane
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

		/*
		 * 
		 * Creates the "round" labels
		 * 
		 */
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

		/*
		 * 
		 * Creates the Team #X labels
		 * 
		 */
		//Team 1 Text
		Label label1 = new Label();
		label1.setMinHeight(25);
		label1.setText(teams.get(0).getTeamName() + ": ");

		//Team 2 text
		Label label2 = new Label();
		label2.setMinHeight(25);
		label2.setText(teams.get(7).getTeamName() + ": ");

		//Team 3 text
		Label label3 = new Label();
		label3.setMinHeight(25);
		label3.setText(teams.get(3).getTeamName() + ": ");

		//Team 4 text
		Label label4 = new Label();
		label4.setMinHeight(25);
		label4.setText(teams.get(4).getTeamName() + ": ");

		//Team 5 Text
		Label label5 = new Label();
		label5.setMinHeight(25);
		label5.setText(teams.get(1).getTeamName() + ": ");

		//Team 6 text
		Label label6 = new Label();
		label6.setMinHeight(25);
		label6.setText(teams.get(6).getTeamName() + ": ");

		//Team 7 text
		Label label7 = new Label();
		label7.setMinHeight(25);
		label7.setText(teams.get(2).getTeamName() + ": ");

		//Team 8 text
		Label label8 = new Label();
		label8.setMinHeight(25);
		label8.setText(teams.get(5).getTeamName() + ": ");

		
		/*
		 * 
		 * Create the labels for each winner for each game 
		 * 
		 * */
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

		Label winner5 = new Label();
		winner5.setMinHeight(25);
		winner5.setText("Winner 5: ");

		//Winner 6 Text
		Label winner6 = new Label();
		winner6.setMinHeight(25);
		winner6.setText("Winner 6: ");

		Label champ = new Label();
		champ.setMinHeight(25);
		champ.setText("Champion:");

		Label runnerUp = new Label();
		runnerUp.setMinHeight(25);
		runnerUp.setText("Runner Up:");

		Label thirdPlace = new Label();
		thirdPlace.setMinHeight(25);
		thirdPlace.setText("Third: ");

		/*
		 * 
		 * Create the TextFields for user score entry
		 * 
		 */
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
		Label emptyCol1 = new Label(" ");
		Label emptyCol2 = new Label(" ");
		Label emptyCol3 = new Label(" ");
		emptyCol1.setMinWidth(100);
		emptyCol2.setMinWidth(100);
		emptyCol3.setMinWidth(100);

		/*
		 * 
		 * Create the action listeners for submit buttons
		 * First one is comment but all are same code just for different teams
		 * 
		 */
		Button submit1 = new Button();
		submit1.setText("Submit Score");
		submit1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try{
					//The game has been decided so we must update all GUI components accordingly
					winner1.setText("Winner 1: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner5.setText("Winner 5: ");

					//Retrieve scores entered by user. If scores are not numbers, NumberFormatException will be thrown
					int team1score = Integer.parseInt(input1.getText().trim());
					int team2score = Integer.parseInt(input2.getText().trim());

					//Do different tasks depending on who won
					if(team1score > team2score){
						winner1.setText(teams.get(0).getTeamName());
					} else if(team1score < team2score){
						winner1.setText(teams.get(7).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				}
				//Score entered was not a number so the game cannot be scored
				catch(NumberFormatException e){
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
					winner5.setText("Winner 5: ");

					int team1score = Integer.parseInt(input3.getText().trim());
					int team2score = Integer.parseInt(input4.getText().trim());

					if(team1score > team2score){
						winner2.setText(teams.get(3).getTeamName());
					} else if(team1score < team2score){
						winner2.setText(teams.get(4).getTeamName());
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
					winner3.setText("Winner 3: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner6.setText("Winner 6: ");

					int team1score = Integer.parseInt(input5.getText().trim());
					int team2score = Integer.parseInt(input6.getText().trim());

					if(team1score > team2score){
						winner3.setText(teams.get(1).getTeamName());
					} else if(team1score < team2score){
						winner3.setText(teams.get(6).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit4 = new Button();
		submit4.setText("Submit Score");
		submit4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					winner4.setText("Winner 4: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner6.setText("Winner 6: ");

					int team1score = Integer.parseInt(input7.getText().trim());
					int team2score = Integer.parseInt(input8.getText().trim());

					if(team1score > team2score){
						winner4.setText(teams.get(2).getTeamName());
					} else if(team1score < team2score){
						winner4.setText(teams.get(5).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit5 = new Button();
		submit5.setText("Submit Score");
		submit5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner5.setText("Winner 5: ");

					int team1score = Integer.parseInt(input9.getText().trim());
					int team2score = Integer.parseInt(input10.getText().trim());

					if(team1score > team2score){
						winner5.setText(winner1.getText());
						gameOneLoser.setTeamName(winner2.getText());
						gameOneLoser.setTeamScore(team2score);
					} else if(team1score < team2score){
						winner5.setText(winner2.getText());
						gameOneLoser.setTeamName(winner1.getText());
						gameOneLoser.setTeamScore(team1score);
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit6 = new Button();
		submit6.setText("Submit Score");
		submit6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner6.setText("Winner 6: ");

					int team1score = Integer.parseInt(input11.getText().trim());
					int team2score = Integer.parseInt(input12.getText().trim());

					if(team1score > team2score){
						winner6.setText(winner3.getText());
						gameTwoLoser.setTeamName(winner4.getText());
						gameTwoLoser.setTeamScore(team2score);
					} else if(team1score < team2score){
						winner6.setText(winner4.getText());
						gameTwoLoser.setTeamName(winner3.getText());
						gameTwoLoser.setTeamScore(team1score);
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit7 = new Button();
		submit7.setText("Submit Score");
		submit7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					int team1score = Integer.parseInt(input13.getText().trim());
					int team2score = Integer.parseInt(input14.getText().trim());

					if(team1score > team2score){
						champ.setText("Champion: "+winner5.getText());
						runnerUp.setText("Runner Up: "+winner6.getText());
					} else if(team1score < team2score){
						champ.setText("Champion: "+winner6.getText());
						runnerUp.setText("Runner Up: "+winner5.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

					if(gameOneLoser.getTeamScore() > gameTwoLoser.getTeamScore())
						thirdPlace.setText("Third: " + gameOneLoser.getTeamName());
					else
						thirdPlace.setText("Third: " + gameTwoLoser.getTeamName());

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		/*
		 * Add all elements to their respective positions in the grid
		 */
		gPane.add(round1, 0, 0);
		gPane.add(round2, 3, 0);
		gPane.add(round3, 6, 0);

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


		gPane.add(submit1, 0, 3, 2, 1);
		gPane.add(submit2, 0, 7, 2, 1);
		gPane.add(submit3, 0, 11, 2, 1);
		gPane.add(submit4, 0, 15, 2, 1);

		gPane.add(emptyCol1, 2, 0, 1, 16);

		gPane.add(winner1, 3, 3);
		gPane.add(winner2, 3, 7);
		gPane.add(winner3, 3, 11);
		gPane.add(winner4, 3, 15);

		gPane.add(input9, 4,3);
		gPane.add(input10, 4, 7);
		gPane.add(input11, 4, 11);
		gPane.add(input12, 4, 15);

		gPane.add(submit5, 3, 5, 2, 1);
		gPane.add(submit6, 3, 13, 2, 1);

		gPane.add(emptyCol2, 5, 0, 1, 16);

		gPane.add(winner5, 6, 5);
		gPane.add(winner6, 6, 13);

		gPane.add(input13, 7, 5);
		gPane.add(input14, 7, 13);

		gPane.add(submit7, 6,9,2,1);

		gPane.add(emptyCol3, 8, 0, 1, 16);

		gPane.add(champ, 9, 9);
		gPane.add(runnerUp, 9, 15);
		gPane.add(thirdPlace, 9, 16);


	}
}
