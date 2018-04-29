package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

import backend.Team;
import backend.TeamLoader;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import scenes.Eight;
import scenes.Four;
import scenes.Sixteen;
import scenes.Two;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/////////////////////////////////////////////////////////////////////////////
//Semester:         CS400 Spring 2018
//PROJECT:          Tournament Bracket GUI
//
//Authors:          Steven Wood, Jacob Latts, Ben Schulman, Dylan Breon
//
//Instructor:       Deb Deppeler (deppeler@cs.wisc.edu)
//Bugs:             No known bugs
//
//2018 Apr 23, 2018 Main.java
////////////////////////////////////////////////////////////////////////////

/**
 * This class generates and places all the components needed to display the tournament on the screen.
 * JavaFX is used to generate the GUI.
 */
public class Main extends Application {

	static ObservableList<String> names = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Bracket GUI Sample");
		BorderPane borderPane = new BorderPane();
//        GridPane gPane = new GridPane();
//        gPane.setGridLinesVisible(true);
//        borderPane.setCenter(gPane);
//        gPane.setAlignment(Pos.CENTER);
//        gPane.getStyleClass().add("pane");
		//Scene scene = new Four(borderPane, 1600, 900, Color.DARKGRAY);
		ArrayList<Team> teams = null;
		try {
			teams = TeamLoader.teamLoader("test.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Scene scene = null;
		if (teams.size() == 0) {
			scene = new Scene(borderPane, 1600, 900, Color.DARKGRAY);
			GridPane gridPane = new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			borderPane.setCenter(gridPane);
			Text text = new Text("No Teams No winners!");
			gridPane.add(text, 0, 0);
		}
		if (teams.size() == 2)
			scene = new Two(borderPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 4)
			scene = new Four(borderPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 8)
			scene = new Eight(borderPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 16)
			scene = new Sixteen(borderPane, 1600, 900, Color.DARKGRAY, teams);
		scene.getStylesheets().add("style.css");

//		
//        //String filename = getParameters().getUnnamed().get(0);
//        //pass filename to stevens method
//        int numTeams = 4; // teamArray.size();
//
//
//        DropShadow shad = new DropShadow();
//        shad.setOffsetY(3.0f);
//        shad.setColor(Color.color(0.4f, 0.4f, 0.4f));
//        
//        
//        Text title = new Text("Tournament Bracket");
//        title.setId("fancytext");
//        title.setEffect(shad);
//        borderPane.setTop(title);
//        borderPane.setAlignment(title, Pos.CENTER);
//
//
//        Label info = new Label();
//        info.setMinHeight(100);
//        info.setText("INSTRUCTIONS:\n-For each game: Enter each team's score then click submit button between the two teams.\n-After completing all games for a round, move on to next round and repeat process to enter teams' scores.\n After submitting the scores for the championship game the top three contenders will be displayed!");
//        info.setFont(Font.font("Ariel", 15));
//        borderPane.setBottom(info);
//        borderPane.setAlignment(info, Pos.CENTER);
//        
//        //Generate textboxes and labels to be added to screen
//
//        if(numTeams == 0){
//            Text noWinner = new Text("No Teams No Winner!");
//            noWinner.minHeight(25);
//            gPane.add(noWinner,0,0);
//        }else if (numTeams == 2){
//
//        }
//        else if (numTeams == 4){
//            //Should loop to add these
//            Text round1 = new Text("Round 1");
//            round1.setId("rounds");
//            round1.minHeight(25);
//
//            Text round2 = new Text("Round 2");
//            round2.setId("rounds");
//            round2.minHeight(25);
//
//            Label label1 = new Label();
//            label1.setMinHeight(25);
//            label1.setText("Team 1: ");
//
//            Label label2 = new Label();
//            label2.setMinHeight(25);
//            label2.setText("Team 2: ");
//
//            Label label3 = new Label();
//            label3.setMinHeight(25);
//            label3.setText("Team 3: ");
//
//            Label label4 = new Label();
//            label4.setMinHeight(25);
//            label4.setText("Team 4: ");
//
//            Label winner1 = new Label();
//            winner1.setMinHeight(25);
//            winner1.setText("Winner 1: ");
//
//            Label winner2 = new Label();
//            winner2.setMinHeight(25);
//            winner2.setText("Winner 2: ");
//
//            Label champ = new Label();
//            champ.setMinHeight(25);
//            champ.setText("Champion:");
//
//            Label runnerUp = new Label();
//            runnerUp.setMinHeight(25);
//            runnerUp.setText("Runner Up:");
//
//
//            Label third = new Label();
//            third.setMinHeight(25);
//            third.setText("Third Place:");
//
//
//            Label empty1 = new Label();
//            empty1.setMinHeight(200);
//            empty1.setMinWidth(50);
//            empty1.setText(" ");
//
//            Label empty2 = new Label();
//            empty2.setMinHeight(200);
//            empty2.setMinWidth(100);
//            empty2.setText(" ");
//
//            Label empty3 = new Label();
//            empty3.setMinHeight(200);
//            empty3.setMinWidth(100);
//            empty3.setText(" ");
//
//            Label empty4 = new Label();
//            empty4.setMaxHeight(300);
//            empty4.setText(" ");
//
//            //We should have a for loop initializing each button for each matchup
//            Button submit1 = new Button();
//            submit1.setText("Submit Team 1 vs. Team 2");
//            submit1.setOnAction(new EventHandler<ActionEvent>(){
//                @Override
//                public void handle(ActionEvent event){
//                    //Add funcitonality
//
//                }
//            });
//
//            Button submit2 = new Button();
//            submit2.setText("Submit Team 3 vs. Team 4");
//            //submit2.addEventHandler();
//
//            Button submit3 = new Button();
//            submit3.setText("Submit Winner 1 vs Winner 2");
//            //submit3.addEventHandler();
//            //Add event handlers for the buttons
//
//            //For loop to add each text field
//            //Make the max/min heights/widths to variables
//            TextField input1 = new TextField();
//            input1.setMaxHeight(20);
//            input1.setMaxWidth(200);
//            input1.setPromptText("Score 1");
//            input1.setFocusTraversable(false);
//
//            TextField input2 = new TextField();
//            input2.setMaxHeight(20);
//            input2.setMaxWidth(200);
//            input2.setPromptText("Score 2");
//            input2.setFocusTraversable(false);
//
//            TextField input3 = new TextField();
//            input3.setMaxHeight(20);
//            input3.setMaxWidth(200);
//            input3.setPromptText("Score 3");
//            input3.setFocusTraversable(false);
//
//            TextField input4 = new TextField();
//            input4.setMaxHeight(20);
//            input4.setMaxWidth(200);
//            input4.setPromptText("Score 4");
//            input4.setFocusTraversable(false);
//
//            TextField input5 = new TextField();
//            input5.setMaxHeight(20);
//            input5.setMaxWidth(200);
//            input5.setPromptText("Score 5");
//            input5.setFocusTraversable(false);
//
//            TextField input6 = new TextField();
//            input6.setMaxHeight(20);
//            input6.setMaxWidth(200);
//            input6.setPromptText("Score 6");
//            input6.setFocusTraversable(false);
//
//            //Add components to the pane
//            gPane.add(round1, 0, 0);
//            gPane.add(round2, 3, 0);
//
//            gPane.add(empty4, 0, 1, 7, 1);
//
//            gPane.add(label1, 0, 2);
//            gPane.add(label2, 0, 4);
//            gPane.add(label3, 0, 8);
//            gPane.add(label4, 0, 10);
//
//            gPane.add(empty1, 0, 6);
//            gPane.add(empty2, 2, 2, 1, 7);
//            gPane.add(empty3, 5, 2, 1, 7);
//
//
//            gPane.add(submit1, 0, 3, 2, 1);
//            gPane.add(submit2, 0, 9, 2, 1);
//            gPane.add(submit3, 3, 6, 2, 1);
//
//
//            gPane.add(input1, 1, 2);
//            gPane.add(input2, 1, 4);
//            gPane.add(input3, 1, 8);
//            gPane.add(input4, 1, 10);
//
//            gPane.add(winner1, 3, 3);
//            gPane.add(winner2, 3, 9);
//
//            gPane.add(input5, 4, 3);
//            gPane.add(input6, 4, 9);
//
//            gPane.add(champ, 6, 6);
//            gPane.add(runnerUp, 6, 12);
//            gPane.add(third, 6, 13);

//        }
//        else if(numTeams == 8){
//
//        }
//        else if(numTeams == 16){
//
//        }else{
//            System.err.println("Illegal number of teams");
//            System.exit(-1);
//        }


		//Finally set the scene and show so it appears to the user.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
