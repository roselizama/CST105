import java.util.Scanner;

public class NFLPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScan = new Scanner (System.in);
		
		quarterback TomBrady = new quarterback();
		
		System.out.println("----Season 2016: Quarterbacks----");

		
		System.out.println("Tom Brady");
		System.out.println("New England Patriots");
		System.out.println("Touchdown: 28");
		System.out.println("Interceptions: 2");
		System.out.println("Yards: 3,554");

		
		System.out.println("------------------------");
		
		quarterback MattRyan = new quarterback();
		System.out.println("Matt Ryan");
		System.out.println("Atlanta Falcons");
		System.out.println("Touchdown: 38");
		System.out.println("Interceptions: 7");
		System.out.println("Yards: 4,944");

		
		System.out.println("------------------------");
		
		quarterback AaronRodgers = new quarterback();
		System.out.println("Aaron Rodgers");
		System.out.println("Green Bay Packers");
		System.out.println("Touchdown: 40");
		System.out.println("Interceptions: 7");
		System.out.println("Yards: 4,428");




	}

}
