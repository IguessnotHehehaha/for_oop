package prac_4;

public class App {

    public void getStatistics(Game g) {

        System.out.println("Collecting statistics");

        g.start();
        g.play();
        g.end();
    }
}
