import java.util.*;
public class Test37{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any Number");
     int num = sc.nextInt();
    
     int count = 0;
     while(num>0){
          count++;
          num = num/10;
     }
     System.out.println(count);
}
}