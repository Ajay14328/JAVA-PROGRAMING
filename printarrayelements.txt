import java.util.Scanner;
public class leapyear{

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int [] a;
int n;
n=sc.nextInt();
a= new int[n];
for(int i=0;i<n;i++){

       a[i]=sc.nextInt();
    }

for(int i : a){
       System.out.println(i);
}
}
}
