import java.util.List;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, List<Integer> guesses) {
        super(name, guesses);
    }

    @Override
    public int makeGuess() {

        return 0;
    }
}