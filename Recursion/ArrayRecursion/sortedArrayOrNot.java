public class sortedArrayOrNot {
    public static void main(String[] args) {
        int[] a={1,-1,3,4};
        int index=0;
        System.out.println(check(a,index));
    }
    static boolean check(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && check(arr,index+1);
    }

}
