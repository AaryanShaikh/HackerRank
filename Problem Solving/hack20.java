import java.util.*;
public class hack20{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       in.nextLine();
       String str = in.nextLine();
       int lv=0,vall=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='U') lv++;
           if(str.charAt(i)=='D') lv--;
           if(str.charAt(i)=='U'&&lv==0) vall++;
       }
       System.out.println(vall);
    }
}