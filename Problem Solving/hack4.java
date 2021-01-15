import java.util.*;
public class hack4{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		long arr[] = new long[5];
		for (int i=0;i<5 ;i++ ) {
			arr[i] = in.nextInt();
		}
		long temp;
		for (int i=0;i<5 ;i++ ) {
			for (int j=i+1;j<5 ;j++ ) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		long min,max;
		min=max=0;
		for (int i=0;i<4 ;i++ ) {
			min+=arr[i];
		}
		for (int i=4;i>0 ;i-- ) {
			max+=arr[i];
		}
		System.out.println(min+" "+max);
	}
}