
import java.util.Scanner;
public class arrayinsdele {

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
	    int m =sc.nextInt();
	    for(int j=m;j<n-1;j++) {
	    	arr[j]=arr[j+1];
	    	
	    }
	    n--;
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
		} 

	}