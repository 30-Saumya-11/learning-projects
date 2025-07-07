import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Palindrome Number Checker ===");
        System.out.print("Enter a number: ");
        
        // Get input from user
        int number = scanner.nextInt();
        int originalNumber = number;
        
        // Check if the number is palindrome
        boolean isPalindrome = checkPalindrome(number);
        
        // Display result
        System.out.println();
        if (isPalindrome) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is NOT a palindrome number.");
        }
        
        scanner.close();
    }
    
    // Method to check if a number is palindrome
    public static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        
        // Check if original number equals reversed number
        return originalNumber == reversedNumber;
    }
} 