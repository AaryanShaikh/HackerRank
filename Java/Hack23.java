import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k); 
        for(int i = 0; i <= s.length() - k; i++){
            String temp = s.substring(i, i + k);
            if(sTemp.compareTo(smallest) < 0) {
                smallest = temp;
            }
            if(sTemp.compareTo(largest) > 0) {
                largest = temp;
            } 
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}