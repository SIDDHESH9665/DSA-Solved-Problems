public class SubArraySumOptimal {

    public static int subArraySum(int arr[])
    {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+= arr[i];
        }
        if (sum > max) {
            max =sum;
        }
        if (sum < 0) {
            sum = 0;
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(subArraySum(arr));
    }
}