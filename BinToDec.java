import java.util.*;

public class BinToDec {

    public static void binToDec(int n){
        int myNum = n;
        int dec = 0;
        int pow  = 0;
        while (n > 0) {
          int lastDigit = n % 10;
          dec = dec + (lastDigit * (int)Math.pow(2, pow));
          pow++;
          n = n /10;

        }
        System.out.println("The Decimal of "+myNum+" is: "+dec);
    }

    public static void main(String args[]){
        binToDec(1010);
    }
}