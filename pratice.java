import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      String [] s={"even","odd"};
          System.out.println(s[n%2]);
                
    }
}