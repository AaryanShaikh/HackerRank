import java.util.*;
public class Day5 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++){
        	System.out.println(n+" x "+i+" = "+(n*i));
        }
        scanner.close();
    }
}
