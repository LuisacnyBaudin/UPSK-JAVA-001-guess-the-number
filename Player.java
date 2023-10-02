import java.util.List;

public abstract class Player {
    protected String name;
    protected List<Integer> guesses;

    public Player(String name, List<Integer> guesses) {
        this.name = name;
        this.guesses = guesses;
    }

    public abstract int makeGuess();
}