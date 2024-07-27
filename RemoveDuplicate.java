import java.util.*;

public class RemoveDuplicate {

    static void removeDuplicate(String str, int index,boolean map[],StringBuilder newStr)
    {
        if (index == str.length()) {
             System.out.println(newStr);
             return;            
        }

        char currChar = str.charAt(index);
        if(map[currChar-'a']==true) {
            removeDuplicate(str,index+1,map,newStr);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str,index+1,map,newStr.append(currChar));
            return;
        }
    }

    public static void main(String args[])
    {
        String str = "siddheshbhalerao";
        removeDuplicate(str,0,new boolean[26],new StringBuilder(""));
    }
}