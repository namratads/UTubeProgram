import java.util.*;
public class OddEven63{

public static void main(String[] args){

      Scanner s = new Scanner(System.in);
          System.out.println("Enter Any Number");
       int num = s.nextInt();
             if(num%2==0){
                     System.out.println(num+" is Even");
              }
             else{
                     System.out.println(num+" is Odd");
               }
}
}