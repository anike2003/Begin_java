//Program to find the factorial of a number
import java.util.Scanner;
class factorial
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Pls enter a number: ");
      int num = scan.nextLong();

       int i,fact=1;
       if (num < 0 )
    {
         System.out.println("Pls enter positive numbers only!!!");
    }
    else
     {
        for (i=1; i<=num; i++)
       {
        fact = fact * i;
       }
       System.out.println(num + "! = " + fact);
    }
}
}