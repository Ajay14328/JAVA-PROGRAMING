
import java.util.Scanner;

public class mergetwoarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		  System.out.print("enter the size of array=");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++) {
	 	System.out.print("enter the element["+i+"]=");
	    	arr[i]=sc.nextInt();
	    }
	    int m=sc.nextInt();
	    int arr1[]=new int[m];
	    
	    for(int i=0;i<m;i++) {
	 	System.out.print("enter the element["+i+"]=");
	    	arr1[i]=sc.nextInt();
	    }
	    int size=n+m;
	    int merge []=new int[size];
	    for(int i=0;i<n;i++) {
	    	merge[i]=arr[i];
	    }
	    for(int j=0;j<m;j++) {
	    	merge[n+j]=arr1[j];
	    }
	    
	 
	    for(int num : merge) {
	    	System.out.print(num+" ");
	    }
	    
		} 

	}
