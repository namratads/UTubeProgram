import java.util.*;
public class Test25{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any Number");
     int num1 = sc.nextInt();
     int a = 0;
     int b = 1;
     
     for(int i=a; i<=num1; i++){
         int c = a + b;
         System.out.println(c);
         a = b;
         b = c;
       }
}
}