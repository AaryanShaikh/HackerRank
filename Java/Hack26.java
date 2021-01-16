import java.util.*;
public class Hack26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\Z");
        String s = in.next().trim();
        if (s.length() > 0) {
            String strsplit[] = s.split("[!,?._'@\\s]+");
            System.out.println(strsplit.length);
            for(String x : strsplit) {
                System.out.println(x);
            }
        } else {
            System.out.println(0);
        }
    }
}
