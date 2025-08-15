import java.util.Scanner;
public class stringpalin{
       
      public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("enter the string=");
         String s=input.nextLine();
          char arr[]=s.toCharArray();
            int len=arr.length; 
          int flag=1;
           
            for(int i=0;i<len;i++){
                if(arr[i]!=arr[len-i-1]){

                       flag=0;
                      break;
                      }
                    }
             if(flag==1) 
                    System.out.println("palindrome");
             else
                    System.out.println("not a palindrome");
              }
}      

        
        
