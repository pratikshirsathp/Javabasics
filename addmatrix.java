// add two matrices, use random to get values
import java.util.Random;
public class addmatrix{
  public static void main(String args[]){
    //random number generator
    Random random = new Random();
    //Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[3][3];
    int matrix2[][] = new int[3][3];
    int matrix3[][] = new int[3][3];

    for (int i=0; i<3;i++){
      for (int j=0;j<3;j++){
        matrix[i][j] = random.nextInt(9);
        matrix2[i][j] = random.nextInt(9);

      }
    }
    for (int i=0; i<3;i++){
      for (int j=0;j<3;j++){
      matrix3[i][j] = matrix[i][j]+ matrix2[i][j];
      System.out.print(matrix3[i][j]+" ");
      }
      System.out.println();

    } 

    }
}
