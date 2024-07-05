class newclass
{    //using parametric construct
//declaring an instance variable
     String name;
     int age;

    public newclass(String myname,int myage)
    {  
            name = myname;
           age = myage;
    }
 public void display()  //display method
  {
    System.out.println("My name is " + name + "I am " + age +" years old");
  }

    public static void main(String[] args)
    {
            newclass animal1 = new newclass("Rodiat",24); //instantaiting an object animal1
            newclass animal2  = new newclass("Seyi",25);  //instantaiting an object animal2
            
            animal1.display();
            animal2.display();
    }
   

}