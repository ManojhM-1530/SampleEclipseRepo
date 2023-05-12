package com.Inheritsnce;

class CricketPlayer{
	String playerName;
	String teamName;
	
	public void setCricketPlayerData(String playerName,String teamName) {
		this.playerName =playerName;
		this.teamName = teamName;
	}
	public void getCricketPlayerData() {
		System.out.println("Player Name :"+playerName+"\nTeam Name :"+teamName);
	}
}

class Batman extends CricketPlayer{
	int highestScore;
	double averageScore;
	
	public void setBatmanData(int highestScore,double averageScore) {
		this.highestScore =highestScore;
		this.averageScore =averageScore;
	}
	public void getBatmanData() {
		System.out.println("Highest Score :"+highestScore+"\nAverage Score :"+averageScore);
	}
}

class Bowler extends CricketPlayer{
	int numberOfWickets;
	
	public void setBowlerData(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	public void getBowlerData() {
		System.out.println("Number of Wickets :"+numberOfWickets);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Batman batman = new Batman();
		batman.setCricketPlayerData("Dhoni", "India");
		batman.setBatmanData(190, 120);
		System.out.println("------Batman Data--------");
		batman.getCricketPlayerData();
		batman.getBatmanData();
		System.out.println("-------------------------");
		
		Bowler bowler = new Bowler();
		bowler.setCricketPlayerData("Jadu", "India");
		bowler.setBowlerData(200);
		System.out.println("------Bowler Data--------");
		bowler.getCricketPlayerData();
		bowler.getBowlerData();
		System.out.println("-------------------------");
		

	}

}
