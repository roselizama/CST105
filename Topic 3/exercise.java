//Chapter 4: 
//4.2. (Geometry: great circle distance) The great circle distance is the distance between
//two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
//latitude and longitude of two points. The great circle distance between the two
//points can be computed using the following formula:
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//Write a program that prompts the user to enter the latitude and longitude of two
//points on the earth in degrees and displays its great circle distance. The average
//earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
//using the Math.toRadians method since the Java trigonometric methods use
//radians. The latitude and longitude degrees in the formula are for north and west.
//Use negative to indicate south and east degrees. Here is a sample run:
//Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
//Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
//The distance between the two points is 10691.79183231593 km
package work;

import java.util.Scanner;

public class work {
	    public static void main (String[] args){
	        Scanner in = new Scanner(System.in);

	        System.out.print("Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25");
	        double point_1_latitude = in.nextDouble();
	        double point_1_longitude = in.nextDouble();
	        System.out.print("Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37");
	        double point_2_latitude = in.nextDouble();
	        double point_2_longitude = in.nextDouble();

	        double d = 6371.01 * Math.acos((
	            Math.sin(Math.toRadians(point_1_latitude)) *
	            Math.sin(Math.toRadians(point_1_longitude))) +
	            (Math.cos(Math.toRadians(point_1_latitude)) * 
	            Math.cos(Math.toRadians(point_1_longitude)) * 
	            Math.cos(Math.toRadians(point_2_longitude) - Math.toRadians(point_2_latitude))));
	    
	        System.out.printf("The distance between the two points is 10691.79183231593 km", d);    
	    }
	    
	}

//4.11. (Decimal to hex) Write a program that prompts the user to enter an integer between
//0 and 15 and displays its corresponding hex number. Here are some sample runs:
//Enter a decimal value (0 to 15): 11
//The hex value is B
//Enter a decimal value (0 to 15): 5
//The hex value is 5
//Enter a decimal value (0 to 15): 31
//31 is an invalid input
import java.util.Scanner;

public class work { 
	 private static Scanner input;

	public static void main(String[] args) {
	  System.out.print("Enter a decimal value (0 to 15): 11 ");
	  input = new Scanner(System.in);
	  int i = input.nextInt();
	 
	  if (i < 0 || i > 15) {
	   System.out.println(i + "31 is an invalid input");
	   System.exit(0);
	  }
	 
	  System.out.println("The hex value is B "
	    + Integer.toHexString(i).toUpperCase());
	 
		  System.out.print("Enter a decimal value (0 to 15): 5 ");
		  input = new Scanner(System.in);
		  int i1 = input.nextInt();
		 
		  if (i1 < 0 || i1 > 15) {
		   System.out.println(i1 + "31 is an invalid input");
		   System.exit(0);
		  }
		 
		  System.out.println("The hex value is 5 "
		    + Integer.toHexString(i1).toUpperCase());
	 }
	 
	}


//4.23. (Financial application: payroll) Write a program that reads the following information
//and prints a payroll statement:
//Employee’s name (e.g., Smith)
//Number of hours worked in a week (e.g., 10)
//Hourly pay rate (e.g., 9.75)
//Federal tax withholding rate (e.g., 20%)
//State tax withholding rate (e.g., 9%)
//A sample run is shown below:
//	Enter employee's name: Smith
//Enter number of hours worked in a week: 10
//Enter hourly pay rate: 9.75
//Enter federal tax withholding rate: 0.20
//Enter state tax withholding rate: 0.09
//Employee Name: Smith
//Hours Worked: 10.0
//Pay Rate: $9.75
//Gross Pay: $97.5
//Deductions:
//Federal Withholding (20.0%): $19.5
//State Withholding (9.0%): $8.77
//Total Deduction: $28.27
//Net Pay: $69.22

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: Smith ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: 10");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: 9.75");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: 0.20");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: 0.09");
        double stateTax = input.nextDouble();

        // calculating grosspay
        double grossPay = hours * hourlyRate;
        // calulating fed tax
        double fedTaxWithholding = grossPay * fedTax;
        // calculating state tax
        double stateTaxWithholding = grossPay * stateTax;
        // calculating reduction
        double totalDeduction = fedTaxWithholding + stateTaxWithholding;
        // calculating net pay
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: Smith" + name +
                "\nPay Rate: " + formatCurrency(hourlyRate) +
                "\nHours Worked: " + hours +
                "\nGross Pay: " + formatCurrency(grossPay) +
                "\nDeductions:" +
                "\n  Federal Withholding ("+ formatPercent(fedTax)+"): " + formatCurrency(fedTaxWithholding) +
                "\n  State Withholding ("+ formatPercent(stateTax)+"): " + formatCurrency(stateTaxWithholding) +
                "\n  Total Deduction: " + formatCurrency(totalDeduction) +
                "\nNet Pay: " + formatCurrency(netPay));
    }

    public static String formatCurrency(double money) {


        return  DecimalFormat.getCurrencyInstance().format(money);
    }
    public static String formatPercent(double percent) {


        return  DecimalFormat.getPercentInstance().format(percent);
    }
}

//Chapter 6, Exercises: 
//6.3. Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
//public static int reverse(int number)
// Return true if number is a palindrome
//public static boolean isPalindrome(int number)
//Use the reverse method to implement isPalindrome. A number is a palindrome
//if its reversal is the same as itself. Write a test program that prompts the
//user to enter an integer and reports whether the integer is a palindrome.
import java.util.Scanner;

public class Exercise_06_03 {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	public static int reverse(int number) {
		String reverse = ""; 	// Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
	}
}

//6.5. (Sort three numbers) Write a method with the following header to display three
//numbers in increasing order:
//public static void displaySortedNumbers(
//double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers and invokes the
//method to display them in increasing order.
//port java.util.Scanner;

public class Exercise {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner

		// Prompt the user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		// Display numbers in increasing order
		displaySortedNumbers(number1, number2, number3);
	}

	/** displaySortedNumbers Method displays three numbers in increasing order */
	public static void displaySortedNumbers(
		double num1, double num2, double num3) {
		double temp; // Hold number to swap
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		// Display result
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}

//6.7. (Financial application: compute the future investment value) Write a method that
//computes future investment value at a given interest rate for a specified number
//of years. The future investment is determined using the formula in Programming
//Exercise 2.21.
//Use the following method header:
//public static double futureInvestmentValue(
//double investmentAmount, double monthlyInterestRate, int years)
//For example, futureInvestmentValue(10000, 0.05/12, 5) returns
//12833.59.
//Write a test program that prompts the user to enter the investment amount (e.g.,
//1000) and the interest rate (e.g., 9%) and prints a table that displays future value
//for the years from 1 to 30, as shown below:
//The amount invested: 1000
//Annual interest rate: 9
//Years Future Value
//1 1093.80
//2 1196.41
//...
//29 13467.25
//30 14730.57
import java.util.Scanner;
public class Exercise06_07 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: 1000");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        System.out.printf("%3s%20s\n", "Years", "Future Value");
        for (int i = 1; i <= years; i++) {

            System.out.printf("%-4d%20.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));


        }

    }

    public static double futureInvestmentValue
            (double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount *  Math.pow((1 + monthlyInterestRate), (years * 12));
    }
}

//6.12. (Display characters) Write a method that prints characters using the following
//header:
//public static void printChars(char ch1, char ch2, int
//numberPerLine)
//This method prints the characters between ch1 and ch2 with the specified numbers
//per line. Write a test program that prints ten characters per line from 1 to Z.
//Characters are separated by exactly one space
public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

public static void printChars(char ch1, char ch2, int numberPerLine){
    int currentNumber = numberPerLine;

    int beginningIndex = alphabet.indexOf((ch1 + "").toLowerCase()) + 1;
    int endingIndex = alphabet.indexOf((ch2 + "").toLowerCase());

    for(int i = beginningIndex; i < endingIndex; i++){
        System.out.print(alphabet.charAt(i));
        if(currentNumber > 1){
            currentNumber --;
        }else{
            System.out.println("");
            currentNumber = numberPerLine;
        }

    }
}

public static void main(String[] args) {
    printChars('c', 'z', 2);
}
.
///6.18. (Check password) Some websites impose certain rules for passwords. Write a
//method that checks whether a string is a valid password. Suppose the password
//rules are as follows:
//■ A password must have at least eight characters.
//■ A password consists of only letters and digits.
//■ A password must contain at least two digits.
//Write a program that prompts the user to enter a password and displays Valid
//Password if the rules are followed or Invalid Password otherwise.
 public static final int PASSWORD_REQUIRED_LENGTH = 8; // password required length

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "A password must have at least eight characters.\n" +
                "A password consists of only letters and digits.\n" +
                "A password must contain at least two digits \n" +
                "Enter a password meeting the requirements above: ");
        String s = input.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Password is VALID: " + s);
        } else {
            System.out.println("NOT VALID PASSWORD: " + s);
        }

    }

    public static boolean isValidPassword(String password) {

        if (password.length() < PASSWORD_REQUIRED_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) numCount++;
            else if (isLetter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }


}

//6.31. (Financial: credit card number validation) Credit card numbers follow certain patterns.
//A credit card number must have between 13 and 16 digits. It must start with:
//■ 4 for Visa cards
//■ 5 for Master cards
//■ 37 for American Express cards
//■ 6 for Discover cards
//In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
//numbers. The algorithm is useful to determine whether a card number is entered
//correctly or whether a credit card is scanned correctly by a scanner. Credit card
//numbers are generated following this validity check, commonly known as the
//Luhn check or the Mod 10 check, which can be described as follows (for illustration,
//consider the card number 4388576018402626):
//1. Double every second digit from right to left. If doubling of a digit results in a
//two-digit number, add up the two digits to get a single-digit number.
//2. Now add all single-digit numbers from Step 1.
//4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
//3. Add all digits in the odd places from right to left in the card number.
//6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
//4. Sum the results from Step 2 and Step 3.
///37 + 38 = 75
//5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
//it is invalid. For example, the number 4388576018402626 is invalid, but the
//number 4388576018410707 is valid.
//Write a program that prompts the user to enter a credit card number as a long
//integer. Display whether the number is valid or invalid. Design your program to
//use the following methods:
/** Return true if the card number is valid */
//public static boolean isValid(long number)
/** Get the result from Step 2 */
//public static int sumOfDoubleEvenPlace(long number)
/** Return this number if it is a single digit, otherwise,
* return the sum of the two digits */
//public static int getDigit(int number)
/** Return sum of odd-place digits in number */
//public static int sumOfOddPlace(long number)
/** Return true if the digit d is a prefix for number */
//public static boolean prefixMatched(long number, int d)
/** Return the number of digits in d */
//public static int getSize(long d)
/** Return the first k number of digits from number. If the
* number of digits in number is less than k, return number. */
//public static long getPrefix(long number, int k)
//Here are sample runs of the program: (You may also implement this program by
//reading the input as a string and processing the string to validate the credit card.)
//Enter a credit card number as a long integer:
//4388576018410707
//4388576018410707 is valid
//Enter a credit card number as a long integer:
//4388576018402626
//4388576018402626 is invalid

package work;
import java.util.Scanner;
public class exercise {

		private static Scanner input;

		/** Main Method */
		public static void main(String[] args) {
			input = new Scanner(System.in);

			System.out.print("Enter a credit card number as a long integer: ");
			long number = input.nextLong();

			System.out.println(
				number + " is " + (isValid(number) ? "valid" : "invalid"));
		}

		/** Return true if the card number is valid */
		public static boolean isValid(long number) {
			boolean valid =
				(getSize(number) >= 13 && getSize(number) <= 16) &&
				(prefixMatched(number, 4) || prefixMatched(number, 5) ||
				prefixMatched(number, 37) || prefixMatched(number, 6)) &&
				((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

			return valid;
		}
		

		public static int sumOfDoubleEvenPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 2; i >= 0; i -= 2) {
				sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
			}
			return sum;
		}
		
		public static int getDigit(int number) {
			if (number < 9)
				return number;
			else
				return number / 10 + number % 10;
		}
		
		/** Return sum of odd-place digits in number */
		public static int sumOfOddPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 1; i >= 0; i -= 2) {
				sum += Integer.parseInt(num.charAt(i) + "");
			}
			return sum;
		}
		
		public static boolean prefixMatched(long number, int d) {
			return getPrefix(number, getSize(d)) == d;
		}
		
		/** Return the number of digits in d */
		public static int getSize(long d) {
			String num = d + "";
			return num.length();
		}
		
		
		public static long getPrefix(long number, int k) {
			if (getSize(number) > k)  {
				String num = number + "";
				return  Long.parseLong(num.substring(0, k));
			}
			return number;
		}
	}


//Chapter 18, Exercises: 
//18.2. (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
//Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
//and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers. The current Fibonacci number would then be f0 + f1. The algorithm
//can be described as follows:
//f0 = 0; // For fib(0)
//f1 = 1; // For fib(1)
//for (int i = 1; i <= n; i++) {
//currentFib = f0 + f1;
//f0 = f1;
//f1 = currentFib;
//}
// After the loop, currentFib is fib(n)
//Write a test program that prompts the user to enter an index and displays its
//Fibonacci number.
import java.util.Scanner;
public class exercise {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number:");
		int index = input.nextInt();
		
		System.out.println("The Fibonacci number at index "
				+ index + " is " + fib(index));
	}
	public static long fib(long index) {
		if (index == 0)
			return 0;
		else if (index ==1)
			return 1;
		else
			return fib(index - 1) + fib(index - 2);
		
	}
}

//18.9. (Print the characters in a string reversely) Write a recursive method that displays
//a string reversely on the console using the following header:
//public static void reverseDisplay(String value)
//For example, reverseDisplay("abcd") displays dcba. Write a test program
//that prompts the user to enter a string and displays its reversal.
import java.util.Scanner;
public class Exercise18_09 {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String value = new Scanner(System.in).nextLine();
        reverseDisplay(value);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1));
        reverseDisplay(value.substring(0, value.length()-1));
    }
}

//18.10. (Occurrences of a specified character in a string) Write a recursive method that
//finds the number of occurrences of a specified letter in a string using the following
//method header:
//public static int count(String str, char a)
//For example, count("Welcome", 'e') returns 2. Write a test program that
//prompts the user to enter a string and a character, and displays the number of
//occurrences for the character in the string.

import java.util.Scanner;
public class Exercise_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        char ch = input.next().charAt(0);
        System.out.println(count(str, ch));

    }

    public static int count(String s, char ch) {

        int n =  (ch == s.charAt(0)) ? 1 : 0;
        if (s.length() == 1)
            return n;
        else
            return n + count(s.substring(1), ch);

    }

}

//18.15. (Occurrences of a specified character in a string) Rewrite Programming Exercise
//18.10 using a helper method to pass the substring high index to the method.
//The helper method header is:
//public static int count(String str, char a, int high)
public class Exercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        char ch = input.next().charAt(0);
        System.out.println(count(str, ch));

    }

    public static int count(String s, char ch) {
        return count(s, ch, s.length() - 1);
    }

    public static int count(String s, char ch, int high) {
        int n =  (ch == s.charAt(0)) ? 1 : 0;
        if (high <= 0)
            return n;
        return n + count(s.substring(1), ch, high - 1);
    }
}


//18.17. (Occurrences of a specified character in an array) Write a recursive method that
//finds the number of occurrences of a specified character in an array. You need to
//define the following two methods. The second one is a recursive helper method.
//public static int count(char[] chars, char ch)
//public static int count(char[] chars, char ch, int high)
//Write a test program that prompts the user to enter a list of characters in one line,
//and a character, and displays the number of occurrences of the character in the list.
import java.util.Scanner;
public class Exercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters in one line: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        char[] chars = s.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
    }

    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    private static int count(char[] chars, char ch, int high) {

        int count = (chars[high] == ch) ? 1 : 0;

        if (high == 0)
            return count;
        else
            return count + count(chars, ch, high - 1);
    }

}


//18.25. (String permutation) Write a recursive method to print all the permutations of a
//string. For example, for the string abc, the permuation is
//abc
//acb
//bac
//bca
//cab
//cba
//(Hint: Define the following two methods. The second is a helper method.)
//public static void displayPermutation(String s)
//public static void displayPermutation(String s1, String s2)
//The first method simply invokes displayPermutation(" ", s). The second
//method uses a loop to move a character from s2 to s1 and recursively invokes
//it with a new s1 and s2. The base case is that s2 is empty and prints s1 to the
//console.
//Write a test program that prompts the user to enter a string and displays all its
//permutations.
import java.util.Scanner;
public class Exercise {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String s = new Scanner(System.in).next();
        System.out.println("All possible permutations of " + s + " are: ");

        displayPermutation(s);
    }

    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {

        if (s2.length() == 0) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
            }
        }
    }

}
