public class Test42{
public static void main(String[] args){

   int[] num = {11,12,13,14,15,16,17,18,19,20};
     int num1 = 0;
     for(int i=0; i<=num.length-1; i++){
        num1 = num[i];
         if(num1%2==0){
            System.out.println("Even elements in Array is "+num1);
           }
         else if(num1%2==1){
            System.out.println("Odd elements in Array is "+num1);
           }
    }       
}
}