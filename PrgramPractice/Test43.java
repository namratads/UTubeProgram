import java.util.*;
public class Test43{
public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number");
      int num = sc.nextInt();
      int reminder = 0;
      int reversenum = 0;
      while(num>0){
      reminder = num % 10;
      reversenum = reversenum*10 + reminder;
      num = num / 10;
      }
      System.out.println(reversenum);
}
}