import java.util.*;

public class Test5{

public static void main(String[] args){

        Scanner s = new Scanner(System.in);
      System.out.println("Enter any number");
        int a = s.nextInt();

      if(a%2==0){
           System.out.println("Given number " + a + "is " + "Even");
       }else
       {
           System.out.println("Given number " + a + "is " + "Odd");
       }
}
}