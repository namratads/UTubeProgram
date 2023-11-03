import java.util.*;

public class LeapYear{

public static void main(String[] args){

        Scanner s = new Scanner(System.in);
      System.out.println("Given Year");
        int year = s.nextInt();
          if(year%4==0){
                
                 if(year%100==0){
                
                          if(year%400==0){
                             System.out.println("Given Year "+ year + " is Leap Year");    
                          }else{
                             System.out.println("Given Year "+ year + " is not Leap Year");
                               }
                 } else{
                       System.out.println("Given Year "+ year + " is Leap Year");
                       }
            }else{
                 System.out.println("Given Year "+ year + " is not Leap Year");
                  }
           }
}
