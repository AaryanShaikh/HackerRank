import java.util.*;
public class Hack24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println((new StringBuffer(s).reverse().toString().equals(s))?"Yes":"No");
    }
}