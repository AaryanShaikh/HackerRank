import java.util.*;
public class hack13{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int a[] = new int[in.nextInt()];
        int count = 0;
        for(int i=0; i < n; i++){
            int number = in.nextInt() % a.length;
            count += a[a.length-(number == 0 ? a.length : number)];
            a[number] += 1;
        }
        System.out.println(count);
	}
}