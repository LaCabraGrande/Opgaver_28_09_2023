//Task 1
public class Main {
	
	public static void main(String[] args) {

		Team team1 = new Team("Sparta");
		Team team2 = new Team("AK 73");
		Team team3 = new Team("KIF Atletik");
		Team team4 = new Team("FIF");
		Team team5 = new Team("Amager Atletik Club");
		
		team1.setRank(1);
		team2.setRank(2);
		team3.setRank(1);
		team4.setRank(3);
		team5.setRank(1);

		team1.setNamesOfPlayers("Ole, John, Peter");
		team2.setNamesOfPlayers("Georg, Lars, Jesper");
		team3.setNamesOfPlayers("Henrik, Pernille, Pia");
		team4.setNamesOfPlayers("Vibeke, Frederik, Louise");
		team5.setNamesOfPlayers("Steven, Erik, Tina");

		System.out.println(team1.toString());
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());

		
	}	
}