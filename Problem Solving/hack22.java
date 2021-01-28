import java.util.*;
public class hack22{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tc = Integer.parseInt(in.nextLine());
        for(int i=0;i<tc;i++){
            String spl[] = in.nextLine().split(" ");
            if(Math.abs(Integer.parseInt(spl[0])-Integer.parseInt(spl[2]))
            ==Math.abs(Integer.parseInt(spl[1])-Integer.parseInt(spl[2]))){
                System.out.println("Mouse C");
            }else if(Math.abs(Integer.parseInt(spl[0])-Integer.parseInt(spl[2]))
            >Math.abs(Integer.parseInt(spl[1])-Integer.parseInt(spl[2]))){
               System.out.println("Cat B"); 
            }else{
               System.out.println("Cat A"); 
            }
        }
    }
}