
import java.util.*;
import java.util.ArrayList;
public class arrayListLinearSearch{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={1,2,-3,5,9,2};
        ArrayList<Integer> ans=linearSearch(a,2,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> linearSearch(int[] a,int x,int index,ArrayList<Integer>list){
        if(index==a.length){
            return list;
        }
        else if(a[index]==x){   
            list.add(index);
        }
        return linearSearch(a,x,index+1,list);
    }
}