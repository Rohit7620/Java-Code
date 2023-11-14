//if else statement Example
package ConditionalStatament;
import java.util.*;
public class IfElseExample 
{

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);//Accept the input from User
		System.out.println("Enter The value of num1 = ");
		num1=sc.nextInt();
		System.out.println("Enter The value of num2 = ");
		num2=sc.nextInt();
		// two number comparision
		if(num1<num2)
		{
			System.out.println(num1+" "+ "is less than"+" "+ num2);
			
		}
		else
		{
			System.out.println(num1+" " + "is greter than"+" "+ num2);
		}
	}

}
