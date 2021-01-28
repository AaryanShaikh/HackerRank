import java.util.*;
public class hack17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        int k = in.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int b = in.nextInt();
        int sum = (Arrays.stream(arr).sum()-arr[k])/2;
        System.out.println((sum==b)?"Bon Appetit":Math.abs(sum-b));
    }
}