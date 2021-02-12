import java.util.*;
public class Day6{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i=0;i<tc;i++){
			String str = in.nextLine();
			String even,odd;
			even = odd = "";
			for(int j=0;j<str.length();j++){
				if (j%2==0) {
					even+=Character.toString(str.charAt(j));
				}else{
					odd+=Character.toString(str.charAt(j));
				}
			}
			System.out.println(even+" "+odd);
		}
	}
}