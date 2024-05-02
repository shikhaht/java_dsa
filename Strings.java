import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
    //String Declaration
    //String name ="shikha";
    //String fullName = "shikha Thakkar";

    Scanner sc= new Scanner(System.in);
   /*  String name = sc.nextLine();
    System.out.println("Your name is :  "+name); */

    //Concatenation
    String firstName="Shikha";
    String lastName = "Thakkar";
    String fullName = firstName + " @" + lastName;
    System.out.println(fullName);

    //String length
   /*  String firstName="Shikha";
    String lastName = "Thakkar";
    String fullName = firstName;
    System.out.println(fullName.length()); 
 */



        //charAt
        for(int i =0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //comparing two strings
        String name1 = " shikha";
        String name2 = "shikha";

        if(name1.compareTo(name2)==0){
           System.out.println("Both names are same");
       }else{
           System.out.println("Names are different");
       }
    
        
        //substring method
        int startIndex =3 ;
        int endIndex =7;
        String subStr = fullName.substring(startIndex,endIndex);
        System.out.println("Substring of Full Name from index"+startIndex+" to "+endIndex+": "+subStr);

        //toUpperCase and toLowerCase methods
        String str ="Hello World!";
        System.out.println("Original string : "+str);
        System.out.println("Converted to uppercase: "+str.toUpperCase());
        System.out.println("Converted to lowercase: "+str.toLowerCase());

        //trim() - it is used to remove the leading and trailing spaces in a string
        String trimmedStr= "   Hello World!   ";
        System.out.println("Trimmed string : "+trimmedStr.trim());

        //indexOf & lastIndexOf
        String findStr="World";
        int indx= fullName.indexOf(findStr);
        System.out.println("First occurrence of 'World' starts at index : "+indx);

        int lastIndx= fullName.lastIndexOf(findStr);
        System.out.println("Last occurrence of 'World' starts at index : "+lastIndx);
    


    }
}

