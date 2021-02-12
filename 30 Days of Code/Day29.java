import java.util.*;
public class Day29{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {
            int max = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int a = 1; a < n-1; a++) {
                for (int b = a+1; b <= n; b++) {
                    int val = a&b;
                    if (val > max && val < k) 
                        max = val;                    
                }    
            }
            System.out.println(max);
        }
    }
}