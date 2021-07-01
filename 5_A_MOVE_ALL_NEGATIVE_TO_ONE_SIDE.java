/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
THE SPACE COMPLEXITY OF THIS PROGRAM IS O(N) 
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
		int cn=0;
		int cp=0;
		for(int i=0;i<n;i++){
		    if(arr[i]<0){
		        cn++;
		    }
		    else{
		        cp++;
		    }
		  }
		  int p=0;
		  int q=cn;
		  int arr1[]=new int[n];
		  for(int i=0;i<n;i++){
		      if(arr[i]<0){
		          arr1[p]=arr[i];
		          p++;
		      }
		      else{
		          arr1[q]=arr[i];
		          q++;
		      }
		  }
		  System.out.println("ARRAY AFTER MODIFICATION IS");
		  for(int i=0;i<n;i++){
		      System.out.print(arr1[i]+" ");
		  }
	}
}
