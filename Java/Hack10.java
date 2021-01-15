import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
   static Calendar c = Calendar.getInstance();
    public static String findDay(int month, int day, int year) {
        c.set(year,month-1,day);
        String res = "";
        switch(c.get(Calendar.DAY_OF_WEEK)-1){
            case 0: res="SUNDAY";
                    break;
            case 1: res="MONDAY";
                    break;
            case 2: res="TUESDAY";
                    break;
            case 3: res="WEDNESDAY";
                    break;
            case 4: res="THURSDAY";
                    break;
            case 5: res="FRIDAY";
                    break;
            case 6: res="SATURDAY";
                    break;        
        }
        return res;
    }
}

public class Hack10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
