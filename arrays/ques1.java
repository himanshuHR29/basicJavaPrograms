//***************LEET CODE QUESTION */
/*Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

//******************

import java.util.*;
public class ques1{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int res=counting(arr);
        System.out.println(res);
    }
    static int counting(int[] arr){
        int evenDigitcount=0;
        for(int i=0;i<arr.length;i++){
            int countDigits=0;
            while(arr[i]!=0){
                countDigits++;
                arr[i]=arr[i]/10;
            }
            if(countDigits%2==0){
                evenDigitcount++;
            }
        }
        return evenDigitcount;
    }
        
}