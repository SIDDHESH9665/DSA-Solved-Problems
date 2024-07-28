public class SecondLargest {

    public static int secondLargest(int arr[])
    {
        
        int largest = arr[0];
        int secondLargestt = Integer.MIN_VALUE;

        for(int i =1; i<arr.length;i++)
        {
            if (arr[i]>largest) {
                secondLargestt = largest;
                largest = arr[i];
                
            
            }
            else if (largest > arr[i] && arr[i]> secondLargestt) {
                secondLargestt = arr[i];
            }
            
        }return secondLargestt;
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,4,7,7,5};
        System.out.println(secondLargest(arr));

    }
}