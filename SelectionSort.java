import java.util.*;
//import java.util.Arrays;   for only array sort

public class SelectionSort {

    public static void slectionSort(Integer arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[minpos]>arr[j]) {
                    minpos =j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp; 
        }
    }

    public static void printArr(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        Integer arr[]={4,5,7,8,7,4,2,6,5,8,9,6,1,4,5,2,3,6,9,8,7,5,4,2,3,6,9,7,5,4,};
        //Arrays.sort(arr);       //Inbuiled Function
        //Arrays.sort(arr,0,10);
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,10,Collections.reverseOrder());

        //slectionSort(arr);
        printArr(arr);

    }
}