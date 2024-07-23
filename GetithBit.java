import java.util.*;
public class GetithBit {

    public static int bit(int n,int i)
    {
        int bitmask = 1<<i;
        if ((n & bitmask)==0) {
            return 0;
        }
        else{
        return 1;
    }
    }
    public static void main(String[] args) {
        int n;
        System.out.println(bit(10, 3));
    }
}