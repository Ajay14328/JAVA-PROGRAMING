import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        char[] vowels = new char[input.length()];
        char[] consonants = new char[input.length()];
         int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();
           char arr[]=input.toCharArray();
            int len=arr.length; 


        for (int i = 0; i < len; i++) {
            char ch = arr[i];

          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels[vowelCount]=ch;
                vowelCount++;
            }
           
            else  {
                consonants[consonantCount]=ch;

                consonantCount++;
            }
        }

         System.out.print("Vowels: ");
        for (int i = 0; i < vowelCount; i++) {
            System.out.print(vowels[i] + " ");
        }
        System.out.println("\nNumber of vowels: " + vowelCount);

        System.out.print("Consonants: ");
        for (int i = 0; i < consonantCount; i++) {
            System.out.print(consonants[i] + " ");
        }
        System.out.println("\nNumber of consonants: " + consonantCount);
  

        scanner.close();
    }
}
