import java.util.Scanner;
import java.util.InputMismatchException;
public class TimeConversion2 {
	

	    public static void main(String[] args)
	    {
	        Scanner keyboard = new Scanner(System.in);
	        String input;
	        String [] splitString = new String[2];
	        int hour = -1;
	        int minute = -1;
	        boolean exitProgram = false;
	        boolean exitInputLoop = false;

	        while(!exitProgram)
	        {
	            while(!exitInputLoop)
	            {
	                try // Gather input
	                {
	                    exitInputLoop = true;
	                    System.out.print("Enter time in 24-hour notation: ");
	                    input = keyboard.nextLine();

	                    if(input.length() > 3 && input.length() < 6) // Check for a valid length, so we don't continue with
	                                                                 // "12:23:23" Or similarly long inputs.
	                    {
	                        splitString = input.split(":");
	                        hour = Integer.parseInt(splitString[0]);
	                        minute = Integer.parseInt(splitString[1]);
	                    }
	                    else
	                    {
	                        throw new TimeFormatException();
	                    }

	                    if(!isValidTime(hour, minute))               // Is the input valid, if it isn't throw an exception.
	                    {
	                        throw new TimeFormatException();
	                    }
	                }
	                catch(NumberFormatException e)                  // If the input is not a number.
	                {
	                    System.out.println();
	                    System.out.println("That is not a valid time. Please enter a time in the format: ##:##");
	                    System.out.println();
	                    exitInputLoop = false;

	                }
	                catch(InputMismatchException e)
	                {
	                    System.out.println();
	                    System.out.println("That is not a valid time.  Please enter a time in the format: ##:##");
	                    System.out.println();
	                    exitInputLoop = false;

	                }
	                catch(TimeFormatException e)                // If the input is not valid
	                {
	                    System.out.println();
	                    System.out.println("That is not a valid time. Please enter a time in the format: ##:##");
	                    System.out.println();
	                    exitInputLoop = false;

	                }
	                

	            }

	            exitInputLoop = false;

	            //Convert and display the time, it is valid at this point.
	            System.out.println();
	            System.out.println("That is the same as " + convertTime(hour) + " hour " + convertTime1(minute) + " minutes " + "" + isNoon(hour) + ".");
	            
	            System.out.println();
	            System.out.print("Again? Y/N ");

	            input = keyboard.nextLine();
	            input = input.toUpperCase();
	            System.out.println();
	            
	            try
				{
	            	if(input.charAt(0) == 'Y')
	            	{
						exitProgram = false;
	            	}
	            	else exitProgram = true;
	            }
	            catch(StringIndexOutOfBoundsException e)    // If user does not enter anything
	            {
	            	
	            	exitProgram = true;
	            }
	            //System.out.println();
	            
	        }
	        System.out.println("Exiting the program.");
	        System.out.println();
	    }

	    /* convertTime takes in integers hour and minute and returns a string for the time converted
	     * to 12-hour format.
	     */
	    public static String convertTime(int hour)
	    {   String hourOut;

	        if(hour == 0)
	        {
	            hourOut = "12";
	        }
	        else if (hour > 0 && hour < 13)
	        {
	            hourOut = Integer.toString(hour);
	        }
	        else
	        {
	            hourOut = Integer.toString(hour - 12);
	        }
	        
	        return hourOut;
	    }
	        
	        public static String convertTime1(int minute)
		    {   String minuteOut;
	       
		    if(minute == 0)
	        {
	            minuteOut = "00";
	        }
	        else if (minute < 10)
	        {
	            minuteOut = "0" + Integer.toString(minute);
	        }
	        else
	        {
	            minuteOut = Integer.toString(minute);
	        }

	        return " and " + minuteOut;
	    }

	    /* isNoon takes in an integer hour and returns a string of AM or PM depending on whether the time is
	     * before noon or after.
	    */
	     public static String isNoon(int hour)
	    {
	        if(hour > 11) return "PM";
	        return "AM";
	    }

	    /* isValidTime takes in integers hour and minute and returns a boolean.
	     * true if the input is valid, false if not.
	     */
	    public static boolean isValidTime(int hour, int minute)
	    {
	        if(hour < 0 || hour > 23 || minute < 0 || minute > 59)
	        {
	            return false;
	        }
	        return true;
	    }
	}
