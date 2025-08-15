import java.util.Scanner;
public class martixdiaele{       //MATRIX DAIGNOLelements
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       
        for(int i=0;i<n;i++){
           
             System.out.println(arr[i][i]+ " ");
       
        }

         for(int i=0;i<n;i++){
           
            System.out.println(arr[i][n-1-i]+ " ");
       
        }
    }
}
