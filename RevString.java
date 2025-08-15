import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        recf(s, s.length()-1);
    }
    static void recf(String s, int ind) {
        if(ind<0) return;
        System.out.print(s.charAt(ind));
        recf(s,ind-1);
    }
}
