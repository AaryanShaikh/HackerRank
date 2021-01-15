import java.util.*;
public class Hack13{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		HashMap<String, Integer> phone = new HashMap<String, Integer>();
		for(int i=0;i<n;i++){
			phone.put(in.nextLine(),Integer.parseInt(in.nextLine()));
		}
		while(in.hasNext()){
			String s=in.nextLine();
			if (phone.containsKey(s)) {
				System.out.println(s+"="+phone.get(s));
			}else{
				System.out.println("Not found");
			}
		}
	}
}