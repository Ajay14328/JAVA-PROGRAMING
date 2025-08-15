public class RevArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        recf(arr.length-1,arr);
    }
    static void recf(int n, int arr[]) {
        if(n<0) return;
        System.out.println(arr[n]);
        recf(n-1,arr);
    }
}