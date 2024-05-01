
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] options = { "rock", "paper", "scissors" };

        System.out.println("Let's play Rock, Paper, Scissors!");
        while (true) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String playerMove = input.nextLine().toLowerCase();
            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }
            int computerMoveIndex = rand.nextInt(3);
            String computerMove = options[computerMoveIndex];
            System.out.println("Computer played " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("Tie!");
            } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
                    playerMove.equals("paper") && computerMove.equals("rock") ||
                    playerMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            System.out.println("Score: You " + playerScore + ", Computer " + computerScore);
            System.out.print("Play again? (y/n): ");
            String playAgain = input.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
