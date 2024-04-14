import java.util.*;

//take matrix as input from user . search for given numbers x and print indices at which it occurs.

public class matrixsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                 matrix[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i =0; i<rows; i++){
            for(int j=0; j<cols; j++){
                 if( matrix[i][j] == x){
                    System.out.println("x found at location" + i + " , "+ j ); 
                 }
            }
        }
    }
    
}
