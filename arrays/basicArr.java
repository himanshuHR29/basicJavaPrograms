
//****************************BASIC INPUT OUTPUT OF A 1-D ARRAY*********************
//package arrays;
import java.util.*;
public class basicArr{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the Size for array: ");
		n=in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter "+n+" Elements for array: ");
		for(int i=0;i<arr.length;i++){
		    arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}

		System.out.println(" ");

		//Simplest method of printing array
		System.out.print(Arrays.toString(arr));

		
		// similarly string array can be created using
		// String[] stringarrayName = new String[size of string array];
		System.out.println("Enter String array size");
		int x=in.nextInt();
		String[] str=new String[x];
		System.out.println("Enter String array Elements");
		for(int i=0;i<str.length;i++){
		    str[i]=in.next();
		}
		System.out.print(Arrays.toString(str));
	}
}
