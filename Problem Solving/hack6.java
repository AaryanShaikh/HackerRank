import java.util.*;
public class hack6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int count=0;
        for(int i=0;i<m;i++){
            int apple = in.nextInt();
            if (a+apple>=s && a+apple<=t) {
                count++;
            }
        }
        System.out.println(count);
        count=0;
        for(int i=0;i<n;i++){
            int orange = in.nextInt();
            if (b+orange>=s && b+orange<=t) {
                count++;
            }
        }
        System.out.println(count);
    }
}