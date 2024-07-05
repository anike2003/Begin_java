import java.util.Scanner;
// Program to print student score in ascending order
class one_dimen_array
{
    public static void main(String[] args)
    {

int k =0; 
int j;
   int score[] = {85,79,78,67,89,72,67,56,90,66};
   int i;
   for (i=0; i< score.length; i++)
   { 
    for (j=i+1; j<score.length; j++)
    {
        if (score[i] > score[j]) //for acsending    //for descending   if (score[i] < score[j]) 
        {
            k= score[i];
            score[i]=score[j];
            score[j]=k;
          
        }


    }
     
      System.out.println(score[i]);

    //Displaying sorted array
    
   }
   
    
     }

    }
