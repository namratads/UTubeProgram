import java.util.*;
public class Test13{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Nmuber");
     int num = sc.nextInt();
     int num1 = num;
    System.out.println("Enter Power");
     int power = sc.nextInt();
    for(int i=1; i<power; i++){
           num = num*num1;
       System.out.println(num);
      }
}
}