import java.util.*;
public class hack7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s[] = in.nextLine().split(" ");
        System.out.println((Integer.parseInt(s[1])>Integer.parseInt(s[3])&&(Integer.parseInt(s[2])-Integer.parseInt(s[0]))%(Integer.parseInt(s[3])-Integer.parseInt(s[1]))==0)?"YES":"NO");
    }
}