public class vowelsinstring{
    public static void main(String []args){
        String s="happy to se you";
        int c=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case'a','e','i','o','u':
                c++;
                 System.out.println(s.charAt(i));
                }
            }  
           
        }
     
    }
