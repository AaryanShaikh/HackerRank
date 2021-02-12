import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i=arr.length-1;i>=0;i++){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
