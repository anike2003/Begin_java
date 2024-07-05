import java.util.Scanner;
class stu_score
{
public static void main(String[] args)
{
    Scanner scan =new Scanner(System.in);
    System.out.println("Dear student how many courses are you offering: ");
   int score_num = scan.nextInt();

    double stu_score[]=new double[score_num];
    int counter;
    double sum=0;
    double mean; double SD; double Xsum; double XXsum=0;
    System.out .println("Dear student you may enter your score:");
    for (counter=0; counter<score_num; counter++ )
    {
       stu_score[counter] = scan.nextDouble();
    }
    System.out.println("Your scores are ");
    for (counter=0; counter<score_num; counter++ )
    {
        System.out.println((counter+1) + "    " + stu_score[counter]);
        sum = sum + stu_score[counter];
        Xsum= (stu_score[counter] - (sum/score_num));
       XXsum = XXsum + Xsum;

     
    
    }

    System.out.println("The mean of all your scores is ");
        mean = sum / score_num;
    System.out.println(mean);

     System.out.println("The Standard deviation is ");
      
        SD = Math.sqrt( (Math.pow(XXsum,2))/score_num);
    System.out.println("SD = " + SD);
   

}
}