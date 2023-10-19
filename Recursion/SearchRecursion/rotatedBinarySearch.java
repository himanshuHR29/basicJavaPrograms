public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] a={5,6,7,8,9,1,2,3};
        System.out.println(BinarySearch(a,3,0,a.length-1));
    }
           //
    // 5,6,7,(8),1,2,3
    static int BinarySearch(int[] a,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[start]<=a[mid]){
            if(target>=a[start] && target<=a[mid]){
                return BinarySearch(a,target,start,mid-1);
            }
            else{
                return BinarySearch(a,target,mid+1,end);
            }
        }
        if(target<=a[mid] && a[end]>=target){
            return BinarySearch(a,target,mid+1,end);
        }
        return BinarySearch(a,target,start,mid-1);
    }
}
