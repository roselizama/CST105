
public class Team {
	String team = "Penn State";
    String mascot = "Nittany Lions";
    Player[] playerArr = new Player[11]; //this is the main part. Array of players (11)
    int playerCount = 0;  //this will track the number of players being added to the team.

    Team(String inf_team, String inf_mascot) {
        team = inf_team;
        mascot = inf_mascot;
    }

    public Team(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
        return "Team Name: " + team + "Team Mascot: " + mascot;
    }

    //Using this method you can add the players to the Player Array.
    public void addPlayer(Player player) {
        if (playerCount < 11) {
            playerArr[playerCount] = player;
            playerCount++;
        }
  }

	public int setWinningPercentage(int randomWinningPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setRank(int i) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRank() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWinningPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Team getDraftPick(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDraftPick(Player remove) {
		// TODO Auto-generated method stub
		
	}
}