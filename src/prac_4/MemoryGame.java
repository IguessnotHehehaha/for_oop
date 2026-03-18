package prac_4;

public class MemoryGame implements IGame {

    @Override
    public void start() {
        System.out.println("MemoryGame started");
    }

    @Override
    public void play() {
        System.out.println("Playing MemoryGame");
    }

    @Override
    public void end() {
        System.out.println("MemoryGame ended");
    }

    @Override
    public void saveGame() {
        System.out.println("MemoryGame saved");
    }
}
