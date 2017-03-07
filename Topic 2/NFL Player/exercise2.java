//Chapter 3, Exercises: 
//3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
//two integers and prompts the user to enter the sum of these two integers.
//Revise the program to generate three single-digit integers and prompt the user to
//enter the sum of these three integers.
import java.util.Scanner;
 
public class Ex3_2 {
 public static void main(String[] args) {
  int number1 = (int) (System.currentTimeMillis() % 10);
  int number2 = (int) (System.currentTimeMillis() * 9 % 10);
  int number3 = (int) (System.currentTimeMillis() * 15 % 10);
  // Create a Scanner
  Scanner input = new Scanner(System.in);
 
  System.out.print("What is " + number1 + " + " + number2 + " + "
    + number3 + "? ");
 
  int answer = input.nextInt();
 
  System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer
    + " is " + (number1 + number2 + number3 == answer));
 }
}

//3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
//Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
//the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
//that “The equation has no solution.”
//Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
//x is -2.0 and y is 3.0
//Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
//The equation has no solution
import java.util.Scanner;

public class Exer03_03{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("9.0, 4.0, 3.0, -5.0, -6.0, -21.0");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is -2.0.1f and y is 3.0.1f", x, y);
        }

    }
}

//3.4 (Random month) Write a program that randomly generates an integer between 1
//and 12 and displays the English month name January, February, …, December for
//the number 1, 2, …, 12, accordingly.
public class Exer03_04 {
	public static void main(String[] args) {
		// Generate an integer between 1 and 12.
		int month = (int)((Math.random() * 12) + 1);

		// Display the English month name
		switch (month)
		{
			case 1: System.out.println("January"); break;
			case 2: System.out.println("February"); break;
			case 3: System.out.println("March"); break;
			case 4: System.out.println("April"); break;
			case 5: System.out.println("May"); break;
			case 6: System.out.println("June"); break;
			case 7: System.out.println("July"); break;
			case 8: System.out.println("August"); break;
			case 9: System.out.println("September"); break;
			case 10: System.out.println("October"); break;
			case 11: System.out.println("November"); break;
			case 12: System.out.println("December");
		}
	}
}

//3.5 (Find future dates) Write a program that prompts the user to enter an integer for
//today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
//prompt the user to enter the number of days after today for a future day and display
//the future day of the week. Here is a sample run:
//Enter today's day: 1
//Enter the number of days elapsed since today: 3
//Today is Monday and the future day is Thursday
//Enter today's day: 0
//Enter the number of days elapsed since today: 31
//Today is Sunday and the future day is Wednesday
System.out.println("Today's day is 1 (0 for Sunday, 1 for Monday...) :");
    int todayNo = in.nextInt();

    System.out.println("3 days elapsed since today:");
    int elapsedDay = in.nextInt();

    int futureDay = (todayNo + elapsedDay) % 7;

    switch (todayNo) {
        case 0:
            System.out.print("Today is Sunday and");
            break;
        case 1:
            System.out.print("Today is Monday and");
            break;
        case 2:
            System.out.print("Today is Tuesday and");
            break;
        case 3:
            System.out.print("Today is Wednesday and");
            break;
        case 4:
            System.out.print("Today is Thursday and");
            break;
        case 5:
            System.out.print("Today is Friday and");
            break;
        case 6:
            System.out.print("Today is Saturday and");
            break;

    }

    switch (futureDay) {
        case 0:
            System.out.print(" the future day is Sunday.");
            break;
        case 1:
            System.out.print(" the future day is Monday.");
            break;
        case 2:
            System.out.print(" the future day is Tuesday.");
            break;
        case 3:
            System.out.print(" the future day is Wednesday.");
            break;
        case 4:
            System.out.print(" the future day is Thursday.");
            break;
        case 5:
            System.out.print(" the future day is Friday.");
            break;
        case 6:
            System.out.print(" the future day is Saturday.");
            break;

    }

//3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit
//integer and determines whether it is a palindrome number. A number is palindrome
//if it reads the same from right to left and from left to right. Here is a sample
//run of this program:Enter a three-digit integer: 121
//121 is a palindrome
//Enter a three-digit integer: 123
//123 is not a palindrome
import java.util.Scanner;

public class Exercise_03_12{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("123");
        int user_input = in.nextInt();

        int temp_remaning = 0;

        int d1 = user_input % 10;
        temp_remaning = user_input / 10;
        int d2 = temp_remaning % 10;
        int d3 = temp_remaning / 10;

        String rev = Integer.toString(d3) + Integer.toString(d2) + Integer.toString(d1);
        String original = Integer.toString(user_input);
        

        if(rev.equals(original)){
            System.out.println(original + " is a palindrone");
        }else{
            System.out.println(original + " is not a palindrone");
System.out.print("121");
        int user_input = in.nextInt();

        int temp_remaning = 0;

        int d1 = user_input % 10;
        temp_remaning = user_input / 10;
        int d2 = temp_remaning % 10;
        int d3 = temp_remaning / 10;

        String rev = Integer.toString(d3) + Integer.toString(d2) + Integer.toString(d1);
        String original = Integer.toString(user_input);
        

        if(rev.equals(original)){
            System.out.println(original + " is a palindrone");
        }else{
            System.out.println(original + " is not a palindrone");


        }
    }
}

3.13 (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the
source code to compute taxes for single filers. Complete Listing 3.5 to compute
the taxes for all filing statuses.
import java.util.Scanner;
 
public class ProgrammingEx3_13 {
 public static void main(String[] args) {
  // Create a Scanner
  Scanner input = new Scanner(System.in);
 
  // Prompt the user to enter filing status
  System.out
    .print("(0-single filer, 1-married jointly or qualifying widow(er), "
      + "\n2-married separately, 3-head of household)\n"
      + "Enter the filing status: ");
  int status = input.nextInt();
 
  // Prompt the user to enter taxable income
  System.out.print("Enter the taxable income: ");
  double income = input.nextDouble();
 
  // Compute tax
  double tax = 0;
 
  if (status == 0) { // Compute tax for single filers
   if (income <= 8350)
    tax = income * 0.10;
   else if (income <= 33950)
    tax = 8350 * 0.10 + (income - 8350) * 0.15;
   else if (income <= 82250)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950)
      * 0.25;
   else if (income <= 171550)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
      * 0.25 + (income - 82250) * 0.28;
   else if (income <= 372950)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
      * 0.25 + (171550 - 82250) * 0.28 + (income - 171550)
      * 0.33;
   else
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
      * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550)
      * 0.33 + (income - 372950) * 0.35;
  } else if (status == 1) { // Compute tax for married file jointly
   if (income <= 16700)
    tax = income * 0.10;
   else if (income <= 67900)
    tax = 16700 * 0.10 + (income - 16700) * 0.15;
   else if (income <= 137050)
    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900)
      * 0.25;
   else if (income <= 208850)
    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
      * 0.25 + (income - 137050) * 0.28;
   else if (income <= 372950)
    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
      * 0.25 + (208850 - 137050) * 0.28 + (income - 208850)
      * 0.33;
   else
    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
      * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850)
      * 0.33 + (income - 372950) * 0.35;
  } else if (status == 2) { // Compute tax for married separately
   if (income <= 8350)
    tax = income * 0.10;
   else if (income <= 33950)
    tax = 8350 * 0.10 + (income - 8350) * 0.15;
   else if (income <= 68525)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950)
      * 0.25;
   else if (income <= 104425)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
      * 0.25 + (income - 68525) * 0.28;
   else if (income <= 186475)
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
      * 0.25 + (104425 - 68525) * 0.28 + (income - 104425)
      * 0.33;
   else
    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
      * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425)
      * 0.33 + (income - 186475) * 0.35;
  } else if (status == 3) { // Compute tax for head of household
   if (income <= 11950)
    tax = income * 0.10;
   else if (income <= 45500)
    tax = 11950 * 0.10 + (income - 11950) * 0.15;
   else if (income <= 117450)
    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500)
      * 0.25;
   else if (income <= 190200)
    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
      * 0.25 + (income - 117450) * 0.28;
   else if (income <= 372950)
    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
      * 0.25 + (190200 - 117450) * 0.28 + (income - 190200)
      * 0.33;
   else
    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
      * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200)
      * 0.33 + (income - 372950) * 0.35;
  } else {
   System.out.println("Error: invalid status");
   System.exit(1);
  }
 
  // Display the result
  System.out.println("Tax is " + (int) (tax * 100) / 100.0);
 }
}
3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws. Here are sample runs:scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
import java.util.Scanner;

public class Exercise_03_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computer = (int)(Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
		}

		// Display result
		if (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || 
							  (user == 2 && computer == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}
}
3.18 (Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in
pounds).
c(w) = d
3.5, if 0 < w < = 1
5.5, if 1 < w < = 3
8.5, if 3 < w < = 10
10.5, if 10 < w < = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   double weight;
  
   System.out.print("Enter the weight of the package:");
   weight = s.nextDouble();
  
   if(weight <= 0) {
 System.out.print("You did not enter a valid weight.");
   } else {
 if(weight <= 1) {
  System.out.print("Your shipping cost is $3.5.");
 } else if(weight <= 3) {
  System.out.print("Your shipping cost is $5.5.");
 } else if(weight <= 10) {
  System.out.print("Your shipping cost is $8.5.");
 } else if(weight <= 20) {
  System.out.print("Your shipping cost is $10.5.");
 } else {
  System.out.print("The package cannot be shipped.");
 }
   }
}

3.26 (Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 int number;
  
 System.out.print("Integer is 10");
 number = s.nextInt();
  
 System.out.print("Is " + number + " divisible by 5 and 6?");
 if((number % 5 == 0) && (number % 6 == 0)) {
  System.out.println(" true");
 } else {
  System.out.println(" false");
 }
  
 System.out.print("Is " + number + " divisible by 5 or 6?");
 if((number % 5 == 0) || (number % 6 == 0)) {
  System.out.println(" true");
 } else {
  System.out.println(" false");
 }
  
 System.out.print("Is " + number + " divisible by 5 or 6, but not both?");
        // XOR operator for the third condition
 if((number % 5 == 0) ^ (number % 6 == 0)) {
  System.out.println(" true");
 } else {
  System.out.println(" false");
 }
}

3.29 (Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
program to cover all cases.)
Here are the sample runs:Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1
Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
circle2 overlaps circle1
Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
circle2 does not overlap circle1
public class Exer03_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 	
		System.out.print("Enter circle1's center x-0.5, y-coordinates is 5.1, and radius:13 ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double r1 = input.nextDouble();
		System.out.print("Enter circle2's center x-1, y-coordinates is 1.7, and radius:4.5 ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double r2 = input.nextDouble(); 

		if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) 
			<= Math.abs(r1 - r2))
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)
					<= r1 + r2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}

3.33(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price. Here is a sample run:Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.
Enter weight and price for package 1: 50 25
Enter weight and price for package 2: 25 12.5
Two packages have the same price.
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 double weight1, price1, weight2, price2;
 double ratio1, ratio2;
  
 System.out.print("weight1 is 50 and price for package 1: 24.59");
 weight1 = s.nextDouble();
 price1 = s.nextDouble();
 ratio1 = weight1/price1;
  
 System.out.print("weight2 is 25 and price for package 2: 11.99");
 weight2 = s.nextDouble();
 price2 = s.nextDouble();
 ratio2 = weight2/price2;
  
 if(ratio1 < ratio2) {
  System.out.print("Package 1 has better price.");
 } else if(ratio1 == ratio2) {
  System.out.print("Two packages have the same price.");
 } else {
  System.out.print("Package 2 has better price.");
 }
}

Chapter 9, Exercises: 
9.2 (The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■ A string data field named symbol for the stock’s symbol.
■ A string data field named name for the stock’s name.
■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■ A double data field named currentPrice that stores the stock price for the
current time.
■ A constructor that creates a stock with the specified symbol and name.
■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates a Stock object with the stock symbol ORCL, the name
Oracle Corporation, and the previous closing price of 34.5. Set a new current
price to 34.35 and display the price-change percentage.
public class Exer09_02 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());

    }

9.6 (Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.
public class Exer09_06 {
	/** Main method */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		int[] randomArray = getArray();
		stopWatch.start();

		selectionSort(randomArray);
		stopWatch.stop();
		System.out.println("The execution time of sorting 100,000 " +
			"numbers using selection sort: " + stopWatch.getElapsedTime() +
			" milliseconds");
	}
	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	} 
}

9.7 (The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current
interest rate (default 0). Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the
account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the
account.
■ A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122,
a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print
the balance, the monthly interest, and the date when this account was created.
public class Exer09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}

9.10(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
■ Private data fields a, b, and c that represent three coefficients.
■ A constructor for the arguments for a, b, and c.
■ Three getter methods for a, b, and c.
■ A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
■ The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 =
-b + 2b2 - 4ac
2a
and r2 =
-b - 2b2 - 4ac
2a
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.” See Programming Exercise 3.1 for sample runs.
public class Exer09_10 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

		System.out.print("The equation has ");
		if (quadraticEquation.getDiscriminant() < 0)
			System.out.println("no real roots");
		else if (quadraticEquation.getDiscriminant() > 0) {
			System.out.println("two roots " + quadraticEquation.getRoot1() + 
				" and " + quadraticEquation.getRoot2());
		}
		else {
			System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ? 
				quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
		}
	}
}

9.13 (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:
Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is 45 at (1, 2)
public class Exer09_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Rows = 3 and column=4 ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];

        System.out.println("23.5 35 2 10
	4.5 3 45 3.5
	35 44 5.5 9.6
	:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(m);

        System.out.println("The location of the largest element is 45"
                + location.maxValue + " at (" + location.row + ", " + location.column + ")");
    }

}