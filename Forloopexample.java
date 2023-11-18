// for loop execution for displaying multiplication table for a given numbers
package loopsExample;
import java.util.*;
public class Forloopexample 
{

	public static void main(String[] args) 
	{
		int num,index,result;//initializing variables
		Scanner sc = new Scanner(System.in);//Accepting number from user
		System.out.println("Enter number for print multiplication table = ");
		num=sc.nextInt();
		for(index=1;index<=10;index++)
		{
			result=num*index;
			System.out.println("The table of"+" "+num+" "+"is = "+" "+result);
		}

	}

}
