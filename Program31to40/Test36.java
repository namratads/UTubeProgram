import java.util.*;
public class Test36{
public static void main(String[] args){

    HashSet h = new HashSet();
    int[] a = {12,32,23,43,23,21,12,7,43,9};
    for(int i=0; i<=a.length-1; i++){

           if(h.add(a[i])){
             System.out.println(a[i]);
             }
             else{
             System.out.println(a[i]+" is duplicated");
             }
        }
}
}
