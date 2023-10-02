import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class guessTheNumberGame {
    public static Random random = new Random();
    public static int targetNumber;

    public static void main(String[] args) {
        initializeGame();
        playGame();
    }

    public static void initializeGame() {
        targetNumber = random.nextInt(100) + 1;
    }

    public static int getTargetNumber() {
        return targetNumber;
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1Attempts = new ArrayList<>();
        List<Integer> computerAttempts = new ArrayList<>();

        while (true) {

            System.out.print("Player 1 , adivina un número entre 1 y 100: ");
            int player1Guess = scanner.nextInt();
            player1Attempts.add(player1Guess);

            String result1 = checkGuess(player1Guess);

            System.out.println(result1);

            if (result1.equals("¡Correcto!")) {
                System.out.println("¡Player 1 ganó en " + player1Attempts.size() + " intentos!");
                showAttemps(player1Attempts, computerAttempts);
                break;
            }

            //Juega la PC
            int computerGuess = random.nextInt(100) + 1;
            computerAttempts.add(computerGuess);

            String result2 = checkGuess(computerGuess);

            System.out.println("La computadora adivinó " + computerGuess + ": " + result2);

            if (result2.equals("¡Correcto!")) {
                System.out.println("¡La computadora ganó en " + computerAttempts.size() + " intentos!");
                showAttemps(player1Attempts, computerAttempts);
                break;
            }
        }

        scanner.close();
    }

    public static String checkGuess(int guess) {
        if (guess == targetNumber) {
            return "¡Correcto!";
        } else if (guess < targetNumber) {
            return "Muy bajo. Sigue intentando.";
        } else {
            return "Muy alto. Sigue intentando.";
        }
    }

    private static void showAttemps(List<Integer> player1Attempts, List<Integer> computerAttempts) {
        System.out.println("Intentos de Jugador 1: " + player1Attempts);
        System.out.println("Intentos de la Computadora: " + computerAttempts);
    }
}