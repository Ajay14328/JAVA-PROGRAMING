import java.util.*; 
public class binsrc
{
 public static void main(String[] args)
{
   int[] arr={1,2,3,4,4,5};
   int target=4	;
   int start=0;
   Boolean res=false;
   int end=arr.length-1;
   while(start<=end){
       int midindex=(start+(end-start)/2);
          if(arr[midindex]==target){
                res=true;
               System.out.println(start);
               midindex+=1;
break;

               }
           else if(target>arr[midindex]){
                 start=midindex+1;
              }
            else if(target<arr[midindex]){
                  start=midindex-1;
             }
     
           }
if(res==false){
    System.out.println("not found");
}
}
}
   