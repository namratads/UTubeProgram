public class Test21{
public static void main(String[]args){

     //String name = "deepak";--NumberFormatException

     String s = "111";
     int num = Integer.parseInt(s);
     System.out.println(num);
     //OR
     int num1 = Integer.valueOf(s);
     System.out.println(num1);
     //-----print--111
     System.out.println(s+11);//--s in String so '+' operator consider append--print--11111
     System.out.println(num+11);//num in int so '+' operator consider addition--print--122
     
}
}