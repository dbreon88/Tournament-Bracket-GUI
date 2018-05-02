package application;
////////////////////////////////////////////////////////////////////////////
//Semester:         CS400 Spring 2018
//PROJECT:          Tournament Bracket GUI
//
//Authors:          Steven Wood, Jacob Latts, Ben Schulman, Dylan Breon
//
//Instructor:       Deb Deppeler (deppeler@cs.wisc.edu)
//Bugs:             No known bugs
//
//2018 Apr 23, 2018 Team.java
////////////////////////////////////////////////////////////////////////////

/**
 * This class represents a team that has a team name's and it's rank.
 */
public class Team {
	private String teamName;
	private int score;

	public Team(){
		teamName = "";
		score = 0;
	}

	/**
	 * Constructor that creates a team with a given name and starting rank
	 * 
	 * @param teamName Team's name
	 * @param teamRank Starting rank
	 */
	public Team(String teamName, Integer teamRank){
		this.teamName = teamName;
		this.score = teamRank;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getTeamScore() {
		return score;
	}

	public void setTeamScore(Integer teamRank) {
		this.score = teamRank;
	}

	public void setTeam(Team a){
		this.teamName = a.teamName;
		this.score = a.score;
	}
}
