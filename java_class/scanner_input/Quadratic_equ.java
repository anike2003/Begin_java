//Program of a calculator solving root of a Quadratic equation 
import java.util.Scanner; //import Java Scanner libary
class Quadratic_equ
{
    public static void main(String[] args)
    {
         //introducing a variable(scan) to hold data input from user
         Scanner scan = new Scanner(System.in);
         
            System.out.print("Please enter the value for a: ");
               double a = scan.nextDouble(); //declare variable a

              System.out.print("Please enter the value for b: ");
               double b = scan.nextDouble(); //declare variable b

                System.out.print("Please enter the value for c: ");
                  double c = scan.nextDouble(); //declare variable c

                  double X1;
                  double X2;
                  double p;
                  double q;
                   //initializing p,q,X1 and X2
                    p = -b + Math.sqrt((b*b)- (4 * a * c));
                    q = -b - Math.sqrt((b*b)- (4 * a * c));
                    X1 = p / 2*a;
                    X2 = q / 2*a;
                    System.out.println("First root of equation is " + X1); //print X1
                       System.out.print("Second root of equation is " + X2); //print X2
        // System.out.printf("First root of equation is %f and %f", X1,X2); //Alternatively using printf statement
    }
}


