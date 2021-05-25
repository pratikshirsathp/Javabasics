// "static void main" must be defined in a public class.

class Alien{
    
    private String name;
    private String tech;
    private int exp;
    private String laptop;
    
    //encapsulation getters and setters
    public String getname()
    {
        return name;
    }  
    public void settech(String tech)
    {
        this.tech = tech;
    }
    public String gettech()
    {
        return tech;
    }  
    public int getexp()
    {
        return exp;
    }  
    public String getlaptop()
    {
        return laptop;
    }  
    //constructor
     public Alien()
    {
        System.out.println("in alien");
    }
    
    public Alien(String name,String tech, int exp, String laptop)
    {
        this.name = name;
        this.tech = tech;
        this.exp = exp;
        this.laptop = laptop;
    }
}



public class encaps {
    public static void main(String[] args) {
        System.out.println("YO");
        
        Alien al = new Alien("Pratik", "Java", 3, "macbook");
        
        al.settech("Python bitch");
        System.out.println(al.getname());
        System.out.println(al.gettech());
        System.out.println(al.getexp());
        System.out.println(al.getlaptop());
        
        
        
    }
}
