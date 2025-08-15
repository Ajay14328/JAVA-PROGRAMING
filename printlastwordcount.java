public class printlastwordcount{
    public static void main(String[] args){
        String str=" hello world ";
       System.out.println(lengthoflastword(str)); 
    }
    static int lengthoflastword(String str){

        String s=str.trim();
        
       int  count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
             
            count++;
            
            }
            else{
                break;
            }
            
        }
         return count;
         
        }

    }
