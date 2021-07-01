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
		int c0=0;
		int c1=0;
		int c2=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==0){
		        c0++;
		    }
		    if(arr[i]==1){
		        c1++;
		    }
		    if(arr[i]==2){
		        c2++;
		    }
		}
		int i=0;
		while(c0>0){
		    arr[i]=0;
		    i++;
		    c0--;
		 }
		 while(c1>0){
		     arr[i]=1;
		     i++;
		     c1--;
		 }
		while(c2>0){
		    arr[i]=2;
		    i++;
		    c2--;
		}
		System.out.println("");
		System.out.println("THE ARRAY AFTER MODIFICATION LOOKS LIKE");
		for(int j=0;j<n;j++){
		    System.out.print(arr[j]+" ");
		}
		
	}}
		
		
		
		
		
		
