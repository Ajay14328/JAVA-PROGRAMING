import java.util.Scanner;

public class ocuuranceofelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={2,5,3,5,7,8};
		int n=arr.length;
		int count=0;
		int m=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==m){
				count++;
			}
			}
			System.out.print(count);
		}
		
	}
