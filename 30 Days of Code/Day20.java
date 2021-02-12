import java.util.*;
public class Day20{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
    }
}