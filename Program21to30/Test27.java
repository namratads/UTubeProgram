import java.util.*;
public class Test27{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any String");
     String str = sc.nextLine();
     char[] ch = str.toCharArray();
      String reverseString = "";
     for(int i=str.length()-1; i>=0; i--){
            reverseString = reverseString + ch[i];
            }
           System.out.print(reverseString);
       if(str.equals(reverseString)){
           System.out.print("Input String is a Palindrome");
       }else{
           System.out.print("Input String is not a Palindrome");
            }  
}
}