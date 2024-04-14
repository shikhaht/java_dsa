import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the number to check whether the number is odd or even");

        if(x % 2 == 30){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
