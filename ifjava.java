public class ifjava{
  public static void main(String args[]){

    int marks = 12;
    char m = 's';

    if (marks > 40 && m =='s')
      System.out.println("very good");
    else if (marks > 30)
      System.out.println("good");
    else
      System.out.println("study");

    //greatest in tree nums
    int a = 52;
    int b = 14;
    int c = 133;

    if (a>b && a>c)
      System.out.println("a is the greatest");
    else if (b>a && b>c)
      System.out.println("b is the greatest");
    else
      System.out.println("c is the greatest") ;

    // Even Or Odd
    // optional 
    // result = a %2 == 0?"even":"odd";
    String result = "";
    if(a % 2 == 0)
      result = "Even";
    else
      result = "Odd";
    System.out.println("a is an "+ result +" number");


  }
}
