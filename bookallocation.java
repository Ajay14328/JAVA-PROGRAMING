public class bookallocation{
    public static boolean possible(int arr[],int k,int maxpages){
        int stud=1;
        int cpages=0;
        for(int pages:arr){
            if(pages>maxpages){
                return false;
            }
            if(cpages+pages>maxpages){
                stud++;
                cpages=pages;
            }
            else{
                cpages=cpages+pages;
            }
            }
            return stud<=k;
        }
        public static int findpages(int arr[],int k){
            if(k>arr.length){
                return -1;
            }
            int low=0;
            int high=0;
            for(int i:arr){
                low=Math.max(low,i);
                high+=i;
            }
            int res=high;
            while(low<=high){
                int mid=(low+high)/2;
                if(possible(arr,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return res;
    }
         public static void main(String[] args){
        int arr[]={12,24,67,90};
        int k=3;
        int maxpages=0;
        for(int num:arr){
               maxpages+=num;
        }
       System.out.println( possible(arr,k,maxpages));
       System.out.println( findpages(arr, k));
        
    }
        
    }
   
        
    
