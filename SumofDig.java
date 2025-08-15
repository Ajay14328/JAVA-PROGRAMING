public class SumofDig {
    public static void main(String[] args) {
        int n = 123;
        System.out.print(fun(n));
    }
    static int fun(int n) {
        if(n==0) return 0;
        return (n%10)+fun(n/10);
    }
}
