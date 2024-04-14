import java.util.*;

public class searchnumprintindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =  sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter elements in array: ");

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("enter the value to be searched");

        int x = sc.nextInt();

        for(int i =0; i<size; i++){
            if(num[i] == x){
                System.out.println("The number is found at index "+i+".");
        }
        
    }
}
}
