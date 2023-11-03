public class Test26{
public static void main(String[] args){

     String str = "namrata";
     int len = str.length();
     char[] ch = str.toCharArray();
     System.out.println(len);
     for(int i=len-1; i>=0; i--){
          System.out.print(ch[i]);
    }
}
}