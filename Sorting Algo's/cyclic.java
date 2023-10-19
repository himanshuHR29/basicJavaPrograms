
/*
    //*********************CYCLIC SORT************
    
    used for given continuous numbers in range 1-N
    O(n)
*/

import java.util.*;
public class cyclic{
    public static void main(String[] args){
        int[] arr={5,1,4,2,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
       int i=0;
       while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }
           else{
               i++;
           }
       }
    }
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}