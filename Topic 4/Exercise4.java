
public class Exercise4 {
	
	//Chapter 5, Exercises: 
	
	//	5.21. (Financial application: compare loans with various interest rates) Write a program
	//	that lets the user enter the loan amount and loan period in number of years
	//	and displays the monthly and total payments for each interest rate starting from
	//	5% to 8%, with an increment of 1/8. Here is a sample run:
		//	Loan Amount: 10000
		//	Number of Years: 5
		//	Interest Rate Monthly Payment Total Payment
		//	5.000% 188.71 11322.74
		//	5.125% 189.29 11357.13
		//	5.250% 189.86 11391.59
		//	...
		//	7.875% 202.17 12129.97
		//	8.000% 202.76 12165.84
	//	For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java.


	import java.util.Scanner;

	public class Exercise_21 {

	    public static void main(String[] args) {

	        double annualInterestRate = 5.00;

	        // making scanner buffer
	        Scanner input = new Scanner(System.in);

	        // getting loan amount
	        System.out.printf("Loan amount: ");
	        double loanAmount = input.nextDouble();

	        // asking number of years
	        System.out.print("Number of Years: ");
	        int numberOfYears = input.nextInt();

	        // formating title display

	        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
	        // making loop to display different interest rates
	        for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

	            // calculating monthly and total payment rates
	            double monthlyInterestRate = annualInterestRate / 1200;
	            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

	            double totalPayment = monthlyPayment * numberOfYears * 12;

	            // making % string for formatting reasons...
	            String str = "%";

	            // Displaying formatted info
	            System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));

	        }

	    }
	}
	
	
	//	5.39. (Financial application: find the sales amount) You have just started a sales job
	//	in a department store. Your pay consists of a base salary and a commission. The
	//	base salary is $5,000. The scheme shown below is used to determine the commission
	//	rate.
		//	Enter the initial deposit amount: 10000
		//	Enter annual percentage yield: 5.75
		//	Enter maturity period (number of months): 18
		//	Month CD Value
		//	1 10047.92
		//	2 10096.06
		//	...
		//	17 10846.57
		//	18 10898.54
		//	Sales Amount Commission Rate
		//	$0.01–$5,000 8 percent
		//	$5,000.01–$10,000 10 percent
		//	$10,000.01 and above 12 percent
		//	Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
	//	$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
	//	is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
	//	Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
	//	you have to generate in order to make $30,000.

	public class Exercise_39 {

	    public static void main(String[] strings) {

	        double commission;
	        double salesAmount = 0.01;
	        do
	        {
	            salesAmount += 0.01;

	            if (salesAmount >= 10000.01) {
	                commission = 900.0 + (salesAmount - 10000.0) * 0.12;
	            } else if (salesAmount >= 5000.01) {
	                commission = 400.0 + (salesAmount - 5000.0) * 0.1;
	            } else {
	                commission = salesAmount * 0.08;
	            }
	        } while (commission < 25000.0);

	        System.out.println("You need $" + (int)(salesAmount * 100.0) / 100.0 +
	                " sales amount to make a commission of $25000");
	    }

	}	
	
	
	//Chapter 7, Exercises:
		
		//7.9. (Find the smallest element) Write a method that finds the smallest element in an
		//array of double values using the following header:
		//public static double min(double[] array)
		//Write a test program that prompts the user to enter ten numbers, invokes this
		//method to return the minimum value, and displays the minimum value. Here is a
		//sample run of the program:
			//Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
			//The minimum number is: 1.5
	import java.util.Scanner;
	public class Exercise_09 {

	    static final int SIZE = 10;

	    public static void main(String[] args) {

	        double[] n = new double[SIZE];
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter " + SIZE + " numbers: ");
	        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

	        System.out.println("The minimum number is: " + min(n));
	    }

	    public static double min(double[] array) {

	        double min = array[0];
	        for (int i = 0; i < array.length; i++) {

	            if (min > array[i]) min = array[i];
	        }

	        return min;
	    }
	}	
	
		//7.35. (Game: hangman) Write a hangman game that randomly generates a word and
		//prompts the user to guess one letter at a time, as shown in the sample run. Each
		//letter in the word is displayed as an asterisk. When the user makes a correct
		//guess, the actual letter is then displayed. When the user finishes a word, display the number of misses and ask the user whether to continue to play with another
		//word. Declare an array to store words, as follows:
			// Add any words you wish in this array
			//String[] words = {"write", "that", ...};
			//(Guess) Enter a letter in word ******* > p
			//(Guess) Enter a letter in word p****** > r
			//(Guess) Enter a letter in word pr**r** > p
			//p is already in the word
			//(Guess) Enter a letter in word pr**r** > o
			//(Guess) Enter a letter in word pro*r** > g
			//(Guess) Enter a letter in word progr** > n
			//n is not in the word
			//(Guess) Enter a letter in word progr** > m
			//(Guess) Enter a letter in word progr*m > a
			//The word is program. You missed 1 time
			//Do you want to guess another word? Enter y or n>

	import java.util.Scanner;
	public class Exercise_35 {

	    static String[] words = { "programming", "words", "test", "game" };
	    static boolean isCorrect;

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        String playStats = "y";
	        while (playStats.equals("y")) {
	            String word = getWord();
	            String hiddenWord = getHiddenWord(word);
	            int missCount = 0;
	            while (!word.equals(hiddenWord)) {

	                System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
	                char ch = input.next().charAt(0);

	                if (!isAlreadyInWord(hiddenWord, ch)) {

	                    hiddenWord = getGuess(word, hiddenWord, ch);

	                    if (!isCorrect) {
	                        System.out.println(ch + " is not in the word.");
	                        missCount++;
	                    }

	                } else {
	                    System.out.println(ch + " is already in word.");
	                }




	            }
	            System.out.println("The word is program. You missed "+ missCount +  "times");
	            System.out.println("Do you want to guess another word? Enter y or n >");
	            playStats = input.next();
	        }

	    }

	    public static String getWord() {
	        return words[(int) (Math.random() * words.length)];
	    }

	    public static String getHiddenWord(String word) {

	        String hidden = "";
	        for (int i = 0; i < word.length(); i++) {
	            hidden += "*";
	        }
	        return hidden;
	    }

	    static public String getGuess(String word, String hiddenWord, char ch) {

	        isCorrect = false;
	        StringBuilder s = new StringBuilder(hiddenWord);
	        for (int i = 0; i < word.length(); i++) {

	            if (ch == word.charAt(i) && s.charAt(i) == '*') {
	                isCorrect = true;
	                s = s.deleteCharAt(i);
	                s = s.insert(i, ch);
	            }
	        }
	        return s.toString();
	    }

	    public static boolean isAlreadyInWord(String hiddenWord, char ch) {

	        for (int i = 0; i < hiddenWord.length(); i++) {

	            if (ch == hiddenWord.charAt(i)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}

		//Chapter 8, Exercise: 
	
		//8.9. (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
		//marking an available cell in a 3 * 3 grid with their respective tokens (either
		//X or O). When one player has placed three tokens in a horizontal, vertical, or
		//diagonal row on the grid, the game is over and that player has won. A draw (no
		//winner) occurs when all the cells on the grid have been filled with tokens and
		//neither player has achieved a win. Create a program for playing tic-tac-toe.
		//The program prompts two players to enter an X token and O token alternately.
		//Whenever a token is entered, the program redisplays the board on the
		//console and determines the status of the game (win, draw, or continue). Here
		//is a sample run:——————-——————
			//| | | |
		//——————-——————
		//| | | |
		//——————-——————
		//| | | |
		//——————-——————
		//Enter a row (0, 1, or 2) for player X: 1
		//Enter a column (0, 1, or 2) for player X: 1
		//——————-——————
		//| | | |
		//——————-——————
		//| | X | |
		//——————-——————
		//| | | |
		//——————-——————
		//Enter a row (0, 1, or 2) for player O: 1
		//Enter a column (0, 1, or 2) for player O: 2
		//——————-——————
		//| | | |
		//——————-——————
		//| | X | O |
		//——————-——————
		//| | | |
		//——————-——————
		//Enter a row (0, 1, or 2) for player X:
		//. . .
		//——————-——————
		//| X | | |
		//——————-——————
		//| O | X | O |
		//——————-——————
		//| | | X |
		//——————-——————
		//X player won

import java.util.Scanner;
public class Exercise_09 {

    static public boolean isPlayer1Turn = true;
    static int mRow = 0;
    static int mColumn = 0;

    public static void main(String[] args) {
        boolean keepPlaying = true;
        boolean isClear;
        Scanner input = new Scanner(System.in);
        String[][] grid = createGrid(3, 3);

        while (keepPlaying) {

            displayGrid(grid);

            do {
                mRow = askForRow();
                mColumn = askForColumn();

                isClear = isPositionClear(grid);
                if (!isClear) {
                    System.out.println("row: " + mRow + " column: " + mRow + " is already been chosen. Try again.");
                }
            } while (!isClear);

            updateTurn(grid);

            if (hasWon(grid)) {
                displayGrid(grid);
                String player = (isPlayer1Turn) ? "X" : "O";
                System.out.println("Player " + player + " has won.");
                System.out.print("Do you want to play again? y/n: ");
                String option = input.next();
                keepPlaying = (option.equalsIgnoreCase("y"));
                grid = createGrid(3, 3);
            }
            isPlayer1Turn = !isPlayer1Turn;

        }

        System.out.println("Game ended..");
        input.close();

    }

    public static int askForColumn(){
        Scanner input = new Scanner(System.in);
        int column = 0;
        boolean isColumnValid = false;
        while (!isColumnValid) {

            if (isPlayer1Turn) {
                System.out.print("Enter a column (0, 1, or 2) for player X: ");
            } else {
                System.out.print("Enter a column (0, 1, or 2) for player O: ");
            }
            column = input.nextInt();
            isColumnValid = isValidRange(column);
        }
        return column;

    }
    public static int askForRow(){
        int row = 0;
        Scanner input = new Scanner(System.in);

        boolean isRowValid = false;
        while (!isRowValid) {

            if (isPlayer1Turn) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
            } else {
                System.out.print("Enter a row (0, 1, or 2) for player O: ");
            }
            row = input.nextInt();
            isRowValid = isValidRange(row);

        }

        return row;
    }

    public static boolean isValidRange(int section) {
        return (0 <= section && section <= 2);
    }

    public static boolean isPositionClear(String[][] grid) {

        String position = grid[mRow][mColumn];

        return position.equals("|     |") || position.equals("      |");


    }
    public static void displayGrid(String[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            System.out.println("---------------------");
            for (int k = 0; k < grid[i].length; k++) {
                System.out.print(grid[i][k]);
            }
            System.out.println("");
        }
        System.out.println("---------------------");

    }

    public static String[][] createGrid(int row, int column) {

        String[][] grid = new String[row][column];

        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                if (k == 0)
                    grid[i][k] = "|     |"; // every first column
                else
                    grid[i][k] = "      |"; // every column after first
            }
        }
        return grid;
    }

    public static boolean updateTurn(String[][] grid) {

        // if grid isn't empty return false
        if (!grid[mRow][mColumn].equals("|     |") &&
            !grid[mRow][mColumn].equals("      |")) return  false;

        String update;
        if (isPlayer1Turn)
            update = (mColumn == 0) ? "|  X  |" : "  X   |";
        else
            update = (mColumn == 0) ? "|  O  |" : "  O   |";

        grid[mRow][mColumn] = update;

        return true;
    }

    public static boolean hasWon(String[][] grid) {

        int player = (isPlayer1Turn) ? 0 : 1;
        String token = (player == 0) ? "X" : "O";

        return (checkColumn(grid, token) || checkColumn(grid,token) || checkDiagonal(grid, token));
    }

    public static boolean checkColumn(String[][] grid, String s) {

        int occurence = 0;
        for (int k = 0; k < grid[0].length; k++) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][k].contains(s)) occurence++;
            }
            if (occurence == 3) return true;
            else occurence = 0;
        }

        return false;
    }

    public static boolean checkRow(String[][] grid, String s) {

        int occurrence = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[i].length; k++) {
                if (grid[i][k].contains(s)) occurrence++;
            }
            if (occurrence == 3) return true;
            else occurrence = 0;
        }

        return false;
    }

    public static boolean checkDiagonal(String[][] grid, String s) {

        // check from top left to bottom right
        int occurrence = 0;
        int x = 0;
        int y = 0;
        while (x < grid[0].length && y < grid.length) {

            if (grid[y][x].contains(s)) occurrence++;
            if (occurrence == 3) return true;
            x++;
            y++;
        }

        // Checking from bottom left to top right
        x = 0;
        y = grid.length - 1;
        while (x < grid[0].length && y >= 0) {

            if (grid[y][x].contains(s)) occurrence++;
            if (occurrence == 3) return true;
            y--;
            x++;
        }


        return false;
    }

}

	

		//Chapter 10, Exercises: 
	
		//10.1. (The Time class) Design a class named Time. The class contains:
		//■ The data fields hour, minute, and second that represent a time.
		//■ A no-arg constructor that creates a Time object for the current time. (The
		//values of the data fields will represent the current time.)
		//■ A constructor that constructs a Time object with a specified elapsed time
		//since midnight, January 1, 1970, in milliseconds. (The values of the data
		//fields will represent this time.)
		//■ A constructor that constructs a Time object with the specified hour, minute,
		//and second.
		//■ Three getter methods for the data fields hour, minute, and second,
		//respectively.
		//■ A method named setTime(long elapseTime) that sets a new time
		//for the object using the elapsed time. For example, if the elapsed time is
		//555550000 milliseconds, the hour is 10, the minute is 19, and the second is
		//10.
		//Draw the UML diagram for the class and then implement the class. Write
		//a test program that creates two Time objects (using new Time() and new
		//Time(555550000)) and displays their hour, minute, and second in the format
		//hour:minute:second.
		//(Hint: The first two constructors will extract the hour, minute, and second
		//from the elapsed time. For the no-arg constructor, the current time can be
		//obtained using System.currentTimeMillis(), as shown in Listing 2.7,
		//ShowCurrentTime.java.)
import ToolKit.Time;
public class Exercise_01 {

    public static void main(String[] args) {


        Time time = new Time(555550000);
        System.out.println(time.hour + ":" + time.minute + ":" + time.second);

    }


}


	
		//10.2. (The BMI class) Add the following new constructor in the BMI class:
		///** Construct a BMI with the specified name, age, weight,
		//* feet, and inches
		//*/
		//public BMI(String name, int age, double weight, double feet,
		//double inches)
import ToolKit.Time;
public class Exercise_02 {

    public static void main(String[] args) {

        BMI p = new BMI("Luiz", 22, 175, 5, 7);
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
                p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
    }


}
	
		//10.7. (Game: ATM machine) Use the Account class created in Programming Exercise
		//9.7 to simulate an ATM machine. Create ten accounts in an array with id
		//0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
		//id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
		//is accepted, the main menu is displayed as shown in the sample run. You can
		//enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
		//depositing money, and 4 for exiting the main menu. Once you exit, the system
		//will prompt for an id again. Thus, once the system starts, it will not stop.
			//Enter an id: 4
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 1
			//The balance is 100.0
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 2
			//Enter an amount to withdraw: 3
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 1
			//The balance is 97.0
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 3
			//Enter an amount to deposit: 10
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 1
			//The balance is 107.0
			//Main menu
			//1: check balance
			//2: withdraw
			//3: deposit
			//4: exit
			//Enter a choice: 4
			//Enter an id:
import ToolKit.Account;

import java.util.Scanner;
public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        int option = 0;
        int id = askForID(accounts);
        while (option != 4) {
            Account user = getAccount(accounts, id);
            System.out.print(
                    "Main menu\n" +
                            "1: check balance\n" +
                            "2: withdraw\n" +
                            "3: deposit\n" +
                            "4: exit\n" +
                            "Enter a choice: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("The balance is $" + user.getBalance() + ".\n");
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    user.withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    user.deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Logged out...");
                    System.out.println("");
                    id = askForID(accounts);
                    option = 0;
                    break;
                    default:
                        System.out.println("Invalid input.. Enter a number 1-4");
            }

        }

    }

    public static int askForID(Account[] accounts) {

        Scanner input = new Scanner(System.in);

        int id = 0;
        boolean isValidID = false;

        while (!isValidID) {
            System.out.print("Enter an ID: ");
            id = input.nextInt();

            if (!hasID(accounts, id)) {
                System.out.println("INVALID ID: Try again.");

            } else {
                isValidID = true;
            }
        }

        return id;
    }

    public static Account getAccount(Account[] accounts, int id) {

        for (Account account : accounts) {
            if (id == account.getId()) {
                return account;
            }
        }
        return null;
    }
    public static boolean hasID(Account[] accounts, int id) {

        for (Account account : accounts) {
            if (id == account.getId()) {
                return true;
            }
        }

        return false;
    }


}

	
	
		//10.8. (Financial: the Tax class) Programming Exercise 8.12 writes a program for
		//computing taxes using arrays. Design a class named Tax to contain the following
		//instance data fields:
		//■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—
		//married filing jointly or qualifying widow(er), 2—married filing separately,
		//and 3—head of household. Use the public static constants SINGLE_FILER
		//(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
		//SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
		//■ int[][] brackets: Stores the tax brackets for each filing status.
		//■ double[] rates: Stores the tax rates for each bracket.
		//■ double taxableIncome: Stores the taxable income.
		//Provide the getter and setter methods for each data field and the getTax()
		//method that returns the tax. Also provide a no-arg constructor and the constructor
		//Tax(filingStatus, brackets, rates, taxableIncome).
		//Draw the UML diagram for the class and then implement the class. Write a test
		//program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
		//income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
		//The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
		//are shown in Table 10.1.
import ToolKit.Tax;
public class Exercise_08 {

    public static void main(String[] args){

        int[][] brackets = new int[][] {
        // stat 0 single
        {8350,33950, 82250, 171550, 372950},
        // stat 1 Married Filing Jointly
        {16700, 67900, 137050, 208850, 372950},
        // stat 2 Married Filing Separately
        {8350, 33950, 68525, 104425, 186475},
        // stat 3 Head of Household
        {11950, 45500, 117450, 190200, 372950}};

        double[] rates = new double[] { 0.10, 0.15,0.25,0.28,0.33,0.35 };

        String s1 = "Taxable Income";
        String s2 = "Single";
        String s3 = "Married Joint";
        String s4 = "Married Separate";
        String s5 = "Head of house";

        System.out.printf("%-20s%-12s%-4s%21s%16s\n", s1, s2, s3, s4, s5);
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", i,
                    new Tax(Tax.SINGLE_FILER,brackets,rates,i).getTax(),
                    new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW,brackets,rates,i).getTax(),
                    new Tax(Tax.MARRIED_SEPARATELY,brackets,rates,i).getTax(),
                    new Tax(Tax.HEAD_OF_HOUSEHOLD,brackets,rates,i).getTax()
            );


        }
    }
}
	
	
		//10.9. (The Course class) Revise the Course class as follows:
		//■ The array size is fixed in Listing 10.6. Improve it to automatically increase
		//the array size by creating a new larger array and copying the contents of the
		//current array to it.
		//■ Implement the dropStudent method.
		//■ Add a new method named clear() that removes all students from the
		//course.
		//Write a test program that creates a course, adds three students, removes one,
		//and displays the students in the course.

import ToolKit.Tax;
public class Exercise_09 {

    public static void main(String[] args) {

        Course course = new Course("Intro to Java :)");

        // adding 20 students
        for (int i = 0; i < 20; i++) {
            course.addStudent("Student " + (i + 1));
        }

        // Displaying course name and student taking the course.
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", students[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("\nDropping two students from course..");
        System.out.println("Student #1 dropped.");
        course.dropStudent("Student " + (1));
        System.out.println("Student #8 dropped.");
        course.dropStudent("Student " + (8));

        System.out.println("Displaying students...\n");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s ", students[i]);

            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());

    }
}


	
		//10.22. (Implement the String class) The String class is provided in the Java library.
		//Provide your own implementation for the following methods (name the new
		//class MyString1):
		//public MyString1(char[] chars);
		//public char charAt(int index);
		//public int length();
		//public MyString1 substring(int begin, int end);
		//public MyString1 toLowerCase();
		//public boolean equals(MyString1 s);
		//public static MyString1 valueOf(int i);
import ToolKit.MyString1;
public class Exercise_22 {

    public static void main(String[] args) {
        // MyString1
        MyString1 num = MyString1.valueOf(987654321L);
        System.out.println(num.toChars());
        MyString1 s = new MyString1("Test123");
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.equals(new MyString1("Test123")));
        System.out.print(MyString1.valueOf(345).toChars());
    }
}

}

