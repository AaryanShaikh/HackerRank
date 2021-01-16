import java.util.Scanner;
import java.util.regex.*;
public class Hack27 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tc = Integer.parseInt(in.nextLine());
        for(int i=0;i<tc;i++){
            String pat = in.nextLine();
            try {
                Pattern.compile(pat);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}