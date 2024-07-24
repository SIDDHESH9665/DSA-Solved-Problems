import java.util.*;

public class Largest {

    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i]<minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("The minimun number is: "+minimum);
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3,4,5,6,7,8,9,10,12,13,0,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30 };
        System.out.println("The largest number is:"+getLargest(arr));
    }
}