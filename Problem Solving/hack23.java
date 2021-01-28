import java.util.*;
public class hack23{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                s[i][j] = in.nextInt();
            }
        }
        int cost[] = {0,0,0,0,0,0,0,0};
        int t[][] = 
        {
            {4,9,2,3,5,7,8,1,6},
            {4,3,8,9,5,1,2,7,6},
            {2,9,4,7,5,3,6,1,8},
            {2,7,6,9,5,1,4,3,8},
            {8,1,6,3,5,7,4,9,2},
            {8,3,4,1,5,9,6,7,2},
            {6,7,2,1,5,9,8,3,4},
            {6,1,8,7,5,3,2,9,4},
        };
        for(int i=0;i<8;i++){        
            cost[i] = Math.abs(t[i][0]-s[0][0]) + Math.abs(t[i][1]-s[0][1]) + Math.abs(t[i][2]-s[0][2]);
            cost[i] = cost[i] + Math.abs(t[i][3]-s[1][0]) + Math.abs(t[i][4]-s[1][1]) + Math.abs(t[i][5]-s[1][2]);
            cost[i] = cost[i] + Math.abs(t[i][6]-s[2][0]) + Math.abs(t[i][7]-s[2][1]) + Math.abs(t[i][8]-s[2][2]);
        }   
        Arrays.sort(cost);
        System.out.println(cost[0]);
    }
}