import java.util.*;
public class hack10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		int temp=0;
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
			if (arr[i] < 38) {
				continue;
			}
			else{
				temp = arr[i]/5;
				temp++;
				temp *= 5;
				if ((temp - arr[i]) < 3) {
					arr[i] = temp;
				}
				else{
					continue;
				}
			}
		}
		for(int i =0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}