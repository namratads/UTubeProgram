import java.util.*;
public clss Test24{
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
System.out.pritnln("Enter any statement having number of letter,digit spaces and other things");
      String statement = sc.nextLine();
   
      int letters = sc.nextInt();
      int digits = sc.nextInt();
      int spaces = sc.nextInt();
      int splcharacter = sc.nextInt();
      char[] num = statement.toCharAt();
      System.out.println(num);
}
}