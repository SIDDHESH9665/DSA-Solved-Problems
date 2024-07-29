import java.util.*;

public class Spiral {

    public static void spiral(int mat[][])
    {
        int stCol=0;
        int stRow =0;
        int endRow=mat[0].length-1;
        int endCol = mat[0].length-1; 
        while (stRow <= endRow && stCol <= endCol){
        

        for(int j=stCol; j<=endCol;j++)
        {
            System.out.print(mat[stRow][j]+" ");
        }

        for(int i=stRow+1;i<=endRow;i++)
        {
            System.out.print(mat[i][endCol]+" ");
        }

        for(int j=endCol-1;j>=stRow;j--)
        {
            System.out.print(mat[endRow][j]+" ");
        }

        for(int i=endRow-1;i>=stRow+1;i--)
        {
            System.out.print(mat[i][stCol]+" ");;
        }

        stCol++;
        stRow++;
        endCol--;
        endRow--;
    }
}

    public static void main(String args[])
    {
        int mat[][] = {{1,2,3,4},
                       {5,6,7,8},
                      {9,10,11,12},
                     {13,14,15,16}};
    spiral(mat);

                     
    }
}