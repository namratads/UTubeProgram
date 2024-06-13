import java.util.*;
public class Test33{
public static void main(String[] args){

int[] numbers = {3,5,7,4,8,9,6,3,6,2,7,9};
Set<Integer> s = new HashSet<Integer>();
     for(int i=0; i<numbers.length; i++) {
             s.add(numbers[i]);
        }
System.out.println(s);

}
}