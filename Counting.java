public class Counting {

    static void counting(int n)
    {
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        counting(n-1);
    }

    public static void main(String args[])
    {
        int n;
        counting(10);
    }
}