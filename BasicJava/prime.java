//************************PRIME NUMBER */
/*Iterate till sqrt of n */


import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
        
        
        // int flag=0;
        // if(n<=1){
        //     System.out.print("Not Prime");
        // }
        // for(int i=2;i<=Math.sqrt(n);i++){ 
        //     if(n%i==0){
        //         System.out.println("Not Prime");
        //         flag=1;
        //         break;
        //     }
        // }
        // if(flag==0){
        //     System.out.println("Prime");
        // }
    }

    // by boolean function 
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}