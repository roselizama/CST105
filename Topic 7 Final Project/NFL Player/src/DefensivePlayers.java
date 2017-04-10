import java.util.*;
public class DefensivePlayers {
	

	    // Variables

	    // Static Array of 8 teams
	    public static Team[] teams = new Team[8];

	    // ArrayList that will hold 32 players
	    public static List<Player> players = new ArrayList<Player>();

	    // Static Array of 8 team names
	    public static String[] teamNames = {"Dallas Cowboys", "New England Patriots",
	        "Seattle Seahawks", "Oakland Raiders", "Greenbay Packers",
	        "Pittsburgh Steelers", "San Francisco 49ers", "Denver Broncos"}; 

	    // Static Array of 32 player names
	    public static String[] playerNames = {"J.J. Watt", "Aaron Rodgers", 
	        "Tom Brady", "DeMarco Murray", "Peyton Manning", "Calvin Johnson",
	        "Andrew Luck", "Antonio Brown", "Marshawn Lynch", "Rob Gronkowski",
	        "Richard Sherman", "Jamaal Charles", "Julio Jones", "Luke Kuechly", 
	        "Dez Bryant", "Le'Veon Bell", "Darrelle Revis", "Jordy Nelson",
	        "Patrick Peterson", "Demaryius Thomas", "Earl Thomas", 
	        "Russell Wilson", "Joe Haden", "Joe Thomas", "Justin Houston",
	        "Gerald McCoy", "LeSean McCoy", "Drew Brees", "Jimmy Graham", 
	        "Von Miller", "Tony Romo", "Tyron Smith"};

	    // Methods

	    // Main method
	    public static void main(String[] args) {
	        // Create Array of 8 teams, each with a name
	        createTeams();

	        // Assign a winning % to each team randomly and rank accordingly
	        rankTeams();

	        // Populate ArrayList players and give each Player a random round #
	        rankPlayers();
			
	        // Run the draft
	        draftPick();
	    }
		
	    // Generates a random number between 1 and upperLimit
	    public static int generateRandomNumber(int upperLimit) {
	        Random randomGenerator = new Random();
	        int randomInt = randomGenerator.nextInt(upperLimit) + 1;
			
	        return randomInt;
	    }

	    // Creates an Array of 8 Team Objects and gives them each a name
	    public static int createTeams() {
	        // Populate Team[] teams with Team Objects using teamNames Array
	        for (int i = 0; i < teams.length; i++) {
	            teams[i] = new Team(teamNames[i]);
	        }

	        return 0;
	    }

	    // Ranks teams by random winning percentage and prints a table
	    public static int rankTeams() {
	        // Give each team a random winning percentage
	        for (int i = 0; i < teams.length; i++) {
	            // Generate random winning percentage
	            int randomWinningPercentage = generateRandomNumber(100);

	            // Set winning percentage using random value prev. generated
	            int winningPercentage = 
	                teams[i].setWinningPercentage(randomWinningPercentage);
	        }


	        // Sort teams by winning percentage
	        Arrays.sort(teams);

	        // Assign rank according to ascending winning percentage
	        for (int i = 0; i < teams.length; i++) {
	            teams[i].setRank(i + 1);
	        }

	        // Two-dimensional Array for printing table of teams and their ranks
	        final Object[][] rankTable = new String[8][3];

	        // Populate two-dimensional rankTable
	        for (int i = 0; i < teams.length; i++) {
	            rankTable[i] = new String[] {teams[i].getName(), 
	                Integer.toString(teams[i].getRank()),
	                Integer.toString(teams[i].getWinningPercentage())};
	        }

	        // Print informational message
	        System.out.println("\nWelcome to the NFL Draft Pick!\n");
	        System.out.println("Here are the statistics, including " +
	            "each team's winning percentage from last season" +
	            " and the corresponding draft rank:\n");

	        // Format and print rankTable after printing table labels
	        System.out.format("%-25s%-5s%-9s\n\n", "TEAM", "RANK", "WINNING %");
	        for (final Object[] row : rankTable) {
	            System.out.format("%-25s%-5s%-9s\n", row);
	        }

	        // Print two new lines to separate from next section
	        System.out.println("\n");

	        return 0;
	    }

	    // Instantiates ArrayList players and gives each Player a random round #
	    public static <T> int rankPlayers() {
			// Round # counters to ensure exactly 8 players assigned per round
			List<Integer> roundNumbers = new ArrayList<Integer>();
			
			// Random round #
			int randomRound = 0;
		
			// Populate roundNumbers with round numbers 1-4 
			for (int i = 0; i < 8; i++) {
				roundNumbers.add(1);
				roundNumbers.add(2);
				roundNumbers.add(3);
				roundNumbers.add(4);
			}
			
	        // Add each player name to ArrayList players as a new Player Object
	        for (String playerName : playerNames) {
				// Get random round number from ArrayList roundNumbers by removing it
				if (roundNumbers.size() > 1) {
					randomRound = roundNumbers.remove(generateRandomNumber(roundNumbers.size()-1));
				}
				else {
					randomRound = roundNumbers.remove(0);
				}
				
				// Instantiate each Player Object with a random number 1-4
				players.add(new Player(playerName, randomRound));
			}

			// Sort players by round number in ascending order
			Collections.DefensivePlayers(List<T> players);
			
	        // Two-dimensional Array for printing table of players and their rounds
	        final Object[][] playersTable = new String[32][2];

	        // Populate two-dimensional playersTable
	        for (int i = 0; i < players.size(); i++) {
	            playersTable[i] = new String[] {players.get(i).getName(), 
	                Integer.toString(players.get(i).getRound())};
	        }

	        // Print informational message regard players and their rounds
	        System.out.println("Here are the players' randomly selected draft" +
	            " rounds:\n");

	        // Format and print rankPlayers after printing table labels
	        System.out.format("%-20s%-5s\n\n", "PLAYER", "ROUND");
			int i = 0;
	        for (final Object[] row : playersTable) {
				if (i > 0 && i % 8 == 0) {
					System.out.println("");
				}
	            System.out.format("%-20s%-5s\n", row);
				i++;
	        }
	        
	        // Print two new lines to separate from next section
	        System.out.println("\n");

	        return 0;
	    }
		
		// Draft pick method, each team chooses a total of 4 players
		public static int draftPick() {
			// Each team removes 1 player from ArrayList players per round
			for (int round = 1; round <= 4; round++) {
				for (int index = 7; index >= 0; index--) {
					if (index == 0) {
						teams[index].addDraftPick(players.remove(index));
					} 
					else {
						int randomIndex = generateRandomNumber(index);
						teams[index].addDraftPick(players.remove(randomIndex));					
					}
				}
			}
			
	        // Print informational message
	        System.out.println("Here are the draft results:\n");

	        // Format and print draftTable after printing table labels
	        System.out.format("%-25s%-20s%-5s\n\n", "TEAM", "PLAYER", "ROUND");
	        
			// Print table of results
			for (int i = 0; i < 4; i++) {
				for (Team team : teams) {
					System.out.format("%-25s%-20s%-5s\n", team.getName(), 
						team.getDraftPick(i).getName(), i+1);
				}
				
				System.out.println("");
			}
			
	        // Print a new line to separate from next section
	        System.out.println("");		
			
			return 0;
		}
	}
}
