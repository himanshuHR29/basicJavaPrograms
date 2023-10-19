//package arrays;
//***************BASIC 2-D ARRAY**************************
import java.util.*;
public class arr2Dbasic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO 2-D ARRAY PROGRAM");
        System.out.println("Please Enter Number of rows and columns");
        int row=in.nextInt();
        int col=in.nextInt();
        int[][] arr2d= new int[row][col];
        System.out.println("Enter "+row*col+" Elements: ");
        
        //taking input
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                arr2d[i][j]=in.nextInt();
            }
        }
        
        System.out.println("Your phucking 2-d array: ");
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        //short method of printing!
         for(int i=0;i<arr2d.length;i++){
            System.out.println(Arrays.toString(arr2d[i]));
        }
        
        System.out.println();
        //enhanced for LOOP for printing
        for(int[] element : arr2d){
            System.out.println(Arrays.toString(element));
        }
    }
}