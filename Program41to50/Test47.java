public class Test47{

public static void main(String[] args){

int[] a = {1,2,4};
int count1 = 0;
int count2 = 0 ;
for(int i=1; i<=4; i++){

   count1 = count1 + i;
} 
for(int i : a){
  
   count2 = count2 + i;
   
} 
int misEle = count1-count2;

System.out.println("The Missing Element is "+misEle );
}
}

  
