import java.util.Scanner;

public class NFLPlayer {

	private static Scanner input;
	private static double team;
	private static double touchdown;
	private static double intercep;
	private static double yards;
	public static void main(String[] args) {
		System.out.println("----Season 2016: Quarterbacks----");
		

		input = new Scanner(System.in);
	    	System.out.print("Enter players's name: ");
	    	input.next();
	        System.out.print("Enter team's name: ");
	        setTeam(input.nextDouble());
	        System.out.print("Enter how many touchdown: ");
	        setTouchdown(input.nextDouble());
	        System.out.print("Enter how many interceptions: ");
	        setIntercep(input.nextDouble());
	        System.out.print("Enter how many yards: ");
	        setYards(input.nextDouble());
	}
	public static double getTeam() {
		return team;
	}
	public static void setTeam(double team) {
		NFLPlayer.team = team;
	}
	public static double getTouchdown() {
		return touchdown;
	}
	public static void setTouchdown(double touchdown) {
		NFLPlayer.touchdown = touchdown;
	}
	public static double getYards() {
		return yards;
	}
	public static void setYards(double yards) {
		NFLPlayer.yards = yards;
	}
	public static double getIntercep() {
		return intercep;
	}
	public static void setIntercep(double intercep) {
		NFLPlayer.intercep = intercep;
	}
}
