import java.util.*;

public class Test6{

public static void main(String[] args){

        Scanner s = new Scanner(System.in);
      System.out.println("Enter number");
        int a = s.nextInt();
             
       for(int i=1; i<=10; i++){
         
            System.out.println(a + " X " + i + "= " + (a*i));
         }
      s.close();
}
}