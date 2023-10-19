
import java.util.*;
public class LSstrings{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
       String str=in.next();
       //System.out.println(Arrays.toString(str));
       System.out.println("Enter the Character to be searched");
       char ch=in.next().charAt(0);
       System.out.println(LinearSearchString(str,ch));
    }
    static int LinearSearchString(String str,char ch){
        for(int i=0;i<str.length();i++){
           if(ch==str.charAt(i)){
               return i;
           }
       }
       return -1;
    }
}