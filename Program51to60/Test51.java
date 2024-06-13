import java.util.*;
public class Test51{
public static void main(String[] args){

    int[] a = {78,67,90,45,56,12,23,89,34};
   
       System.out.println("Before sorting :"+Arrays.toString(a));

       Arrays.parallelSort(a);
        
       System.out.println("After sorting :"+Arrays.toString(a));
}
}
       