/*
        //*****************SELECTION SORT ***********************

        find the min or max element at swap with its respective position 

        worst case -> O(n^2);
        best case -> O(n^2);

        works best on small lists/array!
 */
import java.util.*;
public class selection{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(a));
        selectionSort(a,n);
        System.out.println(Arrays.toString(a));

    }
    static void selectionSort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int start=0;
            int last=n-1-i;
            int max=getMax(a,start,last);
            swap(a,max,last);
        }
    }
    static int getMax(int[]a,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]a,int max,int last){
        int temp=a[max];
        a[max]=a[last];
        a[last]=temp;
    }
}