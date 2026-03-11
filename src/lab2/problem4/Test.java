package lab2.problem4;

public class Test {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent Resistance: " + String.format("%.2f", R) + " Ohms");

        double voltage = 12.0;
        circuit.applyPotentialDiff(voltage);

        System.out.println("Applied Voltage: " + voltage + " V");
        System.out.println("Total Current: " + String.format("%.4f", circuit.getCurrent()) + " A");
        System.out.println("Total Power: " + String.format("%.4f", circuit.getPower()) + " W");

        System.out.println("\n Branch Details");
        System.out.println("Series(a,b) resistance: " + String.format("%.2f", f.getResistance()) + " Ohms");
        System.out.println("Series(a,b) voltage:    " + String.format("%.4f", f.getPotentialDiff()) + " V");

        System.out.println("Parallel(c,d) resistance: " + String.format("%.2f", g.getResistance()) + " Ohms");
        System.out.println("Parallel(c,d) voltage:    " + String.format("%.4f", g.getPotentialDiff()) + " V");

        System.out.println("Series(g,e) resistance: " + String.format("%.2f", h.getResistance()) + " Ohms");
        System.out.println("Series(g,e) voltage:    " + String.format("%.4f", h.getPotentialDiff()) + " V");

        System.out.println("\nSimple Series Test");
        Circuit r1 = new Resistor(4.0);
        Circuit r2 = new Resistor(6.0);
        Circuit series = new Series(r1, r2);
        series.applyPotentialDiff(10.0);
        System.out.println("Series 4+6 Ohm, 10V");
        System.out.println("Resistance: " + series.getResistance() + " Ohms");
        System.out.println("Current: " + series.getCurrent() + " A");
        System.out.println("R1 voltage: " + r1.getPotentialDiff() + " V");
        System.out.println("R2 voltage: " + r2.getPotentialDiff() + " V");

        System.out.println("\nParallel Test");
        Circuit r3 = new Resistor(4.0);
        Circuit r4 = new Resistor(4.0);
        Circuit parallel = new Parallel(r3, r4);
        parallel.applyPotentialDiff(8.0);
        System.out.println("Parallel 4||4 Ohm, 8V");
        System.out.println("Resistance: " + parallel.getResistance() + " Ohms");
        System.out.println("Current: " + parallel.getCurrent() + " A");
        System.out.println("R3 voltage: " + r3.getPotentialDiff() + " V");
        System.out.println("R4 voltage: " + r4.getPotentialDiff() + " V");
    }
}
