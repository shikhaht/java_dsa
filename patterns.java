//import java.util.*;



public class patterns {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.err.println("enter rows");
        //int r = sc.nextInt();
        //System.out.println("enter columns");
        //int c = sc.nextInt();

        /* int i,j; */
        

        /* Solid rectangle
                *****
                *****
                *****
                *****
        */
       /*  for(i=1; i<=r; i++){
            for(j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
         */

         /* Hollow rectangle
                *****
                *   *
                *   *
                *****
        */

        /* for(i=1; i<=r; i++){
            for(j=1; j<=c; j++) {
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

        }
        System.out.println();
    } */


         /* Half pyramid
                *
                **
                ***
                ****
        */
       /*  for(i=1; i<=r; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        /* Inverted Half pyramid
                ****
                ***
                **
                *
        */
       /*  for(i=r; i>=1; i--){
            for(j=1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        //Inverted half pyramid rotated by 180 degree
        /*
                 *
                **
               ***
              ****
         */
        int n =4;
       /*  for(i=1; i<=n; i++){
            for(j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        } */

        //Half Pyramid with numbers
       /*  1
           12
           123
           1234
           12345 */

           /* for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
           } */

           //Inverted Half pyramid
           /*
             12345
             1234
             123
             12
             1
            */

            /* for(i=5;i>0;i--){
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            } */

            //Floyd's traingle
            /*
              1
              2 3
              4 5 6
              7 8 9 10
              11 12 13 14 15
             */
           /*  int k=1;
             for(i=1;i<=5;i++){
                for(j=1;j<=i;j++){
                    
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
             } */

             //0-1 traingle
             /*
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
              */
              /* for(i=1;i<=5;i++){
                for(j=1;j<=i;j++){
                    int sum = i+j;
                    if(sum%2 == 0){
                        System.out.print("1");
                    }
                    else
                    System.out.print("0");
                }
                System.out.println();
              } */
}
}
