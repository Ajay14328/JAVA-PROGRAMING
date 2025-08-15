import java.util.Arrays;
public class dutch {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,0,2,0};
        int l=0,r=arr.length-1;
        int m=0;
        while(l<r){
            if(arr[m]==0){
                int temp=arr[l];
                arr[l]=arr[m];
                arr[m]=temp;

                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else{
                int temp=arr[r];
                arr[r]=arr[m];
                arr[m]=temp;
                r--;
            }
    }
    
    System.out.println(Arrays.toString(arr));
}
}