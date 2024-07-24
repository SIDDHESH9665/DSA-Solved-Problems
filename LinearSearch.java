import java.util.*;

public class LinearSearch {

    public static int linearSearch(int arr[],int key)
    {
            for(int i =0; i<arr.length;i++)
            {
                if (arr[i]== key) {
                    return i;
                }
            }return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 12;

        int index = linearSearch(arr, key);

        if (index == -1) {
            System.out.println("The key "+key+" is not present.");
        }
        else{
            System.out.println("The key is present at index: "+index);
        }

    }
}