import java.util.*;
public class TestSecond65{

public static void main(String[] args){

     Scanner s = new Scanner(System.in);
                System.out.println("Given number of seconds");
           int sec = s.nextInt();
           int hr = s.nextInt();
           int hour = hr/60;
           int min = s.nextInt();
           int minute = min/60;
System.out.println("Given number of seconds means "+ hour+" : "+minute+" : "+sec);
           



}
}