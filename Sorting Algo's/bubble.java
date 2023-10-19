
/*
        **********************BUBBLE SORT ALGO***********
        
        also known as SINK SORT or EXCHANGE SORT
        Stable sorting algorithm 
        (original order is maintained for duplicate elements)
        
        Time complexity:
        worst case -> O(n^2)   when sorted in opposite order
        best case -> O(n)      when array is already sorted
        
        compare  adjacent elements, if first greater then second , then swap 
*/

import java.util.*;
public class bubble{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Your Array Before sorting: ");
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr,n);
        System.out.println("Your Array after sorting: ");
        System.out.println(Arrays.toString(arr));

    }
    
    
    static void BubbleSort(int[] arr,int n){
        boolean swapCheck;
        for(int i=0;i<n-1;i++){
            swapCheck=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapCheck=true;
                }
            }
            if(swapCheck==false){
                break;
            }
        }
    }
}