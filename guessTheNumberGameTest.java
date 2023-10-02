import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class guessTheNumberGameTest {
        private guessTheNumberGame game;

        @BeforeEach
    public void setUp() {

        game = new guessTheNumberGame();
        game.initializeGame();
    }

    @Test
    public void testCheckGuessCorrect() {
        int targetNumber = game.getTargetNumber();
        String result = game.checkGuess(targetNumber);
        assertEquals("¡Correcto!", result);
    }

    @Test
    public void testCheckGuessTooLow() {
        int targetNumber = game.getTargetNumber();
        String result = game.checkGuess(targetNumber - 1);
        assertEquals("Muy bajo. Sigue intentando.", result);
    }

    @Test
    public void testCheckGuessTooHigh() {
        int targetNumber = game.getTargetNumber();
        String result = game.checkGuess(targetNumber + 1);
        assertEquals("Muy alto. Sigue intentando.", result);
    }
}