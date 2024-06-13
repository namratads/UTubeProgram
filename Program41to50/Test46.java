public class Test46{

public static void main(String[] args){

int[] a = {1,2,3,4};

int[] b = {1,2,3,4};
 
boolean array = true;

for(int i=0; i<a.length; i++){

   if(a[i]==b[i]){
       
       array = true;
    }
    else{

       array = false;
    }
 }

  if(array){
    System.out.println("Array ara Equal");
   }else{
    System.out.println("Array ara not Equal");
   }
}
}