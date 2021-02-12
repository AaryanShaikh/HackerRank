import java.util.*;
public class Day10{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String strsplit[] = Integer.toString(in.nextInt(),2).split("0");
		int max = Integer.MIN_VALUE;
		for(int i=0;i<strsplit.length;i++){
			max = Math.max(strsplit[i].length(),max);
		}
		System.out.println(max);
	}
}