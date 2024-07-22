public class Factorial1 {
     
    static int factN(int n)
    {
        if (n==0) {
            return 1;
        }
      int fnm1 = factN(n-1);
      int factn = n*fnm1;
      return factn;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(factN(5));
    }
}