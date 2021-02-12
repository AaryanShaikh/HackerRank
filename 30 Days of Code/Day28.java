import java.util.*;
import java.util.regex.*;
public class Day28{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc = Integer.parseInt(in.nextLine());
        ArrayList<String> res = new ArrayList<String>(); 
        for(int i=0;i<tc;i++){
            String str[] = in.nextLine().split(" ");
            if(Pattern.matches("([a-z\\.]+@gmail.com){1,50}",str[1]) && str[0].length()<=20){
                res.add(str[0]);
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}