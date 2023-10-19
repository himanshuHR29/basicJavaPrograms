//package Linear Search;

//*********************************LINEAR SEARCH ALGORITHM***********
/*
    return -1 if element not found else return the index of the number
    o(n) worst case
    o(1) best case
*/

import java.util.*;
public class linearSearch{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Size of array: ");
		int n=in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter "+n+" elements: ");
		for (int i=0;i<arr.length ;i++ ){
		    arr[i]=in.nextInt();
		} 
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element u want to search: ");
		int x=in.nextInt();
		System.out.println(LinearSearch(arr,x));
	}
	static int LinearSearch(int[] arr,int x){
	    int index=0;
	    if(arr.length==0){
	        return -1;
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==x){
	            return i;
	        }
	    }
	    return -1;
	}
}
