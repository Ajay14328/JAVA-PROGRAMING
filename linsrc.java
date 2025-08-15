import java.util.*; 
public class binsrc
{
 public static void main(String[] args)
{
   int[] arr={1,2,3,4,5};
   int target=5;
   int start=0;
   Boolean res=false;
   int end=arr.length-1;
   while(start<=end){
       int midindex=(start+(end-start)/2;
          if(arr[midindex]==target){
                res==true;
               System.out.println("element found");
               break;
               }
           elseif(target>arr[midindex]){
                 start=midindex+1;
              }
            esleif(target<arr[midindex]){
                  start=midindex-1;
             }
     
           }
if(res==false){
    System.out.println("not found");
}
}
}
   