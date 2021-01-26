import java.util.*;
public class hack12{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c[] = new int[in.nextInt()];
		for(int i=0;i<c.length;i++)
			c[i] = in.nextInt();
		int d=in.nextInt();
		int m=in.nextInt();
	    int total=0;
	    for (int i=0;i<=c.length-m;i++)
	        if(Arrays.stream(c, i, i+m).sum() == d)
	            total++;
	    System.out.println(total);
	}
}