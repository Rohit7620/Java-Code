//else if conditional statement
package ConditionalStatament;
import java.util.*;
public class Elseifexample 
{
	public static void main(String[] args) 
		{
			int num1 , num2, num3;
			Scanner sc = new Scanner(System.in);//Accepot the input from user
			System.out.println("Enter The value of num1 = ");
			num1=sc.nextInt();
			System.out.println("Enter The value of num2 = ");
			num2=sc.nextInt();
			System.out.println("Enter The value of num3 = ");
			num3=sc.nextInt();
			//checks largest number between three numbers
			if(num1>num2&&num1>num3)
			{
				System.out.println(num1+" "+"Is Greater than"+" "+num2+" "+"and"+" "+num3);
			}
			else if(num2>num1&&num2>num3)
			{
				System.out.println(num2+" "+"Is Greater than"+" "+num1+" "+"and"+" "+num3);
			}
			else
			{
				System.out.println(num3+" "+"Is Greater than"+" "+num1+" "+"and"+" "+num2);
			}
		}

}
