package basicInputOutput.controller;
import java.util.Scanner;


public class BasicIOController 
{
	private String firstName = "";
	private String lastName = "";
			
	public BasicIOController(String first, String last)
	{
		firstName = first;
		lastName = last;
	}
		public void printGreeting()
		{
			
			System.out.println(firstName + lastName);
		Scanner myScanner = new Scanner(System.in);
			
	String respone = myScanner.nextLine();
		System.out.println(response);
		
	
		}
	
		
}
