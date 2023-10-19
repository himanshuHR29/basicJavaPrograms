/*
    *******FIND UNIQUE NUMBER IN ARRAY !
    xor all the array  as a^a=0
    for eg. 
    a[]={-2,9,2,8,3,-8,-3}
    sum of a[] will give 9 , and it's unique

 */

import java.util.*;
public class findUniqueinArr {
    public static void main(String[] args){
        int [] a={9,8,7,7,6,5,6,8,5};
        System.out.println(ans(a));
    }
    static int ans(int[] a){
        int unique=0;
        for(int i:a){
                unique^=i;
        }
        return unique;
    }
}
