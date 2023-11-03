import java.util.*;
public class Test11{

public static void main(String[] args){
    
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any number");
       int num = s.nextInt();
       System.out.println("Enter any Divisor:");
       int divisor = s.nextInt();
       System.out.println("Quotient is "+(num/divisor));
       System.out.println("Remainder is "+(num%divisor));
      
    }
}