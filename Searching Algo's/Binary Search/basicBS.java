//package Binary Search;
//************************BASIC BINARY SEARCH*****************

/*      
        ***Always for sorted arrays !***
        best case: 0(1) , when element to be searched ,is at the first mid
        worst case: 0(log(N))


   Ques:  return index if element found , else return -1

*/
import java.util.*;
public class basicBS{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Element to be searched: ");
        int x=in.nextInt();
        int res=binarySearch(arr,x);
        System.out.println(res);
    }
    static int binarySearch(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // int mid =start+(end-start)/2;  // for long ranges of start and end! , cauz int range may exceed
            if(x>arr[mid]){
                start=mid+1;
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}







