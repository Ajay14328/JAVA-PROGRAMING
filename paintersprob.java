public class paintersprob{
    public static boolean possible(int arr[],int k,int max){
        int painter=1;
        int cunit=0;
        for(int unit:arr){
            if(unit>max){
                return false;
            }
            if(cunit+unit>max){
                painter++;
                cunit=unit;
                if(painter>k){
                    return false;
                }
            }
            else{
                cunit=cunit+unit;
            }
            }
            return painter<=k;
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
        int arr[]={5,3,10};
        int k=2;
        int max=0;
        for(int num:arr){
               max+=num;
        }
       System.out.println( possible(arr,k,max));
       System.out.println( findpages(arr,k));
        
    }
        
    }
   
        
    
