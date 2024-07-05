import java.util.Scanner;
public class input_loop
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a number >>> ");
      int num = scan.nextInt();
       
       for(int i =0; i<= num+1;  i+=2)
       {  
         
          System.out.println(i);
       }

       for (int i = 0; i<=num; i++)
       {
        if(i % 2!=0)
        {
            System.out.println(i);
        }
       }


    }
}