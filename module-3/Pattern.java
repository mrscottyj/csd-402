
public class Pattern {
    public static void main(String[] args) {
        // How many rows to print
        int rows = 7;
        
        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            
            // Print spaces at the beginning to center the pattern
            for (int space = 0; space < (rows - i) * 2; space++) {
                System.out.print(" ");
            }
            
            // Print numbers going up (1, 2, 4, 8, 16, etc)
            // These are powers of 2
            for (int j = 0; j < i; j++) {
                int number = (int)Math.pow(2, j);
                System.out.print(number + " ");
            }
            
            // Print numbers going back down
            // This makes the pattern go up then down
            for (int j = i - 2; j >= 0; j--) {
                int number = (int)Math.pow(2, j);
                System.out.print(number + " ");
            }
            
            // Print the @ symbol at the end and move to next line
            System.out.println("@");
        }
    }
}
 