import java.util.Scanner;
	public class prime {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in); 
			  System.out.print("enter the number of terms=");
		    int n=sc.nextInt();
		    int count=0;
		   for (int i=2;i<n/2;i++) {
			   if(n%i==0) {
				   count++;
				   break;
			   }
			   }
		   if(count==0) {
			   System.out.println("prime numbe");
		} else{
			   System.out.println("mot a primer");
				   
		   }
		   
		}
	}
	