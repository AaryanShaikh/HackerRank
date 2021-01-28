import java.util.*;
public class hack24{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String arr[] = in.nextLine().split(" ");
		int frequency[] = new int[101];
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
			frequency[Integer.parseInt(arr[i])]++;
		for (int i = 1; i <= 100; i++)
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		System.out.println(result);
	}
}