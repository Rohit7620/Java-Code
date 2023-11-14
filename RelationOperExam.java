//Relational Operator (?:).
package BitwiseOperator;
import java.util.*;
public class RelationOperExam 
{

	public static void main(String[] args) 
	{
		int num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of num1 = ");
		num1=sc.nextInt();
		System.out.println("Enter the value of num2 = ");
		num2=sc.nextInt();
		result=(num1<num2)?num1:num2;//Lowest Number.
		System.out.println("The Lowest Number is = "+result);		
	}

}
