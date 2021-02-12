import java.util.*;
public class Day8{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        HashMap<String, Integer> phone = new HashMap<String, Integer>();
        for(int i=0;i<n;i++){
            phone.put(in.next(),Integer.parseInt(in.next()));
        }
        while(in.hasNext()){
            String s=in.next();
            if (phone.containsKey(s)) {
                System.out.println(s+"="+phone.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
