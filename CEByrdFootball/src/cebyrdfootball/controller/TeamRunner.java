package cebyrdfootball.controller;

import cebyrdfootball.model.*;

public class TeamRunner 
{

	public static void main(String[] args)
	{
		Team myTeam = new Team("Yellow Jackets ", 27.0, 124, true);
		System.out.print(myTeam);
		Team otherTeam = new Team("Panthers " , 34.5, 132, true);
		System.out.print(otherTeam);
		

	}

}
