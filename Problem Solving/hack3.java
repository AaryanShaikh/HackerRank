import java.util.*;
public class hack3{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int size = in.nextInt();
		for (int i=0;i<size ;i++ ) {
			for (int j=0;j<size ;j++ ) {
				if (j>=(size-1)-i) {
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}