import java.util.*;

public class Substring {

    static String isSubstring(String str, int si, int ei)
    {
        String substr ="";
        for(int i=si;i<ei;i++)
        {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        //System.out.println(isSubstring(str,0,6));
        System.out.println(str.substring(0,7));
    }
}