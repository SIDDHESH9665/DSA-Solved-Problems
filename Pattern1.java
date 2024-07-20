import java.util.*;
public class Pattern1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int row = 1;
        int star = n;
        int spaces = n-2;

        while(row <= n-1)
        {
            if(row == 1 || row == n-1)
            {
                for(int i = 0; i< star; i++)
                {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");

            }for(int i = 0; i<=spaces; i++)
                {
                    System.out.print(" ");

                }
                System.out.print("* ");
            }

               System.out.println();
               row++;
        }
         
    }

