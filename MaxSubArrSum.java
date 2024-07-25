import java.util.*;

public class MaxSubArrSum {

    public static void maxSubArrSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;

                }
            }

        }
        System.out.print("The max sum is: "+maxSum);

    }

    public static void main(String args[]) {
        int arr[] = {9,0,0,8,67,67,67,67 };
        maxSubArrSum(arr);
    }
}