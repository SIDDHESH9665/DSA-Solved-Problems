import java.util.*;

import javax.xml.stream.events.EndDocument;

public class SpiralMatrix {

    public static void spiralMat(int arr[][]) {
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {                      //Top Row 
                System.out.print(arr[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {                  //Right Column
                System.out.print(arr[i][endCol] + " ");
            }

            for (int j = endCol - 1; j >= startCol; j--) {                   //Bottom row
                System.out.print(arr[endRow][j] + " ");
                if (startRow==endRow) {
                           break;                     
                }
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {                //Left column
                System.out.print(arr[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1,   2 , 3,  4 },
                        { 5,   6,  7,  8 }, 
                        { 9,  10, 11, 12 }, 
                        { 13, 14, 15, 16 } };
        spiralMat(arr);
    }
}