import java.util.*;
public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0,max=Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2];//Top
                sum+=arr[i+1][j+1];//Middle
                sum+=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];//bottom 
                max = Math.max(sum, max);
                sum=0;   
            }
        }
        System.out.println(max);
    }
}
