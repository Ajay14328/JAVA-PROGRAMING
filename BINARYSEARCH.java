public class BINARYSEARCH{
    public static void main(String [] args){
        int[] arr={0,1,2,2,3,3,3,4,4};
        int n=arr.length-1;
        int start=0;
        int m=3;
        int index=0;
      while(start<=n){
        int mid=(start+n)/2;
        if(arr[mid]==m){
            index=mid;
            n=mid-1;

        }
        else if(arr[mid]<m){
            start=mid+1;
        }
        else {
            n=mid-1;
        }

        
      }
      System.out.println(index);
    }

}