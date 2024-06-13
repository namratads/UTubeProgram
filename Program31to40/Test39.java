import java.util.*;
public class Test39{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any Number");
     int num = sc.nextInt();
     int countEven = 0;
     int countOdd = 0;
     while(num>0){
           int reminder = num%10;
              int a = reminder;
               num = num/10;
               if(a%2==0){
                 countEven++;
                 }
                 else{
                  countOdd++;
                  } 
      }
System.out.println("In given number having "+countEven+" Even digits and "+countOdd+" Odd digits");
}
}