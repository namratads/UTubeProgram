import java.util.*;
public class Test28{
public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Any Number");
   int num = sc.nextInt();
   int number = num;
   int rev = 0;
   while(number!=0)
     {
       int reminder  = number % 10;
        rev = (rev * 10)+ reminder;
        number = number/10;
      }
   System.out.println(rev);
     if(num==rev)
        {
         System.out.println(num+" is given Number palindrome");
        }
       else
        {
         System.out.println(num+"is given Number not palindrome");
        }  
 }
}