package backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TeamLoader {

	public static ArrayList<Team> teamLoader(String fileName) throws IOException {
		ArrayList<Team> teams = new ArrayList<Team>();

		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String st;
		for (int i = 1; (st = br.readLine()) != null; i++)
			teams.add(new Team(st, i));
		return teams;

	}
}
