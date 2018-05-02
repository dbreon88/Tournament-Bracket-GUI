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
import javafx.scene.layout.RowConstraints;
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
//2018 Apr 23, 2018 Sixteen.java
////////////////////////////////////////////////////////////////////////////

/**
 * Generates a scene that represents a tournament bracket of two competing teams.
 */
public class SixteenTeams extends Scene {

	/**
	 * Constructor that generates a GUI for the four teams in the given teams ArrayList.
	 * 
	 * @param root - BorderPane that is the root of the GUI
	 * @param width - width of GUI
	 * @param height - height of GUI
	 * @param fill - Color to fill as background
	 * @param teams - List of all teams participating in tournament. Length should be four.
	 */
	public SixteenTeams(Parent root, double width, double height, Paint fill, ArrayList<Team> teams) {
		super(root, width, height, fill);

		Team gameOneLoser = new Team();
		Team gameTwoLoser = new Team();
		
		GridPane gPane = new GridPane();
		gPane.getRowConstraints().add(new RowConstraints(15));
		gPane.setGridLinesVisible(false);
		ScrollPane scrollPane = ((ScrollPane) root);
		BorderPane borderPane = new BorderPane();
		scrollPane.setContent(borderPane);
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


		//Round 1 text
		Text round1 = new Text("Round 1");
		round1.setId("rounds");
		round1.maxHeight(15);

		//Round 2 Text
		Text round2 = new Text("Round 2");
		round2.setId("rounds");
		round2.maxHeight(15);

		//Round 3 Text
		Text round3 = new Text("Round 3");
		round3.setId("rounds");
		round3.maxHeight(15);

		Text round4 = new Text("Round 4");
		round4.setId("rounds");
		round4.maxWidth(15);

		//Team 1 Text
		Label label1 = new Label();
		label1.setPrefHeight(15);
		label1.setText(teams.get(0).getTeamName() + ": ");

		//Team 2 text
		Label label2 = new Label();
		label2.setPrefHeight(15);
		label2.setText(teams.get(15).getTeamName() + ": ");

		//Team 3 text
		Label label3 = new Label();
		label3.setPrefHeight(15);
		label3.setText(teams.get(7).getTeamName() + ": ");

		//Team 4 text
		Label label4 = new Label();
		label4.setPrefHeight(15);
		label4.setText(teams.get(8).getTeamName() + ": ");

		//Team 5 Text
		Label label5 = new Label();
		label5.setPrefHeight(15);
		label5.setText(teams.get(3).getTeamName() + ": ");

		//Team 6 text
		Label label6 = new Label();
		label6.setPrefHeight(15);
		label6.setText(teams.get(12).getTeamName() + ": ");

		//Team 7 text
		Label label7 = new Label();
		label7.setPrefHeight(15);
		label7.setText(teams.get(4).getTeamName() + ": ");

		//Team 8 text
		Label label8 = new Label();
		label8.setPrefHeight(15);
		label8.setText(teams.get(11).getTeamName() + ": ");

		Label label9 = new Label();
		label9.setPrefHeight(15);
		label9.setText(teams.get(1).getTeamName() + ": ");

		Label label10 = new Label();
		label10.setPrefHeight(15);
		label10.setText(teams.get(14).getTeamName() + ": ");

		Label label11 = new Label();
		label11.setPrefHeight(15);
		label11.setText(teams.get(6).getTeamName() + ": ");

		Label label12 = new Label();
		label12.setPrefHeight(15);
		label12.setText(teams.get(9).getTeamName() + ": ");

		Label label13 = new Label();
		label13.setPrefHeight(15);
		label13.setText(teams.get(2).getTeamName() + ": ");

		Label label14 = new Label();
		label14.setPrefHeight(15);
		label14.setText(teams.get(13).getTeamName() + ": ");

		Label label15 = new Label();
		label15.setPrefHeight(15);
		label15.setText(teams.get(5).getTeamName() + ": ");

		Label label16 = new Label();
		label16.setPrefHeight(15);
		label16.setText(teams.get(10).getTeamName() + ": ");

		//Winner 1 text
		Label winner1 = new Label();
		winner1.setPrefHeight(15);
		winner1.setText("Winner 1: ");
		

		//Winner 2 Text
		Label winner2 = new Label();
		winner2.setPrefHeight(15);
		winner2.setText("Winner 2: ");

		//Winner 3 text
		Label winner3 = new Label();
		winner3.setPrefHeight(15);
		winner3.setText("Winner 3: ");

		//Winner 4 Text
		Label winner4 = new Label();
		winner4.setPrefHeight(15);
		winner4.setText("Winner 4: ");

		//Winner 5 Text
		Label winner5 = new Label();
		winner5.setPrefHeight(15);
		winner5.setText("Winner 5: ");

		//Winner 6 Text
		Label winner6 = new Label();
		winner6.setPrefHeight(15);
		winner6.setText("Winner 6: ");

		//Winner 7 Text
		Label winner7 = new Label();
		winner7.setPrefHeight(15);
		winner7.setText("Winner 7: ");

		//Winner 8 Text
		Label winner8 = new Label();
		winner8.setPrefHeight(15);
		winner8.setText("Winner 8: ");

		Label winner9 = new Label();
		winner9.setPrefHeight(15);
		winner9.setText("Winner 9: ");

		Label winner10 = new Label();
		winner10.setPrefHeight(15);
		winner10.setText("Winner 10: ");

		Label winner11 = new Label();
		winner11.setPrefHeight(15);
		winner11.setText("Winner 11: ");

		Label winner12 = new Label();
		winner12.setPrefHeight(15);
		winner12.setText("Winner 12: ");

		Label winner13 = new Label();
		winner13.setPrefHeight(15);
		winner13.setText("Winner 13: ");

		Label winner14 = new Label();
		winner14.setPrefHeight(15);
		winner14.setText("Winner 14: ");

		Label champ = new Label();
		champ.setPrefHeight(15);
		champ.setText("Champion:");

		Label runnerUp = new Label();
		runnerUp.setPrefHeight(15);
		runnerUp.setText("Runner Up:");

		Label thirdPlace = new Label();
		thirdPlace.setMinHeight(25);
		thirdPlace.setText("Third: ");
		
		TextField input1 = new TextField();
		input1.setPrefHeight(15);
		input1.setMaxWidth(200);
		input1.setPromptText("Score 1");
		input1.setFocusTraversable(false);


		TextField input2 = new TextField();
		input2.setPrefHeight(15);
		input2.setMaxWidth(200);
		input2.setPromptText("Score 2");
		input2.setFocusTraversable(false);

		TextField input3 = new TextField();
		input3.setPrefHeight(15);
		input3.setMaxWidth(200);
		input3.setPromptText("Score 3");
		input3.setFocusTraversable(false);

		TextField input4 = new TextField();
		input4.setPrefHeight(15);
		input4.setMaxWidth(200);
		input4.setPromptText("Score 4");
		input4.setFocusTraversable(false);

		TextField input5 = new TextField();
		input5.setPrefHeight(15);
		input5.setMaxWidth(200);
		input5.setPromptText("Score 5");
		input5.setFocusTraversable(false);

		TextField input6 = new TextField();
		input6.setPrefHeight(15);
		input6.setMaxWidth(200);
		input6.setPromptText("Score 6");
		input6.setFocusTraversable(false);

		TextField input7 = new TextField();
		input7.setPrefHeight(15);
		input7.setMaxWidth(200);
		input7.setPromptText("Score 7");
		input7.setFocusTraversable(false);

		TextField input8 = new TextField();
		input8.setPrefHeight(15);
		input8.setMaxWidth(200);
		input8.setPromptText("Score 8");
		input8.setFocusTraversable(false);

		TextField input9 = new TextField();
		input9.setPrefHeight(15);
		input9.setMaxWidth(200);
		input9.setPromptText("Score 9");
		input9.setFocusTraversable(false);

		TextField input10 = new TextField();
		input10.setPrefHeight(15);
		input10.setMaxWidth(200);
		input10.setPromptText("Score 10");
		input10.setFocusTraversable(false);

		TextField input11 = new TextField();
		input11.setPrefHeight(15);
		input11.setMaxWidth(200);
		input11.setPromptText("Score 11");
		input11.setFocusTraversable(false);

		TextField input12 = new TextField();
		input12.setPrefHeight(15);
		input12.setMaxWidth(200);
		input12.setPromptText("Score 12");
		input12.setFocusTraversable(false);

		TextField input13 = new TextField();
		input13.setPrefHeight(15);
		input13.setMaxWidth(200);
		input13.setPromptText("Score 13");
		input13.setFocusTraversable(false);

		TextField input14 = new TextField();
		input14.setPrefHeight(15);
		input14.setMaxWidth(200);
		input14.setPromptText("Score 14");
		input14.setFocusTraversable(false);

		TextField input15 = new TextField();
		input15.setPrefHeight(15);
		input15.setMaxWidth(200);
		input15.setPromptText("Score 15");
		input15.setFocusTraversable(false);

		TextField input16 = new TextField();
		input16.setPrefHeight(15);
		input16.setMaxWidth(200);
		input16.setPromptText("Score 16");
		input16.setFocusTraversable(false);

		TextField inputW1 = new TextField();
		inputW1.setPrefHeight(15);
		inputW1.setMaxWidth(200);
		inputW1.setPromptText("Score 17");
		inputW1.setFocusTraversable(false);

		TextField inputW2 = new TextField();
		inputW2.setPrefHeight(15);
		inputW2.setMaxWidth(200);
		inputW2.setPromptText("Score 18");
		inputW2.setFocusTraversable(false);

		TextField inputW3 = new TextField();
		inputW3.setPrefHeight(15);
		inputW3.setMaxWidth(200);
		inputW3.setPromptText("Score 19");
		inputW3.setFocusTraversable(false);

		TextField inputW4 = new TextField();
		inputW4.setPrefHeight(15);
		inputW4.setMaxWidth(200);
		inputW4.setPromptText("Score 20");
		inputW4.setFocusTraversable(false);

		TextField inputW5 = new TextField();
		inputW5.setPrefHeight(15);
		inputW5.setMaxWidth(200);
		inputW5.setPromptText("Score 21");
		inputW5.setFocusTraversable(false);

		TextField inputW6 = new TextField();
		inputW6.setPrefHeight(15);
		inputW6.setMaxWidth(200);
		inputW6.setPromptText("Score 22");
		inputW6.setFocusTraversable(false);

		TextField inputW7 = new TextField();
		inputW7.setPrefHeight(15);
		inputW7.setMaxWidth(200);
		inputW7.setPromptText("Score 23");
		inputW7.setFocusTraversable(false);

		TextField inputW8 = new TextField();
		inputW8.setPrefHeight(15);
		inputW8.setMaxWidth(200);
		inputW8.setPromptText("Score 24");
		inputW8.setFocusTraversable(false);

		TextField inputW9 = new TextField();
		inputW9.setPrefHeight(15);
		inputW9.setMaxWidth(200);
		inputW9.setPromptText("Score 25");
		inputW9.setFocusTraversable(false);

		TextField inputW10 = new TextField();
		inputW10.setPrefHeight(15);
		inputW10.setMaxWidth(200);
		inputW10.setPromptText("Score 26");
		inputW10.setFocusTraversable(false);

		TextField inputW11 = new TextField();
		inputW11.setPrefHeight(15);
		inputW11.setMaxWidth(200);
		inputW11.setPromptText("Score 27");
		inputW11.setFocusTraversable(false);

		TextField inputW12 = new TextField();
		inputW12.setPrefHeight(15);
		inputW12.setMaxWidth(200);
		inputW12.setPromptText("Score 28");
		inputW12.setFocusTraversable(false);

		TextField inputW13 = new TextField();
		inputW13.setPrefHeight(15);
		inputW13.setMaxWidth(200);
		inputW13.setPromptText("Score 29");
		inputW13.setFocusTraversable(false);

		TextField inputW14 = new TextField();
		inputW14.setPrefHeight(15);
		inputW14.setMaxWidth(200);
		inputW14.setPromptText("Score 30");
		inputW14.setFocusTraversable(false);

		Button submit1 = new Button();
		submit1.setText("Submit Score");
		submit1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					winner1.setText("Winner 1: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner9.setText("Winner 9: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(input1.getText().trim());
					int team2score = Integer.parseInt(input2.getText().trim());

					if(team1score > team2score){
						winner1.setText(teams.get(0).getTeamName());
					} else if(team1score < team2score){
						winner1.setText(teams.get(15).getTeamName());
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
					winner9.setText("Winner 9: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(input3.getText().trim());
					int team2score = Integer.parseInt(input4.getText().trim());

					if(team1score > team2score){
						winner2.setText(teams.get(7).getTeamName());
					} else if(team1score < team2score){
						winner2.setText(teams.get(8).getTeamName());
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
					winner10.setText("Winner 10: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(input5.getText().trim());
					int team2score = Integer.parseInt(input6.getText().trim());

					if(team1score > team2score){
						winner3.setText(teams.get(3).getTeamName());
					} else if(team1score < team2score){
						winner3.setText(teams.get(12).getTeamName());
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
					winner10.setText("Winner 10: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(input7.getText().trim());
					int team2score = Integer.parseInt(input8.getText().trim());

					if(team1score > team2score){
						winner4.setText(teams.get(4).getTeamName());
					} else if(team1score < team2score){
						winner4.setText(teams.get(11).getTeamName());
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
					winner5.setText("Winner 5: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner11.setText("Winner 11: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(input9.getText().trim());
					int team2score = Integer.parseInt(input10.getText().trim());

					if(team1score > team2score){
						winner5.setText(teams.get(1).getTeamName());
					} else if(team1score < team2score){
						winner5.setText(teams.get(14).getTeamName());
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
					winner6.setText("Winner 6: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner11.setText("Winner 11: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(input11.getText().trim());
					int team2score = Integer.parseInt(input12.getText().trim());

					if(team1score > team2score){
						winner6.setText(teams.get(6).getTeamName());
					} else if(team1score < team2score){
						winner6.setText(teams.get(9).getTeamName());
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
					winner7.setText("Winner 7: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner12.setText("Winner 12: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(input13.getText().trim());
					int team2score = Integer.parseInt(input14.getText().trim());

					if(team1score > team2score){
						winner7.setText(teams.get(2).getTeamName());
					} else if(team1score < team2score){
						winner7.setText(teams.get(13).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit8 = new Button();
		submit8.setText("Submit Score");
		submit8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					winner8.setText("Winner 8: ");

					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");
					winner12.setText("Winner 12: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(input15.getText().trim());
					int team2score = Integer.parseInt(input16.getText().trim());

					if(team1score > team2score){
						winner8.setText(teams.get(5).getTeamName());
					} else if(team1score < team2score){
						winner8.setText(teams.get(10).getTeamName());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit9 = new Button();
		submit9.setText("Submit Score");
		submit9.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner9.setText("Winner 9: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(inputW1.getText().trim());
					int team2score = Integer.parseInt(inputW2.getText().trim());

					if(team1score > team2score){
						winner9.setText(winner1.getText());
					} else if(team1score < team2score){
						winner9.setText(winner2.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit10 = new Button();
		submit10.setText("Submit Score");
		submit10.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner10.setText("Winner 10: ");
					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(inputW3.getText().trim());
					int team2score = Integer.parseInt(inputW4.getText().trim());

					if(team1score > team2score){
						winner10.setText(winner3.getText());
					} else if(team1score < team2score){
						winner10.setText(winner4.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit11 = new Button();
		submit11.setText("Submit Score");
		submit11.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner11.setText("Winner 11: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(inputW5.getText().trim());
					int team2score = Integer.parseInt(inputW6.getText().trim());

					if(team1score > team2score){
						winner11.setText(winner5.getText());
					} else if(team1score < team2score){
						winner11.setText(winner6.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit12 = new Button();
		submit12.setText("Submit Score");
		submit12.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner12.setText("Winner 12: ");
					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(inputW7.getText().trim());
					int team2score = Integer.parseInt(inputW8.getText().trim());

					if(team1score > team2score){
						winner12.setText(winner7.getText());
					} else if(team1score < team2score){
						winner12.setText(winner8.getText());
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit13 = new Button();
		submit13.setText("Submit Score");
		submit13.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner13.setText("Winner 13: ");

					int team1score = Integer.parseInt(inputW9.getText().trim());
					int team2score = Integer.parseInt(inputW10.getText().trim());

					if(team1score > team2score){
						winner13.setText(winner9.getText());
						gameOneLoser.setTeamName(winner10.getText());
						gameOneLoser.setTeamScore(team2score);
					} else if(team1score < team2score){
						winner13.setText(winner10.getText());
						gameOneLoser.setTeamName(winner9.getText());
						gameOneLoser.setTeamScore(team1score);
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit14 = new Button();
		submit14.setText("Submit Score");
		submit14.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					winner14.setText("Winner 14: ");

					int team1score = Integer.parseInt(inputW11.getText().trim());
					int team2score = Integer.parseInt(inputW12.getText().trim());

					if(team1score > team2score){
						winner14.setText(winner11.getText());
						gameTwoLoser.setTeamName(winner12.getText());
						gameTwoLoser.setTeamScore(team2score);
					} else if(team1score < team2score){
						winner14.setText(winner12.getText());
						gameTwoLoser.setTeamName(winner11.getText());
						gameTwoLoser.setTeamScore(team1score);
					} else{
						System.out.println("Teams may not have the same score");
					}

				} catch(NumberFormatException e){
					System.out.println("Invalid Score");
				}

			}
		});

		Button submit15 = new Button();
		submit15.setText("Submit Score");
		submit15.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try{
					champ.setText("Champion: ");
					runnerUp.setText("Runner Up: ");

					int team1score = Integer.parseInt(inputW13.getText().trim());
					int team2score = Integer.parseInt(inputW14.getText().trim());

					if(team1score > team2score){
						champ.setText("Champion: "+winner13.getText());
						runnerUp.setText("Runner Up: "+winner14.getText());
					} else if(team1score < team2score){
						champ.setText("Champion: "+winner14.getText());
						runnerUp.setText("Runner Up: "+winner13.getText());
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

		Label emptyRow1 = new Label(" ");
		Label emptyCol1 = new Label(" ");
		Label emptyCol2 = new Label(" ");
		Label emptyCol3 = new Label(" ");
		emptyCol1.setMinWidth(20);
		emptyCol2.setMinWidth(20);
		emptyCol3.setMinWidth(20);

		gPane.add(round1, 0, 0);
		gPane.add(round2, 3, 0);
		gPane.add(round3, 6, 0);
		gPane.add(round4, 9, 0);

		gPane.add(emptyRow1, 0, 1, 12, 1);

		gPane.add(label1, 0, 2);
		gPane.add(label2, 0, 4);
		gPane.add(label3, 0, 6);
		gPane.add(label4, 0, 8);
		gPane.add(label5, 0, 10);
		gPane.add(label6, 0, 12);
		gPane.add(label7, 0, 14);
		gPane.add(label8, 0, 16);
		gPane.add(label9, 0, 18);
		gPane.add(label10, 0, 20);
		gPane.add(label11, 0, 22);
		gPane.add(label12, 0, 24);
		gPane.add(label13, 0, 26);
		gPane.add(label14, 0, 28);
		gPane.add(label15, 0, 30);
		gPane.add(label16, 0, 32);

		gPane.add(input1, 1, 2);
		gPane.add(input2, 1, 4);
		gPane.add(input3, 1, 6);
		gPane.add(input4, 1, 8);
		gPane.add(input5, 1, 10);
		gPane.add(input6, 1, 12);
		gPane.add(input7, 1, 14);
		gPane.add(input8, 1, 16);
		gPane.add(input9, 1, 18);
		gPane.add(input10, 1, 20);
		gPane.add(input11, 1, 22);
		gPane.add(input12, 1, 24);
		gPane.add(input13, 1, 26);
		gPane.add(input14, 1, 28);
		gPane.add(input15, 1, 30);
		gPane.add(input16, 1, 32);

		gPane.add(emptyCol1, 2, 0, 1, 32);

		gPane.add(winner1, 3,3);
		gPane.add(winner2, 3,7);
		gPane.add(winner3, 3,11);
		gPane.add(winner4, 3,15);
		gPane.add(winner5, 3,19);
		gPane.add(winner6, 3,23);
		gPane.add(winner7, 3,27);
		gPane.add(winner8, 3,31);

		gPane.add(inputW1, 4, 3);
		gPane.add(inputW2, 4, 7);
		gPane.add(inputW3, 4, 11);
		gPane.add(inputW4, 4, 15);
		gPane.add(inputW5, 4, 19);
		gPane.add(inputW6, 4, 23);
		gPane.add(inputW7, 4, 27);
		gPane.add(inputW8, 4, 31);

		gPane.add(emptyCol2, 5, 0, 1, 32);

		gPane.add(winner9, 6,5);
		gPane.add(winner10, 6,13);
		gPane.add(winner11, 6,21);
		gPane.add(winner12, 6,29);

		gPane.add(inputW9, 7, 5);
		gPane.add(inputW10, 7, 13);
		gPane.add(inputW11, 7, 21);
		gPane.add(inputW12, 7, 29);

		gPane.add(emptyCol3, 8, 0, 1, 32);

		gPane.add(winner13, 9,9);
		gPane.add(winner14, 9,25);

		gPane.add(inputW13, 10, 9);
		gPane.add(inputW14, 10, 25);

		gPane.add(champ, 12, 17);
		gPane.add(runnerUp, 12, 31);
		gPane.add(thirdPlace, 12, 32);

		gPane.add(submit1, 0, 3, 2,1);
		gPane.add(submit2, 0, 7, 2,1);
		gPane.add(submit3, 0, 11, 2,1);
		gPane.add(submit4, 0, 15, 2,1);
		gPane.add(submit5, 0, 19, 2,1);
		gPane.add(submit6, 0, 23, 2,1);
		gPane.add(submit7, 0, 27, 2,1);
		gPane.add(submit8, 0, 31, 2,1);
		gPane.add(submit9, 3, 5, 2,1);
		gPane.add(submit10, 3, 13, 2,1);
		gPane.add(submit11, 3, 21, 2,1);
		gPane.add(submit12, 3, 29, 2,1);
		gPane.add(submit13, 6, 9, 2,1);
		gPane.add(submit14, 6, 25, 2,1);
		gPane.add(submit15, 9, 17, 2,1);


	}
}
