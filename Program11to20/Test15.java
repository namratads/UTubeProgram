import java.util.*;
public class Test15{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter six different number");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();
    int num5 = sc.nextInt();
    int num6 = sc.nextInt();
   
System.out.println("Average of given six numbers is : "+((num1+num2+num3+num4+num5+num6)/6));
}
}