package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
//2018 Apr 23, 2018 TeamLoader.java
////////////////////////////////////////////////////////////////////////////
public class TeamLoader {

	/**
	 * Static method to load teams from text file into an ArrayList containing
	 * instances of the team class.
	 * 
	 * @param fileName - Name of the file
	 * @return ArrayList containing all the teams
	 * @throws IOException
	 */
	public static ArrayList<Team> teamLoader(String fileName) throws IOException {
		ArrayList<Team> teams = new ArrayList<Team>();

		//Read the file with BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String st;
		
		//Add team to list with name from file and a rank that increments with every team loaded
		for (int i = 1; (st = br.readLine()) != null; i++)
			teams.add(new Team(st, i));
		return teams;

	}
}
