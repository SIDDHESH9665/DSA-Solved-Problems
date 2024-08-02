public class xtoThePower {

    public static int powerOfx(int x, int n)
    {
        if (n == 0) {
            return 1;
        }

        int xnm1 = powerOfx(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String args[])
    {
        System.out.println(powerOfx(25, 7));
    }
}
