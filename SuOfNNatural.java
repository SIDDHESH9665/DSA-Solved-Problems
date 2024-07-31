public class SuOfNNatural {

    public static int sumOfNatural(int n)
    {
        if (n==1) {
            return 1;
        }
        int snn = sumOfNatural(n-1);
        int sum =n+snn;
        return sum;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(sumOfNatural(5));
    }
}