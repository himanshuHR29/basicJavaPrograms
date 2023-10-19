/*
    * 1. XOR
            -> a b  a^b
               0  0   0
               0  1   1
               1  0   1
               1  1   1

               a^1=~a
               a^0=a
               a^a=0

    2. LEFT SHIFT
             eg. 10<<1
             (1010)2=(10)10
             after left shift (10100)2

             a<<1=2*a

             a<<b=a*2^b
             2<<4=2*2^4

    3. RIGHT SHIFT
            a>>b=a/2^b
            (0011001)>>1=(001100)
 */

//********FIND WHETHER NUMBER IS ODD OR EVEN */

//Every number done with AND returns the numbers, if number is 1 then it's odd else even
import java.util.*;
public class basicBitwise{
        public static void main(String[] args) {
        int n=302;
        System.out.println(checkOdd(n));
        System.out.println((n&1)==1);
    }
    static boolean checkOdd(int n){
        return ((n&1)==1);
    }
}