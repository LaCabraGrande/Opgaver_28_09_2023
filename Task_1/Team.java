public class Team {
	private String teamName;
	private int teamRank;
	private String nameOfPlayers;

	public Team(String teamName) {
	  this.teamName = teamName;
	}

	public void setRank(int teamRank) {
		this.teamRank = teamRank;
	}

	public void setNamesOfPlayers(String nameOfPlayers) {
		this.nameOfPlayers = nameOfPlayers;
	}

	public String toString() {
		String toString = "Team: "+this.teamName+"   Rank: "+this.teamRank+"   Players: "+nameOfPlayers;
		return toString;
	}
}