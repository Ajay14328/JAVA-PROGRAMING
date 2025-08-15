import java.util.Scanner;
public class martixtranspose{       //MATRIX TRANSPOSE  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        int [][] trans=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
      
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              trans[i][j]=arr[j][i];
            }
        }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            System.out.print(trans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
