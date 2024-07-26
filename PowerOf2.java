public class PowerOf2 {

    public static int power2(int n)
    {
        if (n==0) {
            return 1;
        }
        
        return 2* power2(n-1);
    }

    public static void main(String[] args) {
        int n;
        System.out.println(power2(10));

    }
}