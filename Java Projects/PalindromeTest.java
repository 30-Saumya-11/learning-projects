public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println("=== Palindrome Number Checker Test ===");
        System.out.println();
        
        // Test cases
        int[] testNumbers = {121, 12321, 12345, 555, 1234, 1221, 1001, 999};
        
        for (int number : testNumbers) {
            boolean isPalindrome = checkPalindrome(number);
            System.out.print(number + " is ");
            if (isPalindrome) {
                System.out.println("a palindrome number.");
            } else {
                System.out.println("NOT a palindrome number.");
            }
        }
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