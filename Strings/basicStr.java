
/*

        //********************STRINGS BASICS IN JAVA**************
         
         
        String str="Hello World";
        
        str-> reference variable (stored in stack memory)
        "Hello World"-> Object(stored in heap memory)
        
        * A separate string pool memory is used in heap for security purposes,
            but when new keyword is used then object is outside pool
        * strings are immutable in java i.e object can't be modified
        
*/


//Basic string comparison
import java.util.*;

import javax.print.event.PrintJobListener;
public class basicStr{
    public static void main(String[] args){
        // inside string pool within heap
        String a="Hello";
        String b="Hello";
        String e="Hello  ";
        System.out.println(a==b);
        System.out.println(b.equals(e)); //check for only value

        
        
        // outside string pool within heap
        String c=new String("Ram Ram ji");
        String d=new String("Ram Ram ji");
        System.out.println(c==d);
        
        
        StringBuilder builder=new StringBuilder();
        String s="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();

        System.out.println(builder.toString());
        
        String n="It's her Birthday today!";
        System.out.println(n.charAt(0));
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(n.strip());
        System.out.println(Arrays.toString(n.split(" ")));
    }
}






