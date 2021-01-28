import java.util.*;
public class hack18{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> socks = new HashSet<Integer>();
        int count = 0;
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            if(socks.contains(num)){
                count++;
                socks.remove(num);
            }else{
                socks.add(num);
            }
        }
        System.out.println(count);
    }
}