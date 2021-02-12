import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==0) {
        	if (n>=2&&n<=5) {
        		System.out.println("Not Weird");	
        	}else if (n>=6&&n<=20) {
        		System.out.println("Weird");
        	}else if(n>20){
        		System.out.println("Not Weird");
        	}
        }else{
        	System.out.println("Weird");
        }
    }
}