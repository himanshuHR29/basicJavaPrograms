//*********************************Armstrong number******************
/* use Math.pow , it returns double so type caste into int 
(int)(Math.pow(a,b));
*/
package armstrong;
import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        isArmstrong(n);
        
        //********PRINTING ALL 3 DIGITS ARMSTRONG NUMBERS*******
        // for(int i=100;i<1000;i++){
        //     if(checkArm(i))
        //     System.out.print(i+" ");
        // }
    }
    
    public static void isArmstrong(int n){
        int original=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Number of Digits = "+count);
        int temp=original;
        int arm=0;
        while(temp>0){
            int rem=temp%10;
            arm=arm + (int)(Math.pow(rem,count));  
            temp=temp/10;
        }
        if(original==arm){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
    
    
    // by Boolean function
    // static Boolean checkArm(int n){
    //     int original=n;
    //     int temp=original;
    //     int arm=0;
    //     while(temp>0){
    //         int rem=temp%10;
    //         //arm=arm + (int)(Math.pow(rem,count));  
    //         arm=arm+rem*rem*rem;
    //         temp=temp/10;
    //     }
    //     return original==arm;
    // }
}

