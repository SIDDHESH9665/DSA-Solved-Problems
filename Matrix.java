import java.util.*;

public class Matrix {

    public static boolean search(int arr[][],int key)
    {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr.length;j++)
        {
            if (arr[i][j]==key) {
                System.out.print("Key is found at index: "+"("+i+","+j+")");
                return true;
            }
        }
       }
       System.out.println("Key is not found.");
       return false;
    }

    public static void main(String args[])
    {
        int matrix[][]=new int[4][4];
        Scanner sc = new Scanner(System.in);
        int n =matrix.length,m= matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 6);
    }
}