import java.util.*;
public class Day25{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for(int j=0;j<tc;j++){
            int num = in.nextInt();
            if(num == 1){
                System.out.println("Not prime");
            }else if(num == 2){
                System.out.println("Prime");
            }else if(num%2==0){
                System.out.println("Not prime");
            }else{
                int sq = (int)Math.sqrt(num);
                boolean check = true;
                for(int i=3;i<=sq;i+=2){
                    if(num%i==0){
                        check = false;
                        break;
                    }
                }
                if(check){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }
            }
        }
    }
}