
import java.io.IOException;
import java.lang.reflect.Method;
class Printer{
    <T>void printArray(T element[]){ 
        for(int i=0;i<element.length;i++)
            System.out.println(element[i]); 
    } 
}

public class Hack16 {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}