
/*

    //************************INSERTION SORT**************************
    
    worst case -> O(n^2);
    best case -> O(n);
    
    for i=0 , elements sorted till i+1;
    for i=1, elements sorted till i+1;
    j helps in swapping 
    
    
    Why INSERTION sort?
    -> Adaptive : steps are reduced if array is sorted 
    -> stable
    -> Used for smaller values of n
    -> Works best for partially sorted arrays
    
*/

import java.util.*;
public class insertion{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting");
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){         // 4 1 6 2
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
                else{
                    break;    // if left is smaller than right , it means already sorted
                }
            }
        }
    }
    static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}