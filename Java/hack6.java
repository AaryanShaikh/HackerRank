import java.util.*;
import java.text.DecimalFormat;
public class hack6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("000");
		String strsplit[] = new String[4];
		String str[] = new String[3];
		String input;
		String str1 = "";
		int num[] = new int[4];
		for(int i=0;i<3;i++){
             input = in.nextLine();
             strsplit = input.split(" ");
             str[i] = strsplit[0];
             num[i] = Integer.parseInt(strsplit[1]);
           }
		System.out.println("================================");
           for (int i=0;i<3 ;i++ ) {
			  System.out.printf("%-14s %1s\n", str[i], ft.format(num[i]));
           }
		System.out.println("================================");
	}
}