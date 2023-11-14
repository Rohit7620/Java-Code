//Operators
import java.util.*;
class Operators
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter a Value of b = ");
        int b = sc.nextInt();
        // (+) Airathematic Operators
        int add = a+b;
        System.out.println("Addition of a+b is = "+add);
        // (-) Airathematic Operators
        int sub = a-b;
        System.out.println("Substraction of a+b is = "+sub);
        // (*) Airathematic Operators
        int mul = a*b;
        System.out.println("Multiplication of a+b is = "+mul);
        // (/) Airathematic Operators
        int div = a/b;
        System.out.println("Division of a+b is = "+div);
        // (%) Airathematic Operators
        int mod = a%b;
        System.out.println("Moduls of a+b is = "+mod);


    }
}