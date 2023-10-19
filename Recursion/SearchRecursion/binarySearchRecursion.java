
/*
    //************BINARY SEARCH USING RECURSION***********
    
*/
import java.util.*;
public class binarySearchRecursion{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr={23,56,78,90};
        int x=in.nextInt();
        int res=BinarySearch(arr,x,0,arr.length-1);
        System.out.println(res);
    }
    static int BinarySearch(int[] arr,int target,int start,int end){
            if(start>end){
                return -1;
            }
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                return BinarySearch(arr,target,start,mid-1);
            }
            else{
                return BinarySearch(arr,target,mid+1,end);
            }
    }
}





