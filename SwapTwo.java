import java.util.*;

public class SwapTwo {
    public static void swap(int a, int b) {
        
        a = a + b;
        b = a- b;
        a = a-b;
        
        System.out.println("int a= "+a);
        System.out.println("int b= "+b);

    }

    public static void main(String arg[])
    {
        int a = 10;
        int b = 20;

        swap(a,b);
    }
}
