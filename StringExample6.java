//Write a program to reverse a string.
import java.util.Scanner;

public class StringExample6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string:");
        System.out.println(reversedString);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move start and end pointers towards each other
            start++;
            end--;
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
