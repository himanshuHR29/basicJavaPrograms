public class linearSearchRecursion {
    public static void main(String[] args) {
        int[] a={3,2,1,8};
        int target=1;
        int index=0;
        System.out.println(linearSearch(a,target,index));
    }
    static int linearSearch(int[] a,int x,int index){
        if(index==a.length){
            return -1;
        }
        else if(a[index]==x){
            return index;
        }
        return linearSearch(a,x,index+1);
    }
}
