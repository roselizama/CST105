Chapter 13, Exercises: 
//13.4.  (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
//a calendar for a specified month using the Calendar and GregorianCalendar
//classes. Your program receives the month and year from the command line. For
//example:
//java Exercise13_04 5 2016
import ToolKit.MyCalendar;
import java.util.Calendar;
public class Exercise_04 {

    private static MyCalendar calendar;
    /** Main method */
    public static void main(String[] args) {

        if (args.length > 2 || args.length == 0) {
            System.out.println("Invalid arguments");
            System.out.println("Usage: java Exercise13_04 5 2016");
            System.exit(1);
        }

        int year;
        if (args.length == 1) {
            year = Calendar.getInstance().get(Calendar.YEAR);
        } else {
            year = new Integer(args[1]);
        }
        int month = Integer.parseInt(args[0]) - 1;
        calendar = new MyCalendar(year, month, 1);
        calendar.set(Calendar.DATE, 1);

        printMonth();
    }

    /** Print the calendar for a month in a year */
    public static void printMonth() {
        // Print the headings of the calendar
        printMonthTitle();

        // Print the body of the calendar
        printMonthBody();
    }

    /** Print the month title, e.g., May, 1999 */
    public static void printMonthTitle() {
        System.out.println("         " + calendar.getMonthName()
                + " " + calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }


    /** Print month body */
    public static void printMonthBody() {
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        // Get number of days in the month
        int numberOfDaysInMonth = calendar.daysInMonth();

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


}

//13.11. (The Octagon class) Write a class named Octagon that extends
//GeometricObject and implements the Comparable and Cloneable interfaces.
//Assume that all eight sides of the octagon are of equal length. The area can
//be computed using the following formula:
//area = (2 + 4/22)* side * side
//Draw the UML diagram that involves Octagon, GeometricObject,
//Comparable, and Cloneable. Write a test program that creates an Octagon
//object with side value 5 and displays its area and perimeter. Create a new object
//using the clone method and compare the two objects using the compareTo
//method.

import ToolKit.Octagon;
public class Exercise_11 {

    public static void main(String[] args) {
        Octagon oc1 = new Octagon(10);
        Octagon oc2 = (Octagon)oc1.clone();

        System.out.println("compareTo: " + (oc1.compareTo(oc2) == 0));
        System.out.println("equals: " + oc1.equals(oc2));
        System.out.println("Have the same reference? " + (oc1 == oc2));
    }
}

//13.13. (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
//to add a clone method to perform a deep copy on the students field.
import ToolKit.Course;
public class Exercise_13 {
    public static void main(String[] args) {

        Course course1 = new Course("Course1");
        course1.addStudent("student1");
        course1.addStudent("student2");
        Course course2 = (Course)course1.clone();
        // Checking if any of the members have the same reference
        System.out.println(course1 == course2);
        System.out.println(course1.getCourseName() == course2.getCourseName());
        System.out.println(course1.getStudents() == course2.getStudents());
    }
}


//13.16. (Create a rational-number calculator) Write a program similar to Listing 7.9,
//Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a.
//You will need to use the split method in the String class, introduced in
//Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string and
//denominator string, and convert strings into integers using the Integer.parseInt
//method.

import ToolKit.BigRational;
import java.util.ArrayList;
public class Exercise_16 {

    public static void main(String[] args) {

        String[] token = getTokens(args);

        if (token.length != 3 || !isValidOperator(token)) {
            System.out.println("Invalid arguments.");
            System.out.println("Usage: java Chapter_13.Exercise_16 1/2 * 8/17");
            System.exit(1);
        }

        BigRational operand1 = new BigRational(token[0]);
        BigRational operand2 = new BigRational(token[2]);

        BigRational answer = null;
        switch (args[1]) {
            case "+": answer = operand1.add(operand2); break;
            case "-": answer = operand1.subtract(operand2); break;
            case "*": answer = operand1.multiply(operand2); break;
            case "/": answer = operand1.divide(operand2); break;
        }

        System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
    }

    private static boolean isValidOperator(String[] token) {

        return  token[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") &&
                token[1].matches("[\\-\\+\\*\\/]") &&
                token[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
    }

    private static String[] getTokens(String[] strings) {
        String merged = " ";
        for (String s : strings) {
            merged += " " + s;
        }

        String[] tokens = merged.split("[\\s ]");
        ArrayList<String> temp = new ArrayList<>();
        // remove blanks
        for (String s : tokens) {
            if (s.length() != 0) {
                temp.add(s);
            }
        }
        return temp.toArray(new String[temp.size()]);
    }

}



