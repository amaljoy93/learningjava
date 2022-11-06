package assignements;

public class CalculateScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Amal",500);
		System.out.println("New score is "+ newScore);
		calculateScore(255);

	}
	public static int calculateScore(String playerName, int score) {
			System.out.println("Player "+playerName+" scored "+ score + "points");
			return score*1000;
		}
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored "+ score + " points");
		return score*1000;
	}
}
