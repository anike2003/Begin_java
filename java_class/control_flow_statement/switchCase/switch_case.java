//Program of calculating the grade of student using switch case
import java.util.Scanner;
public class switch_case
{
  public static void main(String[] args)
  {       //Accepting input from users using variable scan
         Scanner scan = new Scanner(System.in); 
            System.out.println("Please enter your grade:");
                //declaring variables
                String grade = scan.next();
                
          
            switch (grade)
            {
                case "A","a":
                  
                       System.out.println("Congratulations!!! Your score is greater than 70");
                       break;
                case "B","b":
                  
                       System.out.println("Your score ranges from 60 to 69");
                       break;
                case "C","c":
                  
                       System.out.println("Your score ranges from 50 to 59");
                       break;
                case "D","d":
                  
                       System.out.println("Your score ranges from 45 to 49");
                       break;
                case "E","e":
                  
                 System.out.println("Your score is in the range of 40 to 44, You can still do better!!!");
                 break;
                case "F","f":
                  
                       System.out.println("You didn't do well at all please try harder next semester");
                       
                  default:
                    System.out.println("This is not a grade, input correctly!!! ");
                }
             
               

  }
}
