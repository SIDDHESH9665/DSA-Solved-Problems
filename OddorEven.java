import java.util.*;

public class OddorEven {
 
    static void OddorEven(int n)
    {
        int bitMask =1;

        if ((n & bitMask)== 0){
            System.out.println("Number is even.");
        }
        else
        {
            System.out.println("Number is odd.");
        }
    }

    public static void main(String[] args) {
        int n;
        OddorEven(5);
    }
}