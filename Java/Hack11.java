import java.util.*;
import java.text.NumberFormat;
public class Hack11 {    
    public static void main(String[] args) {
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        System.out.println("US: " + u.format(payment));
        System.out.println("India: Rs."+u.format(payment).substring(1));
        System.out.println("China: " + c.format(payment));
        System.out.println("France: " + f.format(payment));
    }
}