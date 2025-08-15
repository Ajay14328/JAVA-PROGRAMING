public class arraysum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target=7;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int sum=arr[start]+arr[end];
            if(sum==7){
                System.out.println("true");
                break;
            }
            else if(target<sum){
                end--;
            }
            else if(target>sum){
                start++;
            }
            else{
                System.out.println("false");
                break;
            }
        }
    }
    
}
