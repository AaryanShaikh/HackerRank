import java.util.*;
public class hack11{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s[] = new int[in.nextInt()];
		int highest=0,lowest=0,high=0,low=0;    
		for(int i=0;i<s.length;i++){
			s[i] = in.nextInt();
			if (i==0){highest = lowest = s[0];}
			if (s[i] > highest){
		        highest = s[i];
		        high++;
		    }else if (s[i] < lowest){
		        lowest = s[i];
		        low++;
		    }
		}
		System.out.println(high+" "+low);
	}
}