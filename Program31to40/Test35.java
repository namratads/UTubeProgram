public class Test35{
public static void main(String[] args){

   int[] num = {7,4,9,2,7,4,5,8};

   for(int i=0; i<=num.length-1; i++){
       for(int j=i+1; j<=num.length-1; j++){
          if(num[i]==num[j]){
             System.out.println("Duplicate element in Array is "+num[i]);
              }
            }
          }
}
}