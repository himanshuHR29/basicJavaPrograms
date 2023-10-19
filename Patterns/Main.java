
//PATTERN 1
/*
*
**
***
****
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//PATTERN 2
/*

*****
*****
*****
*****
*****

*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//PATTERN 3
/*

*****
****
***
**
*

*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//PATTERN 4
/*

1
12
123
1234
12345
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

//PATTERN 5
/*

*
**
***
****
*****
****
***
**
*

*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int row=1;row<2*n;row++){
            int totalCol=(row>n)?2*n-row:row;
            for(int j=1;j<=totalCol;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


// PATTERN 5

/*

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int row=1;row<2*n;row++){
            int totalCol=(row>n)?2*n-row:row;
            int totalSpaces=n-totalCol;
            for(int i=0;i<totalSpaces;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalCol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

