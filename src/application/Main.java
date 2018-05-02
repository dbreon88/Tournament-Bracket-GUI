package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
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
		ScrollPane scrollPane = new ScrollPane();
		final Parameters params = getParameters();
		final List<String> parameters = params.getRaw();
//        GridPane gPane = new GridPane();
//        gPane.setGridLinesVisible(true);
//        borderPane.setCenter(gPane);
//        gPane.setAlignment(Pos.CENTER);
//        gPane.getStyleClass().add("pane");
		//Scene scene = new Four(borderPane, 1600, 900, Color.DARKGRAY);
		ArrayList<Team> teams = null;
		try {
			teams = TeamLoader.teamLoader("src/teamList.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Scene scene = null;
		if (teams.size() == 0) {
			scene = new Scene(scrollPane, 1600, 900, Color.DARKGRAY);
			GridPane gridPane = new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			scrollPane.setContent(gridPane);
			Text text = new Text("No Teams No winners!");
			gridPane.add(text, 0, 0);
		}
		if(teams.size() == 1){
			scene = new Scene(scrollPane, 1600, 900, Color.DARKGRAY);
			GridPane gridPane = new GridPane();
			gridPane.setAlignment(Pos.CENTER);
			scrollPane.setContent(gridPane);
			Text text = new Text("Champion: " + teams.get(0).getTeamName());
			gridPane.add(text, 0, 0);
		}
		if (teams.size() == 2)
			scene = new TwoTeams(scrollPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 4)
			scene = new FourTeams(scrollPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 8)
			scene = new EightTeams(scrollPane, 1600, 900, Color.DARKGRAY, teams);
		if (teams.size() == 16)
			scene = new SixteenTeams(scrollPane, 1600, 900, Color.DARKGRAY, teams);
		scene.getStylesheets().add("application/style.css");

		//Finally set the scene and show so it appears to the user.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
