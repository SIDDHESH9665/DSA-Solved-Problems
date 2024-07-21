import java.util.*;

public class decToBin {

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
             int remainder = n % 2;
             binNum = binNum +(remainder *(int) Math.pow(10,pow));
             pow++;
             n = n /2;            
        }
        System.out.println("The binary of "+myNum+" is: "+binNum);
    }

    public static void main(String args[]){
        decToBin(7);

    }
}