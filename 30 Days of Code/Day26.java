import java.util.*;
public class Day26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String retDate[] = in.nextLine().split(" ");
        String dueDate[] = in.nextLine().split(" ");
        int fine=0;
        if(Integer.parseInt(retDate[2]) < Integer.parseInt(dueDate[2])){ 
            fine=0;
        }else{
            if(Integer.parseInt(retDate[2]) > Integer.parseInt(dueDate[2])){  
                fine=10000;
            }else if(Integer.parseInt(retDate[1]) > Integer.parseInt(dueDate[1])){   
                fine=500 * (Integer.parseInt(retDate[1]) - Integer.parseInt(dueDate[1]));
            }else if(Integer.parseInt(retDate[0]) > Integer.parseInt(dueDate[0])){    
                fine=15 * (Integer.parseInt(retDate[0]) - Integer.parseInt(dueDate[0]));
            }
        }              
        System.out.println(fine); 
    }
}