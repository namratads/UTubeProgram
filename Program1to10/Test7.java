import java.util.*;

public class Test7{

public static void main(String[] args){

        Scanner s = new Scanner(System.in);
      System.out.println("Enter Any Year");
        int year = s.nextInt();
       if(year%400==0 && year%100==0){
           System.out.println("Given Year "+year  + " is Leap Year");
          }
      else if(year%4==0){
           System.out.println("Given Year "+year  + " is Leap Year");
          }
      else{
           System.out.println("Given Year "+year  + " is not Leap Year");
          }
}
}