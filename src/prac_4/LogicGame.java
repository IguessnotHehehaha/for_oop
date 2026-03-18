package prac_4;

public class LogicGame implements Game {

    @Override
    public void start() {
        System.out.println("LogicGame started");
    }

    @Override
    public void play() {
        System.out.println("Playing LogicGame");
    }

    @Override
    public void end() {
        System.out.println("LogicGame ended");
    }
}
