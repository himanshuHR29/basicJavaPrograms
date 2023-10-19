import java.util.*;
import java.util.ArrayList;
public class trianglePat{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        star(5,0);
    }
    static void star(int row,int col){
        if(row==0){
            return;
        }
        else if(col<row){
            System.out.print("*");
            star(row,col+1);
        }
        else{
            System.out.print("\n");
            star(row-1,0);
        }
    }
}