import java.util.*;
public class Test55{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Statement");
String stat = sc.nextLine();
String s = "";
String[] str = stat.split(" ");
for(String sr : str){
   char[] c = sr.toCharArray();
   for(int i=c.length-1; i>=0; i--){
        s = s + c[i];
        s =  s + " ";
       }
    }
    System.out.println(s+" ");
  }
}
       