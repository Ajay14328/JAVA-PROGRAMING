import java.util.Scanner;
public class Armstrong{
       
      public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("enter the string=");
        int n=input.nextInt();
        
         int sum=0;

         int ori=n;
          
          while(n>0){

                  int digit=n%10;
                       sum=sum+(digit*digit*digit);
                        n=n/10;
                   }
           if(ori==sum)
              System.out.println("armstrong"+sum);
           else
               System.out.println("not armstrong"+sum);

   }
}
        
