
//***************STRING palindrome OR NOT***********
// O(n)

import java.util.*;
public class palindrom{
    public static void main(String[] args){
        String str="abcdcba";
        int res=palindrome(str);
        System.out.println(res);
        
    }
    static int palindrome(String str){
        int s=0;
        int e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e))
            return 0;
            else
            s++;e--;
        }
        return 1;
    }
}