public class StarPyramid {
    public static void main(String[] args) {
        int rows = 8; // Number of rows in the pyramid
        
        System.out.println("Hash Pyramid Pattern:");
        System.out.println();
        
        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print hash symbols
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("#");
            }
            
            // Move to next line
            System.out.println();
        }
    }
} 