public class CountDig {
    public static void main(String[] args) {
        int n =12345;
        System.out.print(fun(n));
    }
    static int fun(int n) {
        if(n==0) return 0;
        return 1+fun(n/10);
    }
}