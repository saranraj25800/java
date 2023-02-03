import java.util.*;  
import java.util.Scanner;  
public class Main

{
	public static void main(String[] args) {
		int n,k,i,j,m;
	
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int[] array = new int[n]; 
		for(i=0;i<n;i++)
		{
		    array[i]=sc.nextInt();
		    
		}
		for(j=k-1;j>=0;j--)
		{
		    System.out.print(array[j]);
		}
		for(m=n;m>k;m--)
		{
		    System.out.print(array[m-1]);
		}
	   
	}
}
