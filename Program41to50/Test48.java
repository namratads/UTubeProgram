public class Test48{
public static void main(String[] args){

   int[] num = {11,43,65,83,23,98,31};
   int max = 0;
   int min = 0;
   for(int i=0; i<=num.length-1; i++){
       int num1 = num[i];
       if(max<num1){
          max = num1;
         }
       else if(min>num1){
          min = num1;
         }
    }
    System.out.println("Maximum number in Array is "+max);
    System.out.println("Minimum number in Array is "+min);
}
}