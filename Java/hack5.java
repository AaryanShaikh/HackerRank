import java.util.*;
public class hack5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		int max=0;
		for (int i=0;i<size ;i++ ) {
			arr[i] = in.nextInt();
			if (i==0) {
				max = arr[i];
			}
			else{
				if (arr[i]>max) {
					max = arr[i];
				}
			}
		}
		int count=0;
		for (int i=0;i<size ;i++ ) {
			if (arr[i]==max) {
				count++;
			}
		}
		System.out.println(count);
	}
}