//Assignment Operators < , > , <=, >=, != and Logical Operators
class AssignmentOper
{
    public static void main(String s[])
    {
        int a=10;
        int b=20;
        int c =10;
        if(a<=b&&a>=b&&a<c)
        {
            System.out.print("True");
        }
        else
        {
            System.out.println("False");
        }

        if(a!=b || a!=c)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}