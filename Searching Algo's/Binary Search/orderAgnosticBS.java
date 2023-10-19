
/*
        Given sorted array can be in descending or ascending order
        orderAgnosticBS detects which case is it and then runs simple BS.
        o(logN) : worst case
*/



import java.util.*;
public class orderAgnosticBS{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int x;
        System.out.println("Enter the element to be searched: ");
        x=in.nextInt();
        int res=orderAgnosticBS(arr,x);
        System.out.println(res);
    } 
    static int orderAgnosticBS(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        //checking for descending/ascending order:
        boolean check=arr[start]<arr[end];
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(check){
                if(x>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(x<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}







