package arthematic;
import java.util.Scanner;
import java.util.Arrays;
public class palindr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		  System.out.print("enter the number of terms=");
	    int n=sc.nextInt();
	    int sum=0,num=n;
	    while(n>0) {
	    	int temp=n%10;
	    sum=sum*10+temp;
	    	   n=n/10;
	    }
	    if(sum==num) {
	    System.out.println("palindrome"+sum);
	    }
	    else {
	    	  System.out.println("not"+sum);
		} 

	}
}