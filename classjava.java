//creating a class
class Alien{
  //Properties
  String name;
  String tech;
  int exp;
  String laptop; 

  // method
  public void Makeproject()
  {
    System.out.println("Writing code");
  }
}

public class classjava{
  public static void main(String args[]){

    Alien al = new Alien();
    al.name = "Pratik shirsath";
    al.tech = "Java";
    al.exp = 1;
    al.laptop= "Macbook Air";

    System.out.println(al.laptop);
    al.Makeproject();

  }
}
