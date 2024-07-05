import java.util.Scanner;
class gpa
{
    public static void main(String[] args)
{
   Scanner scan =new Scanner(System.in);
   System.out.println("How many course are you offering: ");
   int Tot_course_num = scan.nextInt();
       int num;    int QP;   int sum=0;
       int point;  int TCU=0;  int TU;
      int total=0;  int TQCU=0;  double GPA; int i;
   
   for (num=1; num<=Tot_course_num; num++)
   {
     System.out.println("Course title:");
      String course_title = scan.next();
     System.out.println("Enter grade for course title");
      String grade = scan.next();
     System.out.println("Enter credit unit for the course");
       int CU[] = scan.nextInt();

   if(  CU<=0 && CU>5)
   {
    System.out.println("Enter valid credit unit");
   }
   else 
   {
    if (grade =="A")
    {
   
    point = 5;
    QP = (point * CU);
    
   }
   else if (grade=="B")
   {
    point = 4;
    QP = (point * CU);
    
   }
   else if (grade=="C")
   {
    point = 3;
    QP = (point * CU);
     
   }
   else if (grade=="D")
   {
    point = 2;
    QP = (point * CU);
     
   }
   else if (grade=="E")
   {
    point = 1;
    QP = (point * CU);
     
   }
   else 
   {
    point = 0;
    QP = (point * CU);
     
   }
}
  
   

  for (i=0; i<=5; i++)
    {
      sum = sum + CU[i];
      
    }
    system.out.println(sum);
    // for (TU=0; TU>=0; TU++)

    //   {
    //     TU =  TU + QP;

    //   }
  
    // GPA = (sum / TU) ;
    // System.out.println("Your GPA for this semester is " + GPA);
    
   
   

   
   
   }
 
  //System.out.println("Your GPA for this semester is " + GPA);
   
   

   


}





    
}
