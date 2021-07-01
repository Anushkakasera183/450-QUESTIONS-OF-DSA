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
		System.out.println("THE ARRAY LOOKS LIKE");
		for(int i=0; i<n ; i++){
		    System.out.print(arr[i]+ " ");
		}
		System.out.println("");
		int max=arr[0];
		int min= arr[0];
		for(int i=1; i<n ;i++){
		    if (arr[i]>max){
		        max=arr[i];
		    }
		    if(arr[i]<min){
		        min=arr[i];
		    }
		}
		System.out.println("THE MAXIMUM ELEMENT IS "+max);
		System.out.println("THE MINIMUN ELEMENT IS "+ min);
	}}
