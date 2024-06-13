import java.util.*;
public class Test31{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any Number");
    int num = sc.nextInt();
    sc.close();
    int orignalNumber = num ;
    int armNum = 0;
    while(num>0){
         int reminder = num % 10;
         
         armNum = armNum + (reminder*reminder*reminder);
         num = num/10;
      }
    if(orignalNumber==armNum){
       System.out.println(orignalNumber+" given number is Armstrong Number");
     }else{
       System.out.println(orignalNumber+" given number is not Armstrong Number");
     }
}
}