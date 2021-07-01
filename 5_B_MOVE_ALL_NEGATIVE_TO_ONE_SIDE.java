/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
SPACE COMPLEXITY IS O(1)
BETTER APPROACH THAN THE PREVIOUS ONE
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
		int l=0;
		int r=n-1;
		while(l<r){
		    if(arr[l]<0&&arr[r]<0){
		        l++;
		    }
		    else if(arr[l]>0&&arr[r]<0){
		        int t=arr[l];
		        arr[l]=arr[r];
		        arr[r]=t;
		        l++;
		        r--;
		    }
		    else if (arr[l]>0&&arr[r]>0){
		        
		        r=r-1;
		    }
		    else{
		        l++;
		        r--;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}}
		}
		
