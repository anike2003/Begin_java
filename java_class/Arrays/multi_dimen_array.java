public class multi_dimen_array
{
    // public static void display(int mult[][])
    // {
    //    int j; int i;
    //    for (j=0; j<mult.length; j++)
    //    {   
    //      for (i=0; i<mult[j].length;i++)
             
    //    {
    //     System.out.println(mult[j][i]);
    //    }
           
           
    //    }
    // }
    
    public static int display(mult[][])
    {
       int j; int i;
      
       for (j=0; j<mult.length; j++)
       {   
         for (i=0; i<mult[j].length;i++)
             
          {
            return mult[j][i];
        } 
            }
    }  

    public static void main(String[] args)
    { 
 int array[][]= {{67},{78,897},{89,78,56},{89,74,65,78,90,67}};
      // display(array);
      result=display(array);
      System.out.println(result);
   



    }
}


