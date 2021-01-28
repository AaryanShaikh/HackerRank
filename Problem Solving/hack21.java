import java.util.*;
public class hack21{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        Integer key[] = new Integer[in.nextInt()];
        int usb[] = new int[in.nextInt()];
        for(int i=0;i<key.length;i++)
            key[i] = in.nextInt();
        for(int i=0;i<usb.length;i++)
            usb[i] = in.nextInt();
        Arrays.sort(usb);
        Arrays.sort(key,Collections.reverseOrder());
        int max=-1;
        for(int i=0,j=0;i<key.length;i++){
            for( ;j<usb.length;j++){
                if(key[i]+usb[j]>b) break;
                if(key[i]+usb[j]>max) max=key[i]+usb[j]; 
            }
        }
        System.out.println(max);
    }
}