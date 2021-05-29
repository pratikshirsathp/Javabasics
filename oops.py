
//every class inherit a class 'object'

//child class method hiding method of parent class then its called method overriding

class Alien{
  ///encapsulate data and access with methods
  private String name;
  private String tech;
  private int exp;
  private String laptop;

  //getters and setters
  public String getname(){
    return name;
  }
  public void setname(String name){
    this.name = name;

  }

  public String toString()
  {
   return "I'm over-riding tostring method from parent class";
  }

  public void buildProject()
  {
    System.out.println("in this method");
  }
}

public class oops{

  public static void main(String[] args){

    Alien obj = new Alien();
    obj.setname("Pratik");
    //String a = obj.getname();
    System.out.println(obj);
    }
}
