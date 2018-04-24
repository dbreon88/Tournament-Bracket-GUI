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
//2018 Apr 23, 2018 Bracket.java
////////////////////////////////////////////////////////////////////////////

/**
 * This class represents a bracket with the teams in competition, and the top three placements.
 */
public class Bracket {
	private ArrayList<Team> competition;
	private Team champion;
	private Team runnerUp;
	private Team third;
	
	/**
	 * Constructor for bracket that initializes the competition list.
	 */
	public Bracket(){
		this.competition = new ArrayList<>();
	}
}
