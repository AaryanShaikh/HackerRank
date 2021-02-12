import java.util.*;
public class Day9 {
    static int factorial(int n) {
        return (n>1)?n * factorial(n - 1):1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(in.nextInt()));
        in.close();
    }
}