import java.util.*;

public class mulnumfunc {

    public static float result(float a, float b){
        float mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to multiply");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float mul = result(a,b);
        System.out.println(mul);
    }
    
}
