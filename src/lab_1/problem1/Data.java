package lab_1.problem1;

public class Data{
    private double sum;
    private double max;
    private int cnt;

    public Data() {
        sum = 0.0;
        max = Double.MIN_VALUE;
        cnt = 0;
    }

    public void add (double value){
        sum += value;
        cnt++;

        if(value >= max){
            max = value;
        }
    }

    public double getAvg() {
        if (cnt == 0) {
            return 0.0;
        }
        return sum / cnt;
    }

    public double getMax(){
        if(cnt == 0){
            return 0.0;
        }
        return max;
    }
}