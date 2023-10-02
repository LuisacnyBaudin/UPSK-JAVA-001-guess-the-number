import java.util.List;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name, List<Integer> guesses) {
        super(name, guesses);
    }

    @Override
    public int makeGuess() {

        return 0;
    }
}