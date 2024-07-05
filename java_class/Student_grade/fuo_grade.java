//Program of fountain university student grade
import java.util.Scanner;
class fuo_grade
{
    public static void main(String[] args)throws Exception
    {   //Accepting input from users
       try( Scanner scan = new Scanner(System.in)){
        System.out.println("Please enter your score: ");
        double score = scan.nextDouble(); //declare score
        //use of else if statement 
        if (score >= 70 && score<100)
        
            System.out.println("Bravo!!! Your grade is A");

        else if (score>=60 && score<70)
            System.out.println("Your grade is B, buckle up for distintion, you can do it ");

        else if(score>=50 && score<60)
            System.out.println("Your grade is C, Keep it up, you can do better");

        else if(score>=45 && score<50)
            System.out.println("Your grade is D, Try harder next time ");

        else if(score>=40 && score<45)
            System.out.println("Your grade is E,Try more harder next time");

        else 
            System.out.println("Your grade is F,Always read hard and pray");
            
       
           
       }catch(Exception e){
             System.out.println("Error:A number is required");
       }
    //    finally {
           
    //     System.out.print("╰(*°▽°*)╯");
       
       
       
    }






}