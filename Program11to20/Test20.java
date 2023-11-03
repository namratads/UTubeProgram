import java.util.*;
public class Test20{

public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any number");
     int number = sc.nextInt();
     int sum = 0;
     while(number!=0){
         int reminder = number % 10;
         sum = sum + reminder;
         number = number/10;
        }
      System.out.println("The Sum of all digits in given Number is "+sum);
    
  }
}
