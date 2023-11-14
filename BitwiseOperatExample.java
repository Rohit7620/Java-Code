//Bitwise Operator & , |, ^.
package BitwiseOperator;
import java.util.*;
public class BitwiseOperatExample 
{

	public static void main(String[] args) 
	{
		int num1,num2,result;
		Scanner sc = new Scanner(System.in);// Accept the input from user
		System.out.println("Enter the value of num1 = ");
		num1=sc.nextInt();
		System.out.println("Enter the value of num2 = ");
		num2=sc.nextInt();
		//Bitwise & Operator
		result=num1&num2;
		System.out.println("The Result of Bitwise & Operator is = "+result);
		//Bitwise | Operator
		result=num1|num2;
		System.out.println("The Result of Bitwise | Operator is = "+result);
		//Bitwise ^ Operator
		System.out.println("The Result of Bitwise ^ Operator is = "+result);
	}

}
