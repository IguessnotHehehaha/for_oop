package lab2.problem4;

public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return 1.0 / (1.0 / first.getResistance() + 1.0 / second.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.potentialDifference = v;
        first.applyPotentialDiff(v);
        second.applyPotentialDiff(v);
    }
}
