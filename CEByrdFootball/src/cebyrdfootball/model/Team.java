package cebyrdfootball.model;

public class Team
{
private String teamName;
private double avgPPG;
private int numberOfPlayers;
private boolean winningRecord;

public Team()
{
	teamName = "";
	avgPPG = 0.00;
	numberOfPlayers = 0;
	winningRecord = false;
}
public Team(String teamName, double avgPPG, int numberOfPlayers, boolean winningRecord)
{
	this.teamName= teamName;
	this.avgPPG = avgPPG;
	this.numberOfPlayers = numberOfPlayers;
	this.winningRecord = winningRecord;
	
}
}
