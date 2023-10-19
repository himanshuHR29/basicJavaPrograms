/*
 *      for eg sqrt(40)=6.3234
                        6 by normal binary search 
                        remainig decimal by for loop starting by adding 0.1
 
 */

import java.util.*;
public class squareRoot{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(numSquare(40));
    }
    static double numSquare(int n){
        int precision=3;
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid*mid==n){
                root=mid;
                return root;
            }
            if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        double incre=0.1;
        for(int i=0;i<precision;i++){
            while(root*root<=n){
                root+=incre;
            }
            root-=incre;
            incre=incre/10;
        }
         return root;
    }
}