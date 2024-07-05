import java.util.Scanner;
class stu_score2
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of Student");
    int stu_num = scan.nextInt();

// creating an array in the memory of the length
int score[] = new int[stu_num];
System.out.println("Enter score of the array");
int i;
for (i=0; i<stu_num; i++)
{ //reading array element from the user
   score[i]=scan.nextInt();
  
}
 System.out.println("The scores for the array are ");

// accessibg array element using the loop
for (i=0; i<stu_num; i++)
{
 System.out.println( score[i]);
}







 }

}