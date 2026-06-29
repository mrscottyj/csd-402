// Rock Paper Scissors Game
// Scott
// Module 2.2 Assignment
// June 22, 2026
 
import java.util.Random;
import java.util.Scanner;
 
public class RockPaperScissors {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Get computer and user choices
        int computer = random.nextInt(3) + 1;
        System.out.print("Enter 1 for Rock, 2 for Paper, 3 for Scissors: ");
        int user = scanner.nextInt();
        
        // Convert to names
        String[] choices = {"", "Rock", "Paper", "Scissors"};
        String computerName = choices[computer];
        String userName = choices[user];
        
        // Display selections
        System.out.println("\nComputer: " + computerName);
        System.out.println("You: " + userName);
        
        // Determine winner
        if (computer == user) {
            System.out.println("It's a tie!");
        } else if ((computer == 1 && user == 3) || 
                   (computer == 2 && user == 1) || 
                   (computer == 3 && user == 2)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("You win!");
        }
        
        scanner.close();
    }
}
 