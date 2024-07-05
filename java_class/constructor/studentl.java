public class student
{   String name;
    String matric_num;
    String email;
    String address;

    public student(String stu_name,  String stu_matric_num,  String stu_email, String stu_address)
    {
        name=stu_name;
        matric_num=stu_matric_num;
        email=stu_email;
        address=stu_address;
    }
    public void printData()
    {
        System.out.println("my name " + stu_name + " matric number " + stu_matric_num + " " + stu_email + " " + stu_address );
    }

    public static void main(String[] args)
    {

     student ObjS1 = new student("tolu","fuo/22/089","jrdiuj","drgjoir");
     student ObjS2 = new student("tiop","fuo/22/948","dgioj","odkooikot");

     ObjS1.printData();
     ObjS2.printData();

    }
}