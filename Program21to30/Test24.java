import java.util.*;
public class Test24{
public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
System.out.println("Enter any statement having number of letter,digit spaces and other things");
      String str = sc.nextLine();
      char[] ch = str.toCharArray();  
      int digits = 0;
      int letters = 0;
      int spaces = 0;
      int specialChar = 0;
      for(char c1 : ch)
         {
	     if(Character.isDigit(c1))
	       {
	    	  digits++;
	       }
	     else if(Character.isLetter(c1))
	      {
	       	  letters++;
       	      }
	     else if(Character.isSpaceChar(c1))
  	     {
	          spaces++;
	     }
	     else
	     {
	    	  specialChar++;
	     }
	 }
	      System.out.println("The Number of digits in given Statement is "+digits);
	      System.out.println("The Number of letters in given Statement is "+letters);
	      System.out.println("The Number of spaces in given Statement is "+spaces);
	      System.out.println("The Number of specialChar in given Statement is "+specialChar);
	}
}