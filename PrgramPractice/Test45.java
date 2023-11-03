public class Test45{

public static void main(String[] args){

   int[] a = {1,2,3,4,5};
   int[] b = {1,2,3,4,5};
   for(int i=0; i<=a.length-1; i++){
      
   if(Arrays.equals(a,b)){
      System.out.println("Given Array are Equal");
     }
   else{
       System.out.println("Given Array are not Equal");
     }
}
}