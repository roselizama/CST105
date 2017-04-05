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
