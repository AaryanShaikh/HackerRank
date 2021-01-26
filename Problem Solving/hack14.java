import java.util.*;
public class hack14{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ar[] = new int[in.nextInt()];
		for(int i=0;i<ar.length;i++){
			ar[i] = in.nextInt();
		}
        int arc[] = new int[ar.length];//container
        for(int i = 0; i < ar.length ; i++ )
        	arc[ar[i]]++; 
        int max = 0,maxpos=0;
        for(int i = 0 ; i < ar.length ; i++){
            if(arc[i] > max){
                max = arc[i];
                maxpos = i;
            }
        }
        System.out.println(maxpos);
	}
}