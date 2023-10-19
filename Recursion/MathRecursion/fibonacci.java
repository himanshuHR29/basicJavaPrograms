
/*
//***************FIBONACCI SEQUENCE USING RECURSION***********

    find number at nth place in SEQUENCE
    0 1 1 2 3 5 8 
    
    if n<2,return n

    Non tail recursion 

*/
// import java.util.*;
// public class fibonacci{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the nth place");
//         int n=in.nextInt();
//         System.out.println(Fibonacci(n));
//     }
//     static int Fibonacci(int n){
//         if(n<2)
//             return n;
//         else{
//             return Fibonacci(n-1)+Fibonacci(n-2);
//         }
//     }
// }

/*
        *********FIBONACCI USING GOLDEN RATIO
 */
import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<=n;i++)
        System.out.println(fibo(i));
    }
    static int fibo(int n){
        return (int)(Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
    }
}




