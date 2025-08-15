import java.util.Scanner;
public class harshadnum{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        while(n>0){
            int temp=n%10;
              sum+=temp;
              n=n/10;
        
        }
        if(num%sum==0){
            System.out.println("harshad");
        }
        else{
             System.out.println("not harshad");
        }

    }
}