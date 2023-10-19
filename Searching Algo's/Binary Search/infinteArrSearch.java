
//*******************FIND ELEMENT IN AN INFINTE ARRAY**************
/*
    AN INFINTE array can be the one whose length can't be determined
    -> here we divide the array in chunks , exponentially.
    ->complexity -O(logN);  because comparisons increse exponentially
    For eg.
    1,2,3,4,5,6,7     start=0; end=1;
    first chunk : 1,2
    newStart= end+1;  end=end+(end-start+1)*2  1+2*2
    second chunk : 3,6
    
    
*/


import java.util.*;
public class infinteArrSearch{
    public static void main(String[] args){
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(answer(arr,target));
    }
    static int answer(int[] arr,int target){
        int start=0;
        int end=1;
        // until target is not under that chunk , in which it lies
        while(target>arr[end]){
            int newStart=end+1;
            end= end+ (end-start+1)*2;   // end= end+(sizeofbox)*2;
            start=newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}