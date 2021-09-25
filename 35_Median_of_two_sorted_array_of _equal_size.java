/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.println("enter the size of the array ");
    int n=sc.nextInt();
    int A[]=new int [n];
    int B[]=new int[n];
    for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
        B[i]=sc.nextInt();
    }
    System.out.println("the arrays are ");
    for (int i=0;i<n; i++){
        System.out.print(A[i]+" ");
    }
    System.out.println();
    for (int i=0;i<n; i++){
        System.out.print(B[i]+" ");
    }
    System.out.println();
    int i=0;
    int j=0;
    int k=0;
    int C[]= new int [n+n];
    while(i<n&&j<n){
        if (A[i]>B[j]){
            C[k]=B[j];
            k++;
            j++;
        }
        else{
            C[k]=A[i];
            k++;
            i++;
        }
    }
    int m=n+n;
    int median=0;
    
        int d=C[m/2];
        int d1=C[m/2]-1;
         median=(d+d1)/2;
    System.out.print("the median of the merged array is "+"Median=");
    System.out.println(median);
	}}
