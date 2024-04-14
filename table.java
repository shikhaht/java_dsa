import java.util.*;


public class table {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int pro =1;
        for(i=1 ;i<=10;i++){
            pro=n*i;
            System.out.println(n + "*" + i + "=" + pro);
        }
    }
}
