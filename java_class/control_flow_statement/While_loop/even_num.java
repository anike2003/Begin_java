//Program for printing all even numbers from 0 - 20 by increment of 3 using while loop
public class even_num
{
    public static void main (String[]  args)
    {
        int num=0; //declaring varaibles
        while (num<=20)  //while loop with condition
        { 
            num+=3;    //increment by 3
            if (num%2==0)  //condition for even numbers
            {
               System.out.println(num); //print output
            }
            
           
        }

    }
}