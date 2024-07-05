//Program to calculate a quadratic equation using else if statement
import java.util.Scanner;
class Quadratic_equ2
{
    public static void main(String[] args)
    {   ////introducing a variable(scan) to hold data input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value for a:");
        double a=scan.nextDouble();//declare variable a

         System.out.println("Please enter a value for b:");
        double b=scan.nextDouble();//declare variable b

         System.out.println("Please enter a value for c:");
        double c=scan.nextDouble();//declare variable c
         //declare variable d,X1 and X2
         double d;
         double X1;
         double X2;
        d = Math.sqrt((b*b) - (4 * a * c));      //initialing variable d
        
        //use of else if statement  
         if (d > 0.0 )
         {    
           
            X1 = (-b + d)/ 2 * a;            //initialing variable X1
            X2 =  (-b - d)/ 2 * a;           //initialing variable X2
             System.out.println("X1 = " + X1);        //print X1
             System.out.print("X2 = " + X2);         //print X2
         }

      
         else if (d==0.0)
         {   
             
            X1 = -b / 2 * a;               //initialing variable X1
            X2 = -b / 2 * a;              //initialing variable X2
             System.out.println("X1 = " + X1);     //print X1
             System.out.print("X2 = " + X2);      //print X2

         }
         else
         {
            System.out.print("This equation has a complex root!!!"); //print this if all conditions above is false
         }
        
}





}