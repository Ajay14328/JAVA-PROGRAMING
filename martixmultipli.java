import java.util.Scanner;
public class martixmultipli{       //MATRIX MULTPLICATION
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int rowA=sc.nextInt();
        int colsA=sc.nextInt();
          int rowB=sc.nextInt();
        int colsB=sc.nextInt();
        int [][] arr=new int[rowA][colsA];
         int [][] arr1=new int[rowB][colsB];
         int[][] mul=new int[colsA][rowB];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colsA;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colsB;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
       
         for(int i=0;i<rowA;i++){
            for(int j=0;j<colsB;j++){
             for(int k=0;k<colsA;k++){
                mul[i][j]+=arr[i][k]*arr1[k][j];
             }
                
            }
        }
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colsB;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
