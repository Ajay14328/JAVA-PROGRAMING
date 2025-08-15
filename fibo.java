import java.util.Scanner;
 public class fibo{
 
    public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    System.out.println("enter the number");
    int n=input.nextInt();
    
    int n1=0;
    int n2=1;

    for(int i=1;i<=n;i++){
        System.out.println(n1+ " ");
            int sum=n1+n2;
             n1=n2;
             n2=sum;
            }
             
}
}
             
           