//creating a class
class Alien{
  //Properties
  String name;
  String tech;
  int exp;
  String laptop; 
  
  //constructor
  public Alien() // default constructor
  {
    System.out.println("this is a constructor")
  }
  //if passed parameter 
  public Alien(int exp)
  {
    System.out.println("");
  }

  // method
  public void Makeproject()
  {
    System.out.println("Writing code");
  }
}

public class classjava{
  public static void main(String args[]){

    Alien al = new Alien(); //Constructor
    al.name = "Pratik shirsath";
    al.tech = "Java";
    al.exp = 1;
    al.laptop= "Macbook Air";

    System.out.println(al.laptop);
    al.Makeproject();

  }
}
