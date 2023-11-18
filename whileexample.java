//while example for print numbers
package loopsExample;
import java.util.*;
public class whileexample 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  = ");
		num=-sc.nextInt();
		while(num<=10)
		{
			System.out.println("The numbers are = " + num);
			num++;
		}
	}

}
