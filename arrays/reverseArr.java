
//*******************************REVERSE AN ARRAY***************
import java.util.*;
public class reverseArr{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    //  1 2 3 4
    // start=1    end=4
    // start++    end--;
    
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] a ,int i1,int i2){
        int temp=a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
    }
}
