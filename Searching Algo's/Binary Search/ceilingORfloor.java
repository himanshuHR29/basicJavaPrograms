
/*
       ************** CEILING or FLOOR VALUE OF A NUMBER***********
       ->smallest element Greater than or equal to target!
       eg. arr={2,3,5,9,14,16,18}
           target =15 
           answer=16
            target =4
            answer=5
            
            
            
            start   <=end    start (target)   end
            
            while loop breaks when
            
            end<start    end (target) start
                            so the answer doesn't lie in this range
            // start =end+1
            
            similarly for floor value return end;
*/



import java.util.*;
public class ceilingORfloor{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter size");
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Value for which CEILING Value is to be searched");
        int x=in.nextInt();
        int res=BinarySearch(arr,n,x);
        System.out.println(res);
    }
    static int BinarySearch(int[] arr,int n,int x){
        int start=0;
        int end=n-1;
        int mid;
        if(x>arr[end]){
            return -1;
        }
        while(start<=end){
            mid=(start+end)/2;
            if(x<arr[mid]){
                end=mid-1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return arr[start];
        //return arr[end];
    }
    
}