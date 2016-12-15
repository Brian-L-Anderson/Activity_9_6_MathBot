
import java.util.Scanner;

/**
 * @author Brian Anderson
 * @version October 2016
 */
public class MathbotRunner
{
	public static void main(String[] args)
	{
		Mathbot mathbot = new Mathbot();
		
		System.out.println (mathbot.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (mathbot.getResponse(statement));
			statement = in.nextLine();
		}
	}

}