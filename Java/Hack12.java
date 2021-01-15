import java.util.*;
public class Hack12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            if (in.next().equals("Insert")?true:false) {
                list.add(in.nextInt(), in.nextInt());
            } else {
                list.remove(in.nextInt());
            }
        }
        System.out.println(list.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", ""));
    }
}