
import java.util.Arrays;
import java.util.Scanner;

public class twowordanagrams{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next();
		String t=sc.next();
		char[] arr1=s.toCharArray();
		char[] arr2=t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}