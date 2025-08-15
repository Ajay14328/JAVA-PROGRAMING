import java.util.Scanner; 
import java.util.Arrays; 
public class FirstNonRepeatedCharacter
{ public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the string:");
String myStr = input.nextLine();
String str[] = myStr.split(" ");
Arrays.sort(str);
System.out.println(Arrays.toString(str));
int max = 0;
int count= 1;
String word = str[0];
String current = str[0];
for(int i = 1; i<str.length;i++)
{
if(str[i].equals(current))
{
count++;
}
else
{
count =1;
current = str[i];
}
if(max<count){
max = count;
word = str[i];
}
}
System.out.println("the first non-reapted charcter " + word);

}
}

