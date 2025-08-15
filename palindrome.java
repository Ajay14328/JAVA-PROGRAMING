import java.util.Scanner;
  public class palindrome{
  
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.println("enter the number");
     int num=input.nextInt();
    
      int n=num;
      int sum=0;
          
        while(n>0){
                 int digit=n%10;
                     sum=sum*10+digit;
                     n=n/10;
             }
      if(sum == num){
         System.out.println(sum+ "is a palindrome");
     }
       else{
      System.out.println(sum+ "is not a palindrome");
         }
  }
}