import java.util.*;
public class hack19{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(Math.min((p/2),(n/2)-(p/2)));
    }
}