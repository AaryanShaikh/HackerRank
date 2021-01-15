import java.util.*;
public class hack1{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int size = in.nextInt();
		int arr[][] = new int[size][size];
		for (int i=0;i<size ;i++ ) {
			for (int k=0;k<size ;k++ ) {
				arr[i][k] = in.nextInt();
			}
		}
		int sum1,sum2;
		sum1=sum2=0;
		for (int i=0;i<size ;i++ ) {
			for (int k=0;k<size ;k++ ) {
				if (i==k) {
					sum1 += arr[i][k];
				}
			}
		}
		int temp = size;
		int start = 0;
		for (int i=0;i<size ;i++ ) {
			for (int k=0;k<size ;k++ ) {
				if(i==start&&k==temp-1){
					sum2 += arr[i][k];
					temp--;
					start++;
				}
			}
		}
		System.out.println(Math.abs(sum1-sum2));
	}
}
