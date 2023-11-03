import java.util.*;
public class Test97{
public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Statement");
      String str = sc.nextLine();
      String[] word = str.split(" ");    
     
      int numberOfWords = word.length;

       System.out.println(numberOfWords);
}
}