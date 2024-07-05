class Classes1
{  //non_void
    public static double rand()
    {
         return Math.random();
    }
   
    //Void 
    public static void randm()
    {
        System.out.println(Math.random());
    }

    public static void main(String[] args)
    {
    double result=rand();
    System.out.println(result);
    randm();

     Person myFirst = new Person();
     myFirst.descibe();
     System.out.println(myFirst.name);

    }

   
}

class Person
{
    // String name="Rodiat";
    // int age= 22;
    // double height=6.8;
    // double weight=60;


    // public void descibe()
    // {
    //     System.out.println("My name " + name + "and i am " + age + 
    //     "my height and weight are " + height + weight);
    // }

     String name;
    int age;
    double height;
    double weight;

public void descibe()
    {
        System.out.println("My name " + name + "and i am " + age + 
        "my height and weight are " + height + weight);
    }

    

//A constructor helps to define different attribute of a class


  public  Person(String myname,int myage,double myheight,double myweight)
  {
      this.name = myname;
      this.age = myage;
      this.height=myheight;
      this.weight=myweight;

  }




}

