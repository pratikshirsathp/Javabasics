import java.utils.Scanner
public class forloop{

  public static void main(String args[]){

    for(int i=1; i<=5;i++){
      System.out.println("Hi"+ i);
      }
  //printing array
    int arr[] = new int[5];
    arr[0] = 45;
    arr[1] = 65;
    arr[2] = 15;
    arr[3] = 25;
    arr[4] = 35;
    for(int i=0;i<5;i++){
        System.out.println(arr[i]);
      }
    
    for (int num : arr)
       System.out.println(num);

  
  // user input
    Scanner sc = new Scanner(System.in);
    int arra[] = new int[4];

    for(int i=0;i<4;i++)
      arra[i] = sc.nextInt();

    for(int num:arra)
      System.out.println(num);
  
  
  
  }


}
