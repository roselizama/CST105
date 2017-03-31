import java.util.Scanner;

import work.NFLPlayer;

public abstract class NFLPlayer {

	private static Scanner input;
	private static double team;
	private static double touchdown;
	private static double intercep;
	private static double yards;
	public static String firstName;
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
	
	private void putThreeBeepers() 
	{
	    for (int i = 0; i < 2; i++) {
	        putBeeper();
	        move();
	    }

	    putBeeper();
	}

	private void move() {
		// TODO Auto-generated method stub
		
	}
	private void putBeeper() {
		// TODO Auto-generated method stub
		
	}
	private void backUp() 
	{
	    turnAround();
	    move();
	    turnAround();
	}
	
	private void turnAround() {
		// TODO Auto-generated method stub
		
	}

	class OffensivePlayer extends NFLPlayer

    //same for lastName, personDescription, other
    public string _firstName
	private Object _firstName1;
    {
        Object get;
		get
        {
            return _firstName;
        }
        set
        {
            _firstName = FixValue(value);
        }
    }

    private string FixValue(string value)
    {
        value = value.Trim();
        if (value == string.Empty)
        {
            return null;
        }

        return value;
    }
	
	class DefensivePlayer extends NFLPlayer
	{
		private string _firstName;
	    private string _lastName;
	    private string _personDescription;
	    private string _other;
		
	    
	    //same for lastName, personDescription, other
	    public string FirstName
	    {
	        Object get;
			get
	        {
	            return _firstName;
	        }
	        set
	        {
	            _firstName = FixValue(value);
	        }
	    }

	    private string FixValue(string value)
	    {
	        value = value.Trim();
	        if (value == string.Empty)
	        {
	            return null;
	        }

	        return value;
	    }
	}	
	

