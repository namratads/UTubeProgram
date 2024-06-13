import java.util.*;
public class Test32{
public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number");
      int number = sc.nextInt();
      int fact = 1;
      for(int i=1; i<=number; i++){
              fact = fact * i;
            }
          System.out.println("Factorial of given Number is "+fact);
}
}