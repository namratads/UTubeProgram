import java.util.*;
public class Test40{
public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter First Number");
     int num1 = sc.nextInt();
     System.out.println("Enter Second Number");
     int num2 = sc.nextInt();
     System.out.println("Enter Third Number");
     int num3 = sc.nextInt();
     if(num1>num2 && num1>num3){
        System.out.println(num1+" is Greatest number in Given three numbers");
        }
     else if(num2>num3 && num2>num1){
        System.out.println(num2+" is Greatest number in Given three numbers");
        }
     else if(num3>num1 && num3>num2){
        System.out.println(num3+" is Greatest number in Given three numbers");
        }
}
}