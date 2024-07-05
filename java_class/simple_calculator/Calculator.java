//Program of a simple calculator
public class Calculator
{
    public static void main(String[] args)
    {   //declaring variales
        int num1=10;
        int num2=18;
        int sum=num1 + num2;  //sum of num1 and num2
        int diff=num1-num2;  //difference of num1 and num2
        int prod=num1 * num2;  //product of num1 and num2
        int div=num1 / num2;  //division of num1 and num2
        int modl=num1 % num2;   //modulus of num1 and num2
        
        System.out.println("The sum of two numbers is " + sum); //print sum
         System.out.println("The difference of two numbers is " + diff); //print differnce
          System.out.println("The product of two numbers is " + prod);   //print product
           System.out.println("The division of two numbers is " + div);  //print division 
            System.out.println("The modulus of two numbers is " + modl);  //print modulus
  } 
}