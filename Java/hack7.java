import java.util.*;
public class hack7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int res;
		for (int i=1;i<=10 ;i++ ) {
			res = num*i;
			System.out.println(num+" x "+i+" = "+res);
		}
	}
}