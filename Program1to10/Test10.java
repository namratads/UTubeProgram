import java.util.*;

public class Test10{

public static void main(String[] args){
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of the Circle");
        double radius = s.nextInt();
        double area = pi * radius * radius;
         System.out.println("Area of circle is "+ area );
      
}
}