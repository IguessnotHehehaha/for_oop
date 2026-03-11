package lab2.problem4;

public abstract class Circuit {
    public abstract double getResistance();

    public abstract double getPotentialDiff();

    public abstract void applyPotentialDiff(double v);

    public double getCurrent(){
        return getPotentialDiff() / getResistance();
    }

    public double getPower(){
        double v = getPotentialDiff();
        return (v * v)/getResistance();
    }
}
