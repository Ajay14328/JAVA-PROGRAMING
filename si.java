import java.util.Scanner;
 
  public class si{
 
  public static void main(String[] args) {
   
  Scanner input=new Scanner(System.in);

  System.out.println("enter the amount");
  int A=input.nextInt();
  System.out.println("enter the number of month");
   int Y=input.nextInt();
   System.out.println("enter the intrest rate");
int R=input.nextInt();
  
  int rate;
  rate=(A*Y*R)/100;

   System.out.println(rate);
}
}
