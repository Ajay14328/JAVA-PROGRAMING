import java.util.Scanner;
public class comp{
  public static void main(String[] args){
     Scanner input=new Scanner(System.in);
    System.out.println("enter the number=");
      int n=input.nextInt();
    int flag=0;
      
      for(int i=2;i<n/2;i++){
        if(n%i==0){
             flag=1;
             break;
}
}
if(flag==1)
System.out.println(n+ "is composite");
else
System.out.println(n+ "is not composite");
}
}
       