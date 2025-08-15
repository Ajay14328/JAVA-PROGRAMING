package arthematic;
import java.util.Scanner;
public class arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		  System.out.print("enter the size of array=");
	    int n=sc.nextInt();
	    int arr[]=new int[n+1];
	    
	    for(int i=0;i<n;i++) {
	 	System.out.print("enter the element["+i+"]=");
	    	arr[i]=sc.nextInt();
	    }
	   int start=0,end=n-1;
	   while(start<end) {
		   int temp=arr[start];
		   arr[start]=arr[end];
		   arr[end]=temp;
		   start++;
		   end--;
	   }
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
		} 

	}