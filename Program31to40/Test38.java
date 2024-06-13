import java.util.*;
public class Test38{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any Number");
     int num = sc.nextInt();
     int sum = 0;
     while(num>0){
           int reminder = num%10;
              int a = reminder;
               num = num/10;
               sum = sum+a;
      }
     System.out.println(sum);
}
}