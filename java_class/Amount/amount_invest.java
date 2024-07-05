//Program for calculating amount invested
import java.util.Scanner;
class amount_invest
{

    public static void main(String[] args)
    {   //Accept input from the users and declare variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the number of years you invested ");
        int n= scan.nextInt();//number
      double R = (15/100); //rate
      double sum=0;
      double P[] = new double[n];  //declaring principal in an array
       System.out.println("Pls enter the principal of investment ");
      for (int i = 0; i<n; i++)
      {
        P[i]=scan.nextDouble();

      }
       for (int i = 0; i<n; i++)  
      {
         double A = Math.pow((P[i] * (1 + R )),n);  //calculating amount invested
         System.out.println( " Amount for year " + (i+1) + " = " + "$" + A);
           sum = sum + A; //amount total
           
     }
      

System.out.println("The total sum of your investment for " + n + " years = " + "$" + sum); //print total amount invested


       






















    }
}