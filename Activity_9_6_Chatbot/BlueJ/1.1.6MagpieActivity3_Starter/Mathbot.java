
/**
 * Write a description of class Mathbot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Mathbot
{
    /**
     * Get a default greeting
     * 
     * @return a greeting
     */
    public String getGreeting()
    {
        return "What would you like to know about mathematics?";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        {
            response = "You have to ask a question to get an answer.";
        }
        else if (findKeyword(statement, "add") >= 0
        || (findKeyword(statement, "plus") >= 0)
        || (findKeyword(statement, "+") >= 0))
        {
            Scanner user_input = new Scanner(System.in);
            
            String num1;
            System.out.println("Give me one of the numbers to add?");
            num1 = user_input.next();
            double x = Integer.parseInt(num1);
            
            String num2;
            System.out.println("What is it added to?");
            num2 = user_input.next();
            double y = Integer.parseInt(num2);
            double z = x + y;
            
            
            System.out.println("The answer is " + z);
            
        }
        else if (findKeyword(statement, "minus") >= 0
        || (findKeyword(statement, "subtract") >= 0)
        || (findKeyword(statement, "-") >= 0))
        {
            Scanner user_input = new Scanner(System.in);
            
            String num1;
            System.out.println("Give me the original number?");
            num1 = user_input.next();
            double x = Integer.parseInt(num1);
            
            String num2;
            System.out.println("What is subtracted from it?");
            num2 = user_input.next();
            double y = Integer.parseInt(num2);
            double z = y - x;
            
            
            System.out.println("The answer is " + z);
            
        }
        else if (findKeyword(statement, "multiply") >= 0
        || (findKeyword(statement, "times") >= 0)
        || (findKeyword(statement, "*") >= 0))
        {
            Scanner user_input = new Scanner(System.in);
            
            String num1;
            System.out.println("Give me the first number?");
            num1 = user_input.next();
            double x = Integer.parseInt(num1);
            
            String num2;
            System.out.println("What is it multiplied to?");
            num2 = user_input.next();
            double y = Integer.parseInt(num2);
            double z = y * x;
            
            
            System.out.println("The answer is " + z);
            
        }
        else if (findKeyword(statement, "divide") >= 0
        || (findKeyword(statement, "division") >= 0)
        || (findKeyword(statement, "*") >= 0))
        {
            Scanner user_input = new Scanner(System.in);
            
            String num1;
            System.out.println("Give me the original number?");
            num1 = user_input.next();
            double x = Integer.parseInt(num1);
            
            String num2;
            System.out.println("What is it divided by?");
            num2 = user_input.next();
            double y = Integer.parseInt(num2);
            double z = x / y;
            
            
            System.out.println("The answer is " + z);
            
        }
        else if (findKeyword(statement, "root") >= 0)
        {
            Scanner user_input = new Scanner(System.in);
            
            String num1;
            System.out.println("What root?");
            num1 = user_input.next();
            double x = Integer.parseInt(num1);
            
            String num2;
            System.out.println("What is the radicand?");
            num2 = user_input.next();
            double y = Integer.parseInt(num2);
            
            double a = 1 / x;
            double z = Math.pow(y,a);
            
            System.out.println("The answer is " + z);
            
        }

        else if (findKeyword(statement, "area") >= 0)
        {
           Scanner user_input = new Scanner(System.in);
            
               String num2;
               System.out.println("What shape?");
               num2 = user_input.next();
           if (findKeyword(num2, "triangle") >= 0)
           {
            String num3;
            System.out.println("What is the base?");
            num3 = user_input.next();
            double x = Integer.parseInt(num3);
            
            String num4;
            System.out.println("What is the height?");
            num4 = user_input.next();
            double y = Integer.parseInt(num4);
            double z = (x * y)/2;
            
            System.out.println("The area of the triangle is " + z);
           }
           if (findKeyword(num2, "circle") >= 0)
           {
            String num5;
            System.out.println("What is the radius?");
            num5 = user_input.next();
            double y = Integer.parseInt(num5);
            
            double a = Math.pow(y,2);
            double z = Math.PI * a;
            
            System.out.println("The area of the circle is " + z);
           }
            if (findKeyword(num2, "rectangle") >= 0
            || (findKeyword(num2, "square") >= 0))
           {
            String num3;
            System.out.println("What is the width?");
            num3 = user_input.next();
            double y = Integer.parseInt(num3);
            
            String num4;
            System.out.println("What is the height?");
            num4 = user_input.next();
            double x = Integer.parseInt(num4);
            double z = x * y;
            
            System.out.println("The area of the shape is " + z);
            
           }
           else
           {
            response = "Unfortunately, my database is not equipped to deal with that kind of area";
           }   
        }
        else if(findKeyword(statement, "mean") >= 0
        || (findKeyword(statement, "average") >= 0))
        {
            int sum = 0, inputNum;
            int counter;
            float mean;
            Scanner NumScanner = new Scanner(System.in);
            Scanner charScanner = new Scanner(System.in);
 
            System.out.println("Enter the total number of terms whose mean you want to calculate");
 
            counter = NumScanner.nextInt();
 
            System.out.println("Please enter " + counter + " numbers:");
 
            for(int x = 1; x<=counter ;x++){          
                inputNum = NumScanner.nextInt();
                sum = sum + inputNum;
                System.out.println();
            }
 
            mean = sum / counter;
            System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
         
            
      
    }


        else if (findKeyword(statement, "physics") >= 0
        || findKeyword(statement, "algebra") >= 0
        || findKeyword(statement, "geometry") >= 0
        || findKeyword(statement, "calculus") >= 0
        || findKeyword(statement, "trigonometry") >= 0)
        {
            response = "I know a lot about that! Can you be more specific?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn)
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase();
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * 
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Algebra can never keep a girl, it has too many x's";
        }
        else if (whichResponse == 1)
        {
            response = "I hate college algebra, its thought process is so linear";
        }
        else if (whichResponse == 2)
        {
            response = "Hey, if you're cold, you should stand in a corner - it's 90 degrees";
        }
        else if (whichResponse == 3)
        {
            response = "If a man graduates with a math major from college, would he get a degree or a radian?";
        }
        else if (whichResponse == 4)
        {
            response = "What is the Illuminati's favorite school subject? Trigonometry.";
        }
        else if (whichResponse == 5)
        {
            response = "There was once this mathmetician who had no money for lunch. He could binomial.";
        }
        else if (whichResponse == 6)
        {
            response = "When the statistics professor and the math professor wrote a cookbook together, they called it 'Pi A La Mode.";
        }
        else if (whichResponse == 7)
        {
            response = "What do organic mathematicians throw into their fireplaces? Natural Logs.";
        }
        else if (whichResponse == 8)
        {
            response = "The mathematician worked at home because he could only function in his domain.";
        }
        else if (whichResponse == 9)
        {
            response = "I used to think math was senseless, but then I realized decimals have a point.";
        }
        return response;
    }

}
