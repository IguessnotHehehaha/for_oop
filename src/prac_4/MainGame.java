package prac_4;

public class MainGame {
    public static void main(String[] args) {

        App app = new App();

        Game logicGame = new LogicGame();
        Game memoryGame = new MemoryGame();

        app.getStatistics(logicGame);
        app.getStatistics(memoryGame);
    }
}
