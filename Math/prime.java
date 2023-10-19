import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Ram ram ji!");
        int n=in.nextInt();
        System.out.println(sqrtPrime(n));
    }
    static boolean sqrtPrime(int n){
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