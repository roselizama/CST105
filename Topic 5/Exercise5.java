
public class Exercise5 {

	//Chapter 11, Exercises: 
		//11.2. (The Person, Student, Employee, Faculty, and Staff classes) Design a
		//class named Person and its two subclasses named Student and Employee.
		//Make Faculty and Staff subclasses of Employee. A person has a name,
		//address, phone number, and email address. A student has a class status (freshman,
		//sophomore, junior, or senior). Define the status as a constant. An employee has
		//an office, salary, and date hired. Use the MyDate class defined in Programming
		//Exercise 10.14 to create an object for date hired. A faculty member has office
		//hours and a rank. A staff member has a title. Override the toString method in
		//each class to display the class name and the person’s name.
		//Draw the UML diagram for the classes and implement them. Write a test program
		//that creates a Person, Student, Employee, Faculty, and Staff, and
		//invokes their toString() methods.

	import ToolKit.*;
	public class Exercise_02 {

	    public static void main(String[] args) {

	        Person person = new Person("person");
	        Student student = new Student("student");
	        Employee employee = new Employee("employee");
	        Faculty faculty = new Faculty("faculty");
	        Staff staff = new Staff("staff");

	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());

	    }


	}

		//11.3. (Subclasses of Account) In Programming Exercise 9.7, the Account class was
		//defined to model a bank account. An account has the properties account number,
		//balance, annual interest rate, and date created, and methods to deposit and withdraw
		//funds. Create two subclasses for checking and saving accounts. A checking
		//account has an overdraft limit, but a savings account cannot be overdrawn.
		//Draw the UML diagram for the classes and then implement them. Write
		//a test program that creates objects of Account, SavingsAccount, and
		//CheckingAccount and invokes their toString() methods.

	import ToolKit.Account;
	import ToolKit.CheckingAccount;
	import ToolKit.SavingsAccount;
	public class Exercise_03 {

	    public static void main(String[] args) {

	        Account account = new Account(111, 200);
	        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
	        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

	        System.out.println(account);
	        System.out.println(checkingAccount);
	        System.out.println(savingsAccount);
	    }

	}

		//11.5.(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
		//to replace an array to store students. Draw the new UML diagram for the class.
		//You should not change the original contract of the Course class (i.e., the definition
		//of the constructors and methods should not be changed, but the private
		//members may be changed.)
	import java.util.ArrayList;
	ublic class Exercise_05 {

	    // modified Course class below
	}

	class Course {

	    private String courseName;
	    private ArrayList<String> students = new ArrayList<>();

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public void addStudent(String student) {

	        students.add(student);
	    }

	    public String[] getStudents() {
	        return students.toArray(new String[students.size()]);
	    }

	    public int getNumberOfStudents() {
	        return students.size();
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public void dropStudent(String student) {

	        students.remove(student);

	    }

	    public void clear(){
	        students.clear();
	    }

	}
	
	
	//11.8. (New Account class) An Account class was specified in Programming
		//Exercise 9.7. Design a new Account class as follows:
		//? Add a new data field name of the String type to store the name of the
		//customer.
		//? Add a new constructor that constructs an account with the specified name, id,
		//and balance.
		//? Add a new data field named transactions whose type is ArrayList
		//that stores the transaction for the accounts. Each transaction is an instance
		//of the Transaction
	import ToolKit.Account;
	public class Exercise_08 {

	    public static void main(String[] args) {

	        Account account = new Account("George", 1122, 1000);
	        account.setAnnualInterestRate(1.5);
	        account.deposit(30);
	        account.deposit(40);
	        account.deposit(50);
	        account.withdraw(5);
	        account.withdraw(4);
	        account.withdraw(2);
	        System.out.println(account);
	    }
	}
	
	

		//11.17.(Algebra: perfect square) Write a program that prompts the user to enter an integer
		//m and find the smallest integer n such that m * n is a perfect square. (Hint:
		//Store all smallest factors of m into an array list. n is the product of the factors that
		//appear an odd number of times in the array list. For example, consider m = 90,
		//store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
		//in the array list. So, n is 10.) Here are sample runs:
		//Enter an integer m: 1500
		//The smallest number n for m * n to be a perfect square is 15
		//m * n is 22500
		//Enter an integer m: 63
		//The smalle
		//st number n for m * n to be a perfect square is 7
		//m * n is 441
	import java.util.ArrayList;
	import java.util.Scanner;
	public class Exercise_17 {

	    public static void main(String[] args) {
	        System.out.print("Enter an integer m: ");
	        Scanner input = new Scanner(System.in);
	        int m = input.nextInt();
	        ArrayList<Integer> factors = new ArrayList<>();

	        getFactors(m, factors);

	        int smallestSquare = smallestSquare(factors);
	        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
	        System.out.println("m * n = " + (m * smallestSquare));
	    }

	    private static int smallestSquare(ArrayList<Integer> factors) {

	        int[][] occurrences = copy(factors);
	        for (int i : factors) {
	            search(occurrences, i);
	        }

	        // remove duplicates and get odd sequence factors
	        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

	        // get smallest square by multiplying oddSequenceFactors
	        int smallestSquare = 1;
	        for (int i : oddSequenceFactors) {
	            smallestSquare *= i;
	        }
	        return smallestSquare;
	    }

	    private static ArrayList<Integer> removeDuplicates(int[][] m) {
	        ArrayList<Integer> temp = new ArrayList<>();

	        for (int i = 0; i < m.length; i++) {
	            if (m[i][1] % 2 != 0) {
	                temp.add(m[i][0]);
	            }
	        }

	        // removing duplicates
	        ArrayList<Integer> duplicateRemoved = new ArrayList<>();
	        for (int i = 0; i < temp.size(); i++) {

	            if (!duplicateRemoved.contains(temp.get(i))) {
	                duplicateRemoved.add(temp.get(i));
	            }
	        }

	        return duplicateRemoved;
	    }

	    private static void search(int[][] m, int number) {
	        for (int i = 0; i < m.length; i++) {
	            if (m[i][0] == number) {
	                m[i][1]++;
	            }
	        }
	    }

	    private static int[][] copy(ArrayList<Integer> factors) {

	        int[][] temp = new int[factors.size()][2];

	        for (int i = 0; i < temp.length; i++) {
	            temp[i][0] = factors.get(i);
	        }
	        return temp;
	    }

	    private static void getFactors(int m, ArrayList<Integer> factors) {

	        int count = 2;
	        while (count <= m) {
	            if (m % count == 0) {
	                factors.add(count);
	                m /= count;
	            } else {
	                count++;
	            }
	        }
	    }

	}
	
	

		//Chapter 14, Exercises: 
		//14.12. (Display a bar chart) Write a program that uses a bar chart to display the percentages
		//of the overall grade represented by projects, quizzes, midterm exams, and the
		//final exam, as shown in Figure 14.46b. Suppose that projects take 20 percent and
		//are displayed in red, quizzes take 10 percent and are displayed in blue, midterm
		//exams take 30 percent and are displayed in green, and the final exam takes 40
		//percent and is displayed in orange. Use the Rectangle class to display the bars.
		//Interested readers may explore the JavaFX BarChart class for further study.
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;
	public class Exercise_12 extends Application {

	    // project - 20% - red
	    // quizzes - 10% - blue
	    // midterm - 30% - green
	    // final - 40% - orange
	    private static final double WIDTH = 400;
	    private static final double HEIGHT = 400;
	    private static final double LIMIT_HEIGHT = (HEIGHT / 2);
	    private static double[] percent = new double[]{0.20, 0.10, 0.30, 0.40};
	    private static String[] titles = new String[] {
	            "project - " + String.format("%d%s", (int)(100 * percent[0]), "%"),
	            "quizzes - " + String.format("%d%s", (int)(100 * percent[1]), "%"),
	            "midterm - " + String.format("%d%s", (int)(100 * percent[2]), "%"),
	            "final - "+ String.format("%d%s", (int)(100 * percent[3]), "%")
	     };
	    private static Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

	    @Override
	    public void start(Stage primaryStage) {

	        Pane pane = new Pane();
	        pane.setPadding(new Insets(5, 10, 0, 10));
	        Rectangle[] bars = new Rectangle[4];

	        for (int i = 0; i < bars.length; i++) {

	            bars[i] = new Rectangle(
	                    5 + (100 * i), // x
	                    LIMIT_HEIGHT - (HEIGHT * percent[i]), // y
	                    WIDTH / bars.length - 5, // width
	                    HEIGHT * percent[i]); // height
	            bars[i].setFill(colors[i]);

	            Text text = new Text(5 + (100 * i),LIMIT_HEIGHT - (HEIGHT * percent[i]) - 5,titles[i]);
	            pane.getChildren().addAll(text, bars[i]);

	        }

	        primaryStage.setScene(new Scene(pane, WIDTH + 20, LIMIT_HEIGHT));
	        primaryStage.setTitle("Bar graph");
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        Application.launch(args);

	    }



	}
	
	
	//14.14. (Display a rectanguloid) Write a program that displays a rectanguloid, as shown
		//in Figure 14.47a. The cube should grow and shrink as the window grows or
		//shrinks.
		
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Line;
	import javafx.scene.shape.Rectangle;
	import javafx.scene.shape.Shape;
	import javafx.stage.Stage;

	import java.util.ArrayList;
	public class Exercise_14 extends Application {

	    @Override
	    public void start(Stage primaryStage) {

	        Pane pane = new Pane();

	        ArrayList<Shape> shapes = new ArrayList<>();

	        Rectangle rec1 = new Rectangle(0,0, Color.TRANSPARENT);
	        rec1.setStroke(Color.BLACK);
	        rec1.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
	        rec1.yProperty().bind(pane.heightProperty().divide(4).add(25));
	        rec1.widthProperty().bind(pane.widthProperty().divide(2));
	        rec1.heightProperty().bind(pane.widthProperty().divide(2));
	        shapes.add(rec1);

	        Rectangle rec2 = new Rectangle(0,0, Color.TRANSPARENT);
	        rec2.setStroke(Color.BLACK);
	        rec2.xProperty().bind(pane.widthProperty().divide(4).add(25));
	        rec2.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
	        rec2.widthProperty().bind(pane.widthProperty().divide(2));
	        rec2.heightProperty().bind(pane.widthProperty().divide(2));
	        shapes.add(rec2);

	        Line line1 = new Line();
	        line1.startXProperty().bind(rec1.xProperty());
	        line1.startYProperty().bind(rec1.yProperty());
	        line1.endXProperty().bind(rec2.xProperty());
	        line1.endYProperty().bind(rec2.yProperty());
	        shapes.add(line1);

	        Line line2 = new Line();
	        line2.startXProperty().bind(rec1.xProperty());
	        line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
	        line2.endXProperty().bind(rec2.xProperty());
	        line2.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));
	        shapes.add(line2);

	        Line line3 = new Line();
	        line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
	        line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
	        line3.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
	        line3.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));
	        shapes.add(line3);

	        Line line4 = new Line();
	        line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
	        line4.startYProperty().bind(rec1.yProperty());
	        line4.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
	        line4.endYProperty().bind(rec2.yProperty());
	        shapes.add(line4);


	        pane.getChildren().addAll(shapes);
	        Scene scene = new Scene(pane, 400, 400);
	        scene.xProperty().add(scene.yProperty());
	        primaryStage.setTitle("Welcome to Java");
	        primaryStage.setScene(scene);
	        primaryStage.show();

	    }


	    public static void main(String[] args) {
	        Application.launch(args);

	    }
	}

	
	
	//14.17. (Game: hangman) Write a program that displays a drawing for the popular hangman
		//game, as shown in Figure 14.48a.
	import javafx.application.Application;
	import javafx.collections.ObservableList;
	import javafx.scene.Node;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Arc;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Line;
	import javafx.stage.Stage;
	public class Exercise_17 extends Application {

	    private static double HEIGHT = 400;
	    private static double WIDTH = 400;

	    @Override
	    public void start(Stage primaryStage) {

	        Pane pane = new Pane();
	        ObservableList<Node> list = pane.getChildren();

	        primaryStage.setTitle("Hangman");
	        primaryStage.setScene(new Scene(pane, WIDTH, WIDTH));
	        Arc arc = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0, 180);
	        arc.setFill(Color.TRANSPARENT);
	        arc.setStroke(Color.BLACK);
	        list.add(arc);

	        Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), pane.getHeight() / 12);
	        list.add(pole);

	        Line holder = new Line(pole.getEndX(), pole.getEndY(), pane.getWidth() / 1.5, pole.getEndY());
	        list.add(holder);
	        Line hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), pane.getHeight() / 6);
	        list.add(hang);

	        double radius = WIDTH / 10;
	        Circle c = new Circle(holder.getEndX(), pane.getHeight()/ 6 + radius, radius);
	        c.setFill(Color.TRANSPARENT);
	        c.setStroke(Color.BLACK);
	        list.add(c);

	        double[] p = getPointAtAngle(c, 220);
	        Line leftArm = new Line(pane.getWidth() / 2, pane.getHeight() / 2, p[0], p[1]);
	        list.add(leftArm);
	        p = getPointAtAngle(c, 315);
	        Line rightArm = new Line(pane.getWidth() / 1.2, pane.getHeight() / 2, p[0], p[1]);
	        list.add(rightArm);

	        p = getPointAtAngle(c, 270);
	        Line body = new Line(p[0], p[1], p[0], pane.getHeight() / 1.6);
	        list.add(body);

	        Line leftLeg = new Line(body.getEndX(), body.getEndY(),
	                pane.getWidth() / 2, pane.getHeight() / 1.3);
	        list.add(leftLeg);

	        Line rightLeg = new Line(body.getEndX(), body.getEndY(),
	                pane.getWidth() / 1.2, pane.getHeight() / 1.3);
	        list.add(rightLeg);


	        primaryStage.show();
	    }

	    public static void main(String[] args) {

	        Application.launch(args);

	    }

	    private double[] getPointAtAngle(Circle c, double angle) {
	        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
	        double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));

	        return new double[]{x, y};
	    }
	}
	
	
	//14.19.(Plot the sine and cosine functions) Write a program that plots the sine function
		//in red and cosine in blue, as shown in Figure 14.48c.
		//Hint: The Unicode for p is \u03c0. To display -2p, use Text(x, y, "-2\u03c0").
		//For a trigonometric function like sin(x), x is in radians. Use the following loop
		//to add the points to a polyline:
		//Polyline polyline = new Polyline();
		//ObservableList<Double> list = polyline.getPoints();
		//double scaleFactor = 50;
		//for (int x = -170; x <= 170; x++) {
		//list.add(x + 200.0);
		//list.add(100 – 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		//}
	import javafx.application.Application;
	import javafx.collections.ObservableList;
	import javafx.scene.Scene;
	import javafx.scene.layout.Pane;
	import javafx.scene.shape.Line;
	import javafx.scene.shape.Polyline;
	import javafx.scene.text.Font;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;
	
	public class Exercise_19 extends Application{

	    private static double WIDTH = 500;
	    private static double HEIGHT = 200;
	    private static double CENTER_X = WIDTH / 2;
	    private static double CENTER_Y = HEIGHT / 2;

	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        Pane pane = new Pane();


	        Polyline xAxis = new Polyline();
	        drawXAxis(pane, xAxis);
	        Polyline yAxis = new Polyline();
	        drawYAxis(pane, yAxis);

	        String[] pi = new String[] {"-3\u03c0", "-2\u03c0", "-\u03c0", "0" , "\u03c0", "2\u03c0", "3\u03c0"};

	        int index = 0;
	        Polyline polyline1 = new Polyline();
	        ObservableList<Double> list = polyline1.getPoints();
	        for (int x = -170; x <= 170; x++) {
	            list.add(x + CENTER_X);
	            double y = CENTER_Y - 50 * Math.sin((x / 100.0) * 2 * Math.PI);
	            list.add(y);

	            if (y >= 99.9 && y < 100.01) {
	                Text text1 = new Text(x + CENTER_X, CENTER_Y / 0.9, pi[index++]);
	                pane.getChildren().add(text1);
	            }

	        }
	        Polyline polyline2 = new Polyline();
	        ObservableList<Double> list2 = polyline2.getPoints();

	        for (int x = -170; x <= 170; x++) {
	            list2.add(x + CENTER_X);
	            list2.add(CENTER_Y - 50 * Math.cos((x / 100.0) * 2 * Math.PI));

	        }
	        pane.getChildren().addAll(xAxis, yAxis,polyline1,polyline2);
	        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
	        primaryStage.setTitle("Plot the sine and cosine functions");
	        primaryStage.show();

	    }

	    private static void drawXAxis(Pane pane, Polyline xAxis) {
	        ObservableList<Double> xAxisList = xAxis.getPoints();
	        double limit = WIDTH * 0.95;

	        for (double x = 0; x < limit; x++) {
	            xAxisList.add(x);
	            xAxisList.add(CENTER_Y);
	        }

	        Line line1 = new Line(limit, CENTER_Y, limit - WIDTH * 0.05, CENTER_Y * 0.875);
	        Line line2 = new Line(limit, CENTER_Y, limit - WIDTH * 0.05, CENTER_Y / 0.875);
	        Text text = new Text(limit + (WIDTH * 0.02), CENTER_Y, "X");
	        text.setFont(Font.font(22));
	        pane.getChildren().addAll(line1, line2, text);
	    }

	    private static void drawYAxis(Pane pane, Polyline yAxis) {

	        ObservableList<Double> yAxisList = yAxis.getPoints();
	        double limit = HEIGHT * 0.95;

	        for (double y = 0; y < limit; y++) {
	            yAxisList.add(CENTER_X);
	            yAxisList.add(y + HEIGHT * 0.1);

	        }
	        Line line1 = new Line(CENTER_X, HEIGHT * 0.1, CENTER_X - WIDTH * 0.05, HEIGHT * 0.2);
	        Line line2 = new Line(CENTER_X, HEIGHT * 0.1, CENTER_X + WIDTH * 0.05, HEIGHT * 0.2);
	        Text text = new Text(limit + (WIDTH * 0.2), HEIGHT * 0.1, "Y");
	        text.setFont(Font.font(22));
	        pane.getChildren().addAll(line1, line2,text);
	    }


	    public static void main(String[] args) {

	        Application.launch(args);

	    }

	}
	
}
