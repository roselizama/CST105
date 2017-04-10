import java.util.Scanner;

public abstract class NFLPlayer {

	private static Scanner input;
	private static double team;
	private static double touchdown;
	private static double intercep;
	private static double yards;
	private static String firstName;
	public static String lastName;
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
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		NFLPlayer.lastName = lastName;
	}
	
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		NFLPlayer.firstName = firstName;
	}

	interface Celebrator
	{
	   public void celebrate1();
	   public void celebrate2();
	   public void celebrate3();
	   public void celebrate4();
	   public void celebrate5();
	   
	}
	
	
	public class Player implements Celebrator
	{
	  public void celebrate1()
	  {
	      System.out.println("Tom Santos throws the ball up in the air when he scores to celebrate");
	  }
	  public void celebrate2()
	  {
	      System.out.println("Matt Rodgers celebrates by dancing the whip and nae nae");
	  }
	  
	  public void celebrate3()
	  {
		  System.out.println("Aaron Stamos celebrates by singing the song '2K Magic' by Bruno Mars");
		 
	  }
	  public void celebrate4()
	  {
		  System.out.println("Ben Jauregui celebrates by doing a backflip in the field");
		  		
	  }
	  public void celebrate5()
	  {
		  System.out.println("Russell Brown celebrates by running to his teammates and jump around.");
	  }
	  public void main(String arg[])
	  {
	      Celebrator obj = new Player();
	      obj. celebrate1();
	     
	      
	  }
	 
	}
	
}
	

