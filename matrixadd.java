import java.util.Scanner;

public class matrixadd{

   public static void main(String[] args) {
    
         Scanner input=new Scanner(System.in);
         System.out.println("enter the numberof rows:");
         
         int rows=input.nextInt();
         System.out.println("enter the numberof cols:");
          int cols=input.nextInt();
       
           int[][] mat1=new int[rows][cols];
           int[][] mat2=new int[rows][cols];
           int[][] sum=new int[rows][cols];
       
         System.out.println("enter first matrix values");
       for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
              System.out.println("["+i+"]["+j+"]");
              mat1[i][j]=input.nextInt();
             }
      } 
       System.out.println("enter second matrix values");       
        for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
              System.out.println("["+i+"]["+j+"]");
              mat2[i][j]=input.nextInt();
             }
         } 
          
          for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
             sum[i][j]= mat1[i][j]+mat2[i][j];
             }
         } 
 System.out.println("enter sum matrix values");
 for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
              System.out.println( sum[i][j]+ " ");
             }
            System.out.println();
         } 
     } 
}