
public class Player {

	  // ---------Declaring attributes----
    String firstName;
    String lastName;
    String position;
    String State;
    String Highschool;

    Player(String inf_firstName, String inf_lastName, String inf_position, String inf_State, String inf_Highschool) {
        firstName = inf_firstName;
        lastName = inf_lastName;
        position = inf_position;
        State = inf_State;
        Highschool = inf_Highschool;
    }

    public Player(String playerName, int randomRound) {
		// TODO Auto-generated constructor stub
	}

	String getInfo() {
        return "Name: " + firstName + " " + lastName + ", " + "position: " + position + ", State: " + State
                + ", High School: " + Highschool;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRound() {
		// TODO Auto-generated method stub
		return 0;
	}

}