/*
 *      GCD / HCF
        It is the minimum positive value of any equation......

        Finding GCD using Euclid's method

        GCD(a,b)=GCD(rem(b%a),a);

 */


import java.util.*;
public class gcd{
    public static void main(String[] args) {
        int a=4;
        int b=9;
        System.out.print(gcdFunction(a,b));
    }
    static int gcdFunction(int a,int b){
        if(a==0){
            return b;
        }
        return gcdFunction(b%a,a);
    }
}