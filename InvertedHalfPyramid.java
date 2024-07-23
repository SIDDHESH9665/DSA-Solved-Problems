import java.util.*;

public class InvertedHalfPyramid {

    public static void inHalfPyramid(int n){
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-(i-1);j++)
            {
                System.out.print(j);
            }
            System.err.println();
            
        }
    }

    public static void main(String args[])
    {
        inHalfPyramid(5);
    }
}