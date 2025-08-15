import java.util.Scanner;
Class Rev
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
