//Switch Statement for color  selection
package ConditionalStatament;
import java.util.*;
public class SwitchExample 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);//Accept user choice
		System.out.println("Enter Your Choice For Color = 1-Red 2-Blue 3-Green");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Your Favourite color is Red");
			break;
		
		case 2:
			System.out.println("Your Favourite color is Blue");
			break;
		
		case 3:
			System.out.println("Your Favourite color is Green");
			break;
		
		default:
			System.out.println("Please Select correct Choice");
		}
		
	}

}
