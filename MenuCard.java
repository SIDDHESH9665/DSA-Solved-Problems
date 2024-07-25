import java.util.*;

public class MenuCard {

    public static int menuCard(String arr[],String key){
             for(int i =0;i<arr.length;i++)
             {
                if (arr[i]==key) {
                    return i;
                }
             }
             return -1;
    }

    public static void main(String args[])
    {
        String arr[] = {"VadaPaav","PaavBhaji","Samosa","Misal","VadaSambhar","MasalaDosa"};
        String key = "VadaPaav";

        int menu = menuCard(arr, key);

        if (menu == -1) {
            System.out.println(key+" is not present in list.");
        }else
        {
            System.out.println(key+" is present at index "+menu);
        }

    }
}