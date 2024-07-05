//Program of a simple calculator
import java.util.Scanner;
public class Calculator_input{
    public static void main(String[] args){   
    //declaring variales
      Scanner scan = new Scanner(System.in);
      System.out.println("|Enter the first number:");
         double num1 = scan.nextDouble();
      System.out.println("Enter the first number:");
         double num2= scan.nextDouble();
         double sum = num1 + num2;  //sum of num1 and num2
         double diff = num1 - num2;  //difference of num1 and num2
         double prod = num1 * num2;  //product of num1 and num2
         double div = num1 / num2;  //division of num1 and num2
         double modl = num1 % num2;   //modulus of num1 and num2
         double expo =Math.pow(num1,num2);  //Exponential of num1 to num2
        System.out.println("The sum of two numbers is " + sum); //print sum
         System.out.println("The difference of two numbers is " + diff); //print differnce
          System.out.println("The product of two numbers is " + prod);   //print product
           System.out.println("The division of two numbers is " + div);  //print division 
            System.out.println("The modulus of two numbers is " + modl);  //print modulus
              System.out.println("The exponential of first number raise 
                                 to the power of second number is " + expo); //print exponetial
  } 
}