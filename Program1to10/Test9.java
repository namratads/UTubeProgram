import java.util.*;

public class Test9{

public static void main(String[] args){

        Scanner s = new Scanner(System.in);
      System.out.println("Enter any character");
         char alpha = s.next().charAt(0);
         if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u'){
          System.out.println("Given character " + alpha + " is vowel ");
        }else{
          System.out.println("Given character " + alpha + " is not vowel ");
         }
}
}