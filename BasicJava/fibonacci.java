//*******************************FIBONACCI TILL N NUMBERS**************
import armstrong.isArmstrong;
import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n=in.nextInt();
        // int ft=0,st=1;
        // for(int i=1;i<=n;i++){
        //     int nt=ft+st;
        //     ft=st;
        //     st=nt;
        // }
        // System.out.printf(ft+"");
        System.out.println(fibo(n));
        System.out.print(isArmstrong(n));
    }
    static int fibo(int n){
        int ft=0,st=1;
        for(int i=1;i<=n;i++){
            int nt=ft+st;
            ft=st;
            st=nt;
        }
        return ft;
    }
}