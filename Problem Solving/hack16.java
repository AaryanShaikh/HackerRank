import java.util.*;
public class hack16 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int year = in.nextInt();
       String res = "";
       System.out.println((year == 1918)?"26.09.1918":(!((year % 4 != 0)||(year > 1918 && year % 100 == 0 && year % 400 != 0)))?"12.09."+Integer.toString(year):"13.09."+Integer.toString(year));
    } 
}