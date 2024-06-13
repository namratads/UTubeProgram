import java.util.*;
public class Test49{
public static void main(String[] args){

    int[] a = {12,23,34,45,56,67,78,89,90};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number");
    int num = sc.nextInt();
    sc.close();
    for(int i=0; i<=a.length-1; i++){
        if(num==a[i]){
          System.out.println("Given number is "+num+" present in Array and its Index number is "+i);
          }
        
      }
   }
}