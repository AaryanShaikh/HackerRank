import java.util.*;
public class hack2{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		double pos,neg,zero;
		pos = neg = zero = 0.0;
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
			if (arr[i]>0) {
				pos++;
			}
			else if (arr[i]<0) {
				neg++;
			}
			else{
				zero++;
			}
		}
		double res1 = pos/(double)size;
		double res2 = neg/(double)size;
		double res3 = zero/(double)size;
		System.out.format("%4f", res1);
		System.out.println();
		System.out.format("%4f", res2);
		System.out.println();
		System.out.format("%4f", res3);
	}
}