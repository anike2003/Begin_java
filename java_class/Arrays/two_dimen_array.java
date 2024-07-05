class two_dimen_array
{
  public static void main(String[] args)

  {
   int stu_array[][] = {{60,67,59,40,76},{79,69,60,37,58},{56,58,34,21,49}};
//loop for average of rows
   for (int row=0; row<stu_array.length; row++)
  {
      int row_sum=0;
       int col;
       for (col=0; col<stu_array[row].length; col++)
       {
          row_sum +=stu_array[row][col]; //sum of rows
       
          
       }
      
double avg=row_sum/stu_array.length;//avg rows
System.out.println("Average row" + (row+1) + ":" + avg);//print avg rows
}
 
System.out.println();

//loop for average of columns
 for (int row=0; row<stu_array.length; row++)
  {   
       double col_sum=0;
       int col;
       for (col=0; col<stu_array.length; col++)
       {
          //System.out.println((col+1) + ":" + stu_array[col][row]);
          col_sum += stu_array[col][row]; //sum of columns
       }

double avg1=col_sum/stu_array.length;  //avg columns
System.out.println("Average col" + (col + 1) + ":" + avg1); //print avg columns

  }











  }





}


 