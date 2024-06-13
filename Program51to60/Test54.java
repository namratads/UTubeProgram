import java.util.*;
public class Test54{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter any Text");
String str = sc.nextLine();
sc.close();
char[] ch = str.toCharArray();
int count = 0;
for(char c :ch){
   count++;
}
System.out.println(count);
}
}
 