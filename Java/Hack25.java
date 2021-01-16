import java.util.Scanner;
public class Hack25 {
    static boolean isAnagram(String a, String b) {
        if (a.length()==b.length()) {
        	char a1[] = a.toLowerCase().toCharArray();
        	char b1[] = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(b1);
            return (new String(a1).equals(new String(b1))?true:false);
        }else{
            return false;
        }
    }
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}