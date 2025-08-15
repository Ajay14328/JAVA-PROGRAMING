import java.util.Scanner;

public class primenumber{

   public static void main(String[] args) {
    
         Scanner input=new Scanner(System.in);
         System.out.println("enter the number:");
         
         int num=input.nextInt();
         
         int count=0;

         for(int i=1; i<=num; i++){

         if( num%i == 0){
                 
                   count++;
       }
}

if(count==2){
  System.out.println(num + " is a prime");
}
else{
    System.out.println(num + "is not a prime");
   }
 }
}

