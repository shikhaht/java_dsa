import java.util.*;

public class factfunc {
    public static void fact(int a){

        if(a<0){
            System.out.println("Invalid Number");
            return;
        } else{
        int fact =1;
        for(int i=a;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("The factorial of "+a+" is: " +fact);
        
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        fact(a);
    }
    
}
