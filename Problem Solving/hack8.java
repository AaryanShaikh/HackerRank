import java.util.*;
public class hack8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[in.nextInt()];
        int b[] = new int[in.nextInt()];
        for(int i=0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        for(int i=0; i < b.length; i++){
            b[i] = in.nextInt();
        }
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        System.out.println(count);
    }   
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static int gcd(int input[]) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    private static int lcm(int input[]) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}