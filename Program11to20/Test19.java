import java.util.*;
public class Test19{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Width of Rectangular");
     int width = sc.nextInt();
     System.out.println("Enter Length of Rectangular");
     int length = sc.nextInt();
     int perimeter = 2*(width+length);
     System.out.println("Perimeter of Rectangular is :"+perimeter);
}
}