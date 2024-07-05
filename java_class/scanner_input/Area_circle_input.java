//Program of calculating the area of a circle
import java.util.Scanner;
public class Area_circle_input
{
  public static void main(String[] args)
  {       //Accepting input from users using variable scan
         Scanner scan = new Scanner(System.in); 
            System.out.println("Please enter the radius of the cicle:");
                //declaring variables
                double radius = scan.nextDouble();
                  //double pie = 3.142;
                   double ans_rad= Math.pow(radius,2);
                      double Area = ans_rad * Math.PI;
                       //print result
                       System.out.print("The area of the cicle with radius " + radius + " is " + Area);


  }
}