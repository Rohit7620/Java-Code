//Nested if-else statement for grading marks
package ConditionalStatament;
import java.util.*;
public class Nestsedifelseex 
{

	public static void main(String[] args) 
	{
		float marks;
		Scanner sc = new Scanner(System.in);// Access the marks from users.
		System.out.println("Enter your marks = ");
		marks=sc.nextFloat();
		//Checks to your Grade
		if(marks>=35&&marks<=50)
		{
			System.out.println("Your Grade is D");
		}
		else if(marks>=50&&marks<=70)
		{
			System.out.println("Your Grade is C");
		}
		else if(marks>=71&&marks<=80)
		{
			System.out.println("Your Grade is B");
		}
		else if(marks>=81&&marks<=100)
		{
			System.out.println("Your Grade is A");	
		}
		else
		{
			System.out.println("Your Fail");
		}
	}
		
	

}
