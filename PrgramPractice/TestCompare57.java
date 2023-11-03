import java.util.*;
public class TestCompare57{

public static void main(String[] args){

           Scanner s = new Scanner(System.in);

              System.out.println("Enter Number");
              int num1 = s.nextInt();
              int num2 = s.nextInt();
    
                  if(num1>num2){
                        System.out.println(num1+ " is greater than "+num2);
                     }
                  else if(num1<num2){
                         
                        System.out.println(num1+ " is smaller than "+num2);
                     }
                  else{
                          
                       System.out.println(num1+ " is equal to "+num2);
                      }
       }
}