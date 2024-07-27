import java.util.*;

public class Product {

    public static int product(int a ,int b){
        int mul = 0;
        mul = a * b;
        return mul;
    }

    public static void main(String args[])
    {
        int a = 10;
        int b = 5;

        product(a,b);
        int pro = product(a,b);
        System.out.println("a * b = "+pro);

    }
}