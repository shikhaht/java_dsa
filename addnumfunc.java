import java.util.*;

public class addnumfunc {

    public static int result(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = result(a,b);
        System.err.println(sum);
    }
    
}
