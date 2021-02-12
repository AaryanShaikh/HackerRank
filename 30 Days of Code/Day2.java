import java.util.*;
public class Day2 {
    static long solve(double meal_cost, int tip_percent, int tax_percent) {
        return Math.round(meal_cost+((meal_cost*tip_percent)/100)+((meal_cost*tax_percent)/100));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solve(in.nextDouble(), in.nextInt(), in.nextInt()));
        in.close();
    }
}