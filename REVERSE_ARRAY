/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    System.out.println("enter the length of the array");
	    Scanner sc= new Scanner(System.in);
	    n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n ;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("the actual order of the array is ");
		for(int i=0;i<n ; i++){
		    System.out.print(arr[i]+" ");}
		int j=n-1;
		for(int i=0;i<n/2; i++){
		    int t=arr[i];
		    arr[i]=arr[j];
		    arr[j]=t;
		    j--;
		}
    	System.out.println("");
		System.out.println("the new order of the array is ");
            for(int i=0;i<n ; i++){
		    System.out.print(arr[i]+" ");
		}
}
}
